package com.mjc813.mpacrud.animal.controller;

import com.mjc813.mpacrud.animal.dto.AnimalDto;
import com.mjc813.mpacrud.animal.mybatis.AnimalMybatisMapper;
import com.mjc813.mpacrud.animal.service.AnimalService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AnimalController {
//    @Autowired
//    private AnimalMybatisMapper animalMapper; // 사용가능하더라도 추천 X
    @Autowired //스프링프레임워크가 객체를 인스턴스(생성)해준다.
    private AnimalService animalService;

    @GetMapping("/animal/a") // 주소창에 localhost:포트번호 뒤에 입력하면 해당 화면으로 이동
    // 클라이언트의 요청 url 주소와 method
    // 주소창에 값을 넣기 때문에 보안에 약함 -> 데이터를 읽을 때 주로 사용
    public String testA(Model model
            , @PathParam("name1") String name1 // @RequestParam : http 클라이언트에서 보낸 변수=값 형태를 받아들일수 있다.
            , @PathParam("name2") String name2
            , @PathParam("n3") String nm3
    ) {
        model.addAttribute("name1", name1); // 화면텝플릿의 name1 이라는 키단어를 name1 변수값으로 치환한다.
        model.addAttribute("name2", name2); // 화면텝플릿의 name2 이라는 키단어를 name2 변수값으로 치환한다.
        model.addAttribute("n3", nm3); // 화면텝플릿의 n3 이라는 키단어를 nm3 변수값으로 치환한다.
        return "/a"; // src/main/resources/ root 폴더 기준의 a.html 파일 전체 경로 (화면 템플릿 출력)
    }

    @GetMapping("/animal/{name1}/{name2}/{n3}")    // 클라이언트의 요청 url 주소와 method
    public String testB(Model model
            , @PathVariable("name1") String name1   // @RequestParam : http 클라이언트에서 보낸 변수=값 형태를 받아들일수 있다.
            , @PathVariable("name2") String name2
            , @PathVariable("n3") String nm3
    ) {
        model.addAttribute("name1", name1); // 화면텝플릿의 name1 이라는 키단어를 name1 변수값으로 치환한다.
        model.addAttribute("name2", name2); // 화면텝플릿의 name2 이라는 키단어를 name2 변수값으로 치환한다.
        model.addAttribute("nam3", nm3); // 화면텝플릿의 nam3 이라는 키단어를 nm3 변수값으로 치환한다.
        return "/a";    // src/main/resources/ 화면템플릿 root 폴더 기준의 a.html 파일 전체 경로 (화면)
    }

    @GetMapping("/animal/addview")
    public String addView() {
        return "/animal/addview";
    }

    @PostMapping("/animal/insert")
    public String insert(@ModelAttribute AnimalDto animal
//            @RequestParam("name") String name // POST 방식의 데이터 전달은 @ModelAttribute로 받을 수 있으므로 추천 X
//            , @RequestParam("age") Integer age
//            , @RequestParam("kind") String kind
//            , @RequestParam("legs")
           ) {
        // 화면에서 받은 값을 DB까지 저장해야 한다.
        // 화면에서 전달 받은 값이 유효한지 valid 체크 해야한다.
//        AnimalDto animal = AnimalDto.builder()
//                .name(name)
//                .age(age)
//                .kind(kind).build();
//        AnimalDto animal2 = new AnimalDto(0L, name, age, kind);
//        this.animalMapper.insertAnimal(animal); // mybatismapper를 바로 호출하는 방법은 추천하지 않는다.
//        this.animalService.insert(animal);
        try {
            this.animalService.insert(animal);
        } catch (Throwable th) {
            System.err.println(th.toString());
        }
        return "redirect:/"; // 리다이렉트는 모델 변수 없어도 됨
    }
    // 컨트롤러는 무조건 String으로 리턴
    @GetMapping("/animal/list")
    public String list(Model model) {
        try {
            List<AnimalDto> all = this.animalService.findAll();
            model.addAttribute("listWord", all);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "/animal/list";
    }

    @GetMapping("/animal/view")
    public String view1(Model model
            , @RequestParam("id") Long id) {
        try {
            AnimalDto byId = this.animalService.findById(id);
            model.addAttribute("data", byId);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "/animal/view";
    }

    @GetMapping("/animal/modify")
    public String modify(Model model
            , @RequestParam("id") Long id) {
        try {
            AnimalDto byId = this.animalService.findById(id);
            model.addAttribute("data", byId);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "/animal/modify";
    }

    @PostMapping("/animal/update")
    public String update(@ModelAttribute AnimalDto dto) {
        try {
            this.animalService.update(dto);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "redirect:/animal/list";
    }

}
