package com.apps.quantitymeasurement;

public enum WeightUnit implements IMeasurable {

    GRAM(0.001),
    KILOGRAM(1),
    POUND(0.453592);

    private final double conversionFactor;

    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public String getUnitName() {
        return name();
    }
}