package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.repository.ICustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private ICustomerRepo iCustomerRepo = new CustomerRepo();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepo.findAll();
    }
}
