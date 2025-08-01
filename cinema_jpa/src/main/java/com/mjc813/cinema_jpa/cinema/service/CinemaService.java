package com.mjc813.cinema_jpa.cinema.service;

import com.mjc813.cinema_jpa.cinema.dto.CinemaDto;
import com.mjc813.cinema_jpa.cinema.dto.CinemaEntity;
import com.mjc813.cinema_jpa.cinema.dto.CinemaGenreDto;
import com.mjc813.cinema_jpa.genre.dto.GenreDto;
import com.mjc813.cinema_jpa.genre.dto.GenreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public void insertCinema(CinemaDto dto) {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setId(dto.getGenreId());

        CinemaEntity cinemaEntity = new CinemaEntity();
        cinemaEntity.setGenre(genreEntity);
        cinemaEntity.copyMembers(dto);
        this.cinemaRepository.save(cinemaEntity);
    }

    @Transactional
    public void insertCinemaWithGenre(CinemaGenreDto dto) {

    }
}
