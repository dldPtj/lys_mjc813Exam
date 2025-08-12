package com.mjc813.springbootwebprj.song.service;

import com.mjc813.springbootwebprj.common.ResponseDto;
import com.mjc813.springbootwebprj.genre.dto.GenreEntity;
import com.mjc813.springbootwebprj.song.dto.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, Long> {

}
