package com.apps.quantitymeasurement;

public enum WeightUnit {

    GRAM(0.001),
    KILOGRAM(1),
    POUND(0.453592);

    private final double toKg;

    WeightUnit(double toKg) {
        this.toKg = toKg;
    }

    public double convertToBaseUnit(double value) {
        return value * toKg;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / toKg;
    }
}