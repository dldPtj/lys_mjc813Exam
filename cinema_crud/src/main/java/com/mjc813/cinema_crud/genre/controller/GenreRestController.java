package com.mjc813.cinema_crud.genre.controller;

import com.mjc813.cinema_crud.common.ResponseDto;
import com.mjc813.cinema_crud.genre.dto.GenreDto;
import com.mjc813.cinema_crud.genre.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genre")
public class GenreRestController {
    @Autowired
    private GenreService genreService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody GenreDto dto){
        try {
            this.genreService.insert(dto);
            ResponseDto result = ResponseDto.builder()
                    .message("Success")
                    .resultCode(50010)
                    .build();
            return ResponseEntity.ok(result);
        } catch (Throwable e) {
            ResponseDto result = ResponseDto.builder()
                    .message("Error")
                    .resultCode(90000)
                    .build();
            return ResponseEntity.status(500).body(result); // 500 코드는 http 응답 코드
        }
    }
}
