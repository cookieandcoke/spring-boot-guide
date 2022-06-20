package com.github.cookieandcoke.guide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(defaultValue = "Anonymous") String name) {
        model.addAttribute("name", name);
        return "/th/hello";
    }
}
