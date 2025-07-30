package com.mjc813.cinema_crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController { // 화면을 그릴 때
    @GetMapping("/cinema")
    public String cinemaHome() {
        return "cinema"; // templates 폴더 바로 밑에 파일이 있기 때문에 그냥 파일명만 적으면 됨
    }
}
