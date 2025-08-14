package com.mjc813.springbootwebprj.genre.controller;

import com.mjc813.springbootwebprj.common.CommonRestController;
import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.common.ResponseEnum;
import com.mjc813.springbootwebprj.common.exception.MyDataNotFoundException;
import com.mjc813.springbootwebprj.common.exception.MyRequestException;
import com.mjc813.springbootwebprj.genre.dto.GenreDto;
import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import com.mjc813.springbootwebprj.genre.dto.IGenre;
import com.mjc813.springbootwebprj.genre.service.GenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/genre")
public class GenreRestController extends CommonRestController {
    @Autowired
    private GenreService genreService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody GenreDto dto) {
        try {
            IGenre igenre = this.genreService.insert(dto);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", igenre);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.INSERT_ERROR, "ERROR", dto);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@PathVariable("id") Long id, @RequestBody GenreDto dto) {
        try {
            if ( dto.getId() == null || !id.equals(dto.getId()) ) {
                return getResponseEntity(ResponseEnum.REQUEST_ERROR, "ERROR", id);
            }
            IGenre igenre = this.genreService.update(dto);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", igenre);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", dto);
        } catch (MyDataNotFoundException e) {
            return getResponseEntity(log, e, ResponseEnum.DATA_NOT_FOUND, "ERROR", dto);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.UPDATE_ERROR, "ERROR", dto);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            this.genreService.deleteById(id);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", id);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", id);
        } catch (MyDataNotFoundException e) {
            return getResponseEntity(log, e, ResponseEnum.DATA_NOT_FOUND, "ERROR", id);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.DELETE_ERROR, "ERROR", id);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            IGenre iFind = this.genreService.findById(id);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", iFind);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", id);
        } catch (MyDataNotFoundException e) {
            return getResponseEntity(log, e, ResponseEnum.DATA_NOT_FOUND, "ERROR", id);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.SELECT_ERROR, "ERROR", id);
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findByNameContains(@RequestParam String name, Pageable pageable) {
        try {
            Page<GenreEntity> list = this.genreService.findByNameContains(name, pageable);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", list);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", null);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.SELECT_ERROR, "ERROR", null);
        }
    }
}
