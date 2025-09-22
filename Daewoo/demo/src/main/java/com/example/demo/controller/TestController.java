package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final MemberRepository memberRepository;

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
    @GetMapping("/members")
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }
}
