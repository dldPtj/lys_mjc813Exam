package com.mjc813.start_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String intro(@RequestParam("name") String name, Model model) {
        // 화면 템플릿 파일의 경로를 리턴한다.
        System.out.println("hello ; " + name);
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/hello2/{name1}")
    public String intro(@PathVariable("name1") String name) {
        // 화면 템플릿 파일의 경로를 리턴한다.
        System.out.println("hello2 ; " + name);
        return "hello";
    }
    @GetMapping("/currentTime")
    public String currentTime(@RequestParam("time") String time, Model model) {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        출처: https://hianna.tistory.com/607
        System.out.println("currentTime ; " + time);
        model.addAttribute("time", formatedNow);
        return "currentTime";
    }
    @GetMapping("/gugudan")
    public String gugudan(@RequestParam("num") String num, Model model) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                num += i+"단 "+i+"X"+j+"="+i*j+"<br/>"; // gugudan.mustache에서 java의 html태그가 사용되려면 중괄호 3개
            }
        }
        System.out.println("gugudan ; " + num);
        model.addAttribute("num", num);
        return "gugudan";
    }

    @GetMapping("/gugudan2/{i}")
    public String gugudan(@PathVariable("i") String res) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                res += i+"단 "+i+"X"+j+"="+i*j+"<br/>"; // gugudan.mustache에서 java의 html태그가 사용되려면 중괄호 3개
            }
        }
        System.out.println("gugudan2 ; " + res);
        return "gugudan";
    }
}
