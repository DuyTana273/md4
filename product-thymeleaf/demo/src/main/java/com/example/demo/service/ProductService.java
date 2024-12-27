package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return iProductRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return iProductRepo.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepo.findByName(name);
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(int id) {
        iProductRepo.delete(id);
    }

    @Override
    public void update(Product product) {
        iProductRepo.update(product);
    }
}
