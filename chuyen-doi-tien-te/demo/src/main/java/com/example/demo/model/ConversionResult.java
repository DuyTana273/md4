package com.example.demo.model;

public class ConversionResult {
    private double usdAmount;
    private double rate;
    private double vndAmount;

    public ConversionResult(double usdAmount, double rate, double vndAmount) {
        this.usdAmount = usdAmount;
        this.rate = rate;
        this.vndAmount = vndAmount;
    }

    public double getUsdAmount() {
        return usdAmount;
    }

    public double getRate() {
        return rate;
    }

    public double getVndAmount() {
        return vndAmount;
    }
}
