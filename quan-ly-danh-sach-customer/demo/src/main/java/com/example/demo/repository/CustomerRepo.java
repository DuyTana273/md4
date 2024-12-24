package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    private static final List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Tân", "tan@gmail.com", "TPHCM"));
        customers.add(new Customer(2, "CodeGym", "CodeGym@gmail.com", "TPHCM"));
        customers.add(new Customer(3, "Công", "congnguyen@gmail.com", "TPHCM"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
