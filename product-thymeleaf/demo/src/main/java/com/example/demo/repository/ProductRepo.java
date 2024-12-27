package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepo implements IProductRepo {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Asus", 123456789));
        products.put(2, new Product(2, "Lenovo", 23456789));
        products.put(3, new Product(3, "Dell", 3456789));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return products.values().stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public void update(Product product) {
        products.put(product.getId(), product);
    }
}
