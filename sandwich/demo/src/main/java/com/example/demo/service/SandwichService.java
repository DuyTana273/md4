package com.example.demo.service;

import com.example.demo.model.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class SandwichService implements ISandwichService {
    private final List<Sandwich> sandwich;

    public SandwichService() {
        sandwich = new ArrayList<>();
        sandwich.add(new Sandwich(1, "Sandwich A", "Lettuce"));
        sandwich.add(new Sandwich(2, "Sandwich B", "Tomato"));
        sandwich.add(new Sandwich(3, "Sandwich C", "Mustard"));
        sandwich.add(new Sandwich(4, "Sandwich D", "Sprouts"));
    }

    @Override
    public List<Sandwich> findAll() {
        return sandwich;
    }

    @Override
    public Sandwich findById(int id) {
        for (Sandwich s : sandwich) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void save(Sandwich sandwich) {
        Sandwich s = findById(sandwich.getId());
        s.setName(sandwich.getName());
        s.setSpice(sandwich.getSpice());
    }
}
