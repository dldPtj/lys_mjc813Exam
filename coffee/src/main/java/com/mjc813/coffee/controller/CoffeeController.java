package com.mjc813.coffee.controller;

import com.mjc813.coffee.dto.CoffeeDto;
import com.mjc813.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/coffee/view")
    public String viewCoffee(Model model
            , @RequestParam("id") Long id) {
        try {
            CoffeeDto byId = this.coffeeService.findById(id);
            model.addAttribute("data", byId);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "/coffee/view";
    }

    @GetMapping("/coffee/addview")
    public String addView() {
        return "/coffee/addview";
    }

    @PostMapping("/coffee/insert")
    public String coffee(@ModelAttribute CoffeeDto coffee) {
        try {
            this.coffeeService.insert(coffee);
            // model.addAttribute 하면 재사용이 안 좋기 때문에 추천 X
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "redirect:/coffee/list";
    }

    @GetMapping("/coffee/list")
    public String list(Model model) {
        try {
            List<CoffeeDto> all = this.coffeeService.findAll();
            model.addAttribute("listWord", all);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "/coffee/list";
    }

    @GetMapping("/coffee/modify")
    public String modify(Model model
            , @RequestParam("id") Long id) {
        try {
            CoffeeDto byId = this.coffeeService.findById(id);
            model.addAttribute("data", byId);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "coffee/modify";
    }

    @PostMapping("/coffee/update")
    public String update(@ModelAttribute CoffeeDto coffee) {
        try {
            this.coffeeService.update(coffee);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return "redirect:./list";
    }

    @PostMapping("/coffee/delete")
    public String delete(@RequestParam("id") Long id) {
        try {
            this.coffeeService.delete(id);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "redirect:/coffee/list";
    }
}
