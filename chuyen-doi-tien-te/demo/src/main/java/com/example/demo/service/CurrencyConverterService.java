package com.example.demo.service;

import com.example.demo.repository.ConversionRateRepository;
import com.example.demo.repository.IConversionRateRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterService implements ICurrencyConverterService {
    private final IConversionRateRepository iConversionRateRepository = new ConversionRateRepository();

    @Override
    public double convert(double usdAmount) {
        return iConversionRateRepository.convert(usdAmount);
    }
}
