package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepo.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepo.save(customer);
    }
}
