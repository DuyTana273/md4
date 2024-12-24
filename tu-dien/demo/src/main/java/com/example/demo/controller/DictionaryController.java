package com.example.demo.controller;

import com.example.demo.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping
    public String showHomePage() {
        return "home";
    }

    @PostMapping("/search")
    public String searchWord(@RequestParam("englishWord") String englishWord, Model model) {
        String vietnameseMeaning = dictionaryService.translate(englishWord);
        model.addAttribute("englishWord", englishWord);
        model.addAttribute("vietnameseMeaning", vietnameseMeaning);
        return "result";
    }
}
