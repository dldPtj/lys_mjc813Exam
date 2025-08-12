package com.mjc813.springbootwebprj.song.controller;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import com.mjc813.springbootwebprj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository songRepository;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("SUCCESS")
                            .resultData(entity).build()
            );
        } catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("SUCCESS")
                            .resultData(entity).build()
            );
        } catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        try {
            this.songRepository.deleteById(id);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("SUCCESS")
                            .resultData(id).build()
            );
        } catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(id).build()
            );
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            Optional<SongEntity> find = this.songRepository.findById(id);
            if (find.isPresent()) {
                return ResponseEntity.ok().body(
                        ResponseDto.builder().resultCode(999).message("SUCCESS")
                        .resultData(id).build());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch(Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(id).build()
            );
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findByTitleContains(@RequestParam String title, Pageable pageable) {
        try {
            Page<SongEntity> list = this.songRepository.findByTitleContains(title, pageable);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("SUCCESS")
                            .resultData(list).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(null).build()
            );
        }
    }

//    @GetMapping("")
//    public ResponseEntity<ResponseDto> findByArtistContains(@RequestParam String name, Pageable pageable) {
//        try {
//            Page<SongEntity> list = this.songRepository.findByArtistContains(name, pageable);
//            return ResponseEntity.ok().body(
//                    ResponseDto.builder().resultCode(999).message("SUCCESS")
//                            .resultData(list).build()
//            );
//        } catch (Throwable e) {
//            log.error(e.toString());
//            return ResponseEntity.status(500).body(
//                    ResponseDto.builder().resultCode(999).message("ERROR")
//                            .resultData(null).build()
//            );
//        }
//    }
}
