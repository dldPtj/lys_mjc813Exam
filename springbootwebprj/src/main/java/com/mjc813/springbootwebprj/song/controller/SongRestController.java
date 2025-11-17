package com.mjc813.springbootwebprj.song.controller;

import com.mjc813.springbootwebprj.common.CommonRestController;
import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.common.ResponseEnum;
import com.mjc813.springbootwebprj.common.exception.MyDataNotFoundException;
import com.mjc813.springbootwebprj.common.exception.MyRequestException;
import com.mjc813.springbootwebprj.song.dto.ISong;
import com.mjc813.springbootwebprj.song.dto.SongDto;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import com.mjc813.springbootwebprj.song.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController extends CommonRestController {
    @Autowired
    private SongService songService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody SongDto dto) {
        try {
            ISong isong = this.songService.insert(dto);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", isong);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.INSERT_ERROR, "ERROR", dto);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(
            @PathVariable Long id
            , @Validated @RequestBody SongDto dto) {
        try {
            if ( dto.getId() == null || !id.equals(dto.getId()) ) {
                return getResponseEntity(ResponseEnum.REQUEST_ERROR, "ERROR", id);
            }
            ISong iSong = this.songService.update(dto);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", iSong);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", id);
        } catch (MyDataNotFoundException e) {
            return getResponseEntity(log, e, ResponseEnum.DATA_NOT_FOUND, "ERROR", id);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.UPDATE_ERROR, "ERROR", id);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            ISong find = this.songService.deleteById(id);
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
            ISong find = this.songService.findById(id);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", find);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", id);
        } catch (MyDataNotFoundException e) {
            return getResponseEntity(log, e, ResponseEnum.DATA_NOT_FOUND, "ERROR", id);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.SELECT_ERROR, "ERROR", id);
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findByTitleContainsAndArtistContains(
            @RequestParam("title") String title
            , @RequestParam("artist") String artist
            , Pageable pageable
    ) {
        try {
            Page<ISong> list = this.songService.findByTitleContainsAndArtistContains(title, artist, pageable);
            return getResponseEntity(ResponseEnum.SUCCESS, "OK", list);
        } catch (MyRequestException e) {
            return getResponseEntity(log, e, ResponseEnum.REQUEST_ERROR, "ERROR", null);
        } catch (Throwable e) {
            return getResponseEntity(log, e, ResponseEnum.SELECT_ERROR, "ERROR", null);
        }
    }
}
