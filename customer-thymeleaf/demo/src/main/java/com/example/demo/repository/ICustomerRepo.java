package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
