package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/products")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/products/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("products", new Product());
        return modelAndView;
    }

    @PostMapping("/products/create")
    public String create(@ModelAttribute("products") Product product) {
        iProductService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/products/view/{id}")
    public ModelAndView view(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product", iProductService.findById(id));
        return modelAndView;
    }

    @GetMapping("/products/update/{id}")
    public ModelAndView update(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("products", iProductService.findById(id));
        return modelAndView;
    }

    @PostMapping("/products/update/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("products") Product product) {
        iProductService.update(product);
        return "redirect:/products";
    }

    @GetMapping("/products/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        iProductService.delete(id);
        return "redirect:/products";
    }

    @GetMapping("/products/search")
    public ModelAndView search(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", iProductService.findByName(name));
        return modelAndView;
    }
}
