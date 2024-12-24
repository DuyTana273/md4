package com.example.demo.service;

import com.example.demo.repository.DictionaryRepository;
import com.example.demo.repository.IDictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    private static final IDictionaryRepository iDictionaryRepository = new DictionaryRepository();

    @Override
    public String translate(String english) {
        return iDictionaryRepository.translate(english);
    }
}
