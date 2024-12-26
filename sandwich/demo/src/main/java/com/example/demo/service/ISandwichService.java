package com.example.demo.service;

import com.example.demo.model.Sandwich;

import java.util.List;

public interface ISandwichService {
    List<Sandwich> findAll();

    Sandwich findById(int id);

    void save(Sandwich sandwich);
}
