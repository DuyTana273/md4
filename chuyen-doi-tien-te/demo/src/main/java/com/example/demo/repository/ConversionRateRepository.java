package com.example.demo.repository;

public class ConversionRateRepository implements IConversionRateRepository {

    @Override
    public double convert(double usdAmount) {
        double rate = 23_500;
        double vndAmount = usdAmount * rate;
        return vndAmount;
    }
}
