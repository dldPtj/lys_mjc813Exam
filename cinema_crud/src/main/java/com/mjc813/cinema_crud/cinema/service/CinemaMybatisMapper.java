package com.mjc813.cinema_crud.cinema.service;

import com.mjc813.cinema_crud.cinema.dto.CinemaDto;
import com.mjc813.cinema_crud.cinema.dto.CinemaGenreDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CinemaMybatisMapper {
    public void insertCinema(CinemaDto dto);
    public List<CinemaGenreDto> findByWhere();
    public CinemaDto findById(Long id);
}
