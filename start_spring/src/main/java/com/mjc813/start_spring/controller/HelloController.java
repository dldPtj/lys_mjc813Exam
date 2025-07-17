package com.mjc813.start_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
// @RequestMapping("/공통된경로") 사용하면 GetMapping에 경로를 다 적지 않아도 된다.
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
    public String gugudan(@RequestParam("num") Integer number, Model model) { // Request는 ?num=9 사용가능
        List<String> arr = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            arr.add(String.format("%d X %d = %d", number, i, number*i));
            // i+"단 "+i+"X"+j+"="+i*j+"<br/>";
            // gugudan.mustache에서 java의 html태그가 사용되려면 중괄호 3개
        }
        model.addAttribute("number", number);
        model.addAttribute("arr", arr);
        return "gugudan";
    }

    @GetMapping("/gugudan2/{num}")
    public String gugudan2(@PathVariable("num") Integer number, Model model) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            arr.add(String.format("%d X %d = %d", number, i, number*i));
            // i+"단 "+i+"X"+j+"="+i*j+"<br/>";
            // gugudan.mustache에서 java의 html태그가 사용되려면 중괄호 3개
        }
        model.addAttribute("number", number);
        model.addAttribute("arr", arr);
        return "gugudan";
    }
}
