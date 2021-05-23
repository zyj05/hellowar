package com.zyj.hellowar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/abc")
    public String hello(Model model) {
        System.out.printf("hello git");
        model.addAttribute("msg","你好");
        return "success";
    }
}
