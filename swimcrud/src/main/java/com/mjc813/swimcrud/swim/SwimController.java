package com.mjc813.swimcrud.swim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwimController {
    @Autowired
    private SwimService swimService;

    @GetMapping("/swim")
    public String swim() {
        return "/swim/swims";
    }

}
