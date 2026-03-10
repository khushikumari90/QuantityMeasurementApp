package com.apps.quantitymeasurement;

public enum WeightUnit implements IMeasurable {

    GRAM(0.001),
    KILOGRAM(1);

    private final double conversionFactor;

    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double toBaseUnit(double value) {
        return value * conversionFactor;
    }

    @Override
    public double fromBaseUnit(double baseValue) {
        return baseValue / conversionFactor;
    }

    public String getUnitName() {
        return name();
    }
}