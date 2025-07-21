package com.mjc813.mpacrud.animal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimalController {

    @GetMapping("/animal/a") // 주소창에 localhost:포트번호 뒤에 입력하면 해당 화면으로 이동
    // 클라이언트의 요청 url 주소와 method
    // 주소창에 값을 넣기 때문에 보안에 약함 -> 데이터를 읽을 때 주로 사용
    public String testA(Model model
            , @RequestParam("name1") String name1 // @RequestParam : http 클라이언트에서 보낸 변수=값 형태를 받아들일수 있다.
            , @RequestParam("name2") String name2
            , @RequestParam("n3") String nm3
    ) {
        model.addAttribute("name1", "name1"); // 화면텝플릿의 name1 이라는 키단어를 name1 변수값으로 치환한다.
        model.addAttribute("name2", "name2"); // 화면텝플릿의 name2 이라는 키단어를 name2 변수값으로 치환한다.
        model.addAttribute("n3", "nm3"); // 화면텝플릿의 n3 이라는 키단어를 nm3 변수값으로 치환한다.
        return "/a"; // src/main/resources/ root 폴더 기준의 a.html 파일 전체 경로 (화면 템플릿 출력)
    }

    @PostMapping("/animal/addview")
    public String addView() {
        return "/animal/addview";
    }

    @PostMapping("/animal/insert")
    public String insert(@RequestParam("name") String name
            , @RequestParam("age") String age
            , @RequestParam("kind") String kind) {
        // 화면에서 받은 값을 DB까지 저장해야 한다.
        // 화면에서 전달 받은 값이 유효한지 valid 체크 해야한다.
        return "redirect:/"; // 리다이렉트는 모델 변수 없어도 됨
    }

}
