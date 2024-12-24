package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // annotation: đánh dấu 1 class là controller giúp IOC Container tạo ra beans
@RequestMapping("/") // url handle mapping: cơ chế ánh xạ request đến controller tương ứng
public class StudentController {
    @GetMapping
    public ModelAndView showHomePage(Model model) {
        ModelAndView mav = new ModelAndView("home");
        String msg = "Hello World!";
        mav.addObject("msg", msg);
        return mav;
    }

    @GetMapping("create-form")
    public String showCreateForm() {
        return "create-form";
    }

    @PostMapping ("add-student")
    public void submitForm() {
        System.out.println("add-student");
    }
}
