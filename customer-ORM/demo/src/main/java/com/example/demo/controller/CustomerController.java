package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/customers")
    public String customers(Model model) {
        List<Customer> customerList  = iCustomerService.findAll();
        model.addAttribute("customers", customerList );
        return "list";
    }

    @GetMapping("/customers/create")
    public String create(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create";
    }

    @PostMapping("/customers/save")
    public String create(Customer customer) {
        iCustomerService.save(customer);
        return "redirect:/customers";
    }
}
