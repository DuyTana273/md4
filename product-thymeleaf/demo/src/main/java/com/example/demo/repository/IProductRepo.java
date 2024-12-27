package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> findAll();
    Product findById(int id);
    List<Product> findByName(String name);
    void save(Product product);
    void delete(int id);
    void update(Product product);
}
