package com.example.demo.controller;

import com.example.demo.model.ConversionResult;
import com.example.demo.service.ICurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CurrencyConverterController {
    @Autowired
    private ICurrencyConverterService currencyConverterService;

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("usdAmount") double usdAmount, Model model) {
        double vndAmount = currencyConverterService.convert(usdAmount);
        model.addAttribute("usdAmount", usdAmount);
        model.addAttribute("vndAmount", vndAmount);
        return "result";
    }
}
