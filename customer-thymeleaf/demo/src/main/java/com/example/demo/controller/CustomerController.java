package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        return "customers";
    }

    @GetMapping("/customers/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/customers/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        iCustomerService.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        Customer customer = iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "edit";
    }

    @PostMapping("/customers/edit")
    public String edit(Customer customer) {
        iCustomerService.update(customer.getId(), customer);
        return "redirect:/customers";
    }

    @GetMapping("/customers/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", iCustomerService.findById(id));
        return "/delete";
    }

    @PostMapping("/customers/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        iCustomerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customers";
    }

    @GetMapping("/customers/{id}/view")
    public String view(@PathVariable int id, Model model) {
        Customer customer = iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "/view";
    }
}
