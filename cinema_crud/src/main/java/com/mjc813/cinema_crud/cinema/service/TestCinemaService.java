package com.mjc813.cinema_crud.cinema.service;
import com.mjc813.cinema_crud.cinema.dto.CinemaDto;
import org.junit.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@Slf4j
//@ActiveProfileTest("test")
@SpringBootTest
public class TestCinemaService {
    @Autowired
    private CinemaService cinemaService;

    private CinemaDto cinemaDto;

    public void initData(){
        this.cinemaDto = CinemaDto.builder().id(-1L).name()
    }
    @Test
    @Order(1)
    public void insertTest() {
        this.cinemaService.insertCinema(this.cinemaDto);
    }

    @Test
    @Order(2)
    public void updateTest() {

    }

    @Test
    @Order(3)
    public void deleteTest() {

    }
}
