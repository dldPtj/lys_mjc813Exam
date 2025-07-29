package com.mjc813.swimcrud.swimpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/swimpool")
    public String swimpoolMenu() {
        return "/swimpool/list";
    }
}
