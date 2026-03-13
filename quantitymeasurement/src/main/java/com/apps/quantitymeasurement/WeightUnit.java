package com.apps.quantitymeasurement;

public enum WeightUnit implements IMeasurable {

    KILOGRAM(1.0),
    GRAM(1.0/1000);

    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    public double toBaseUnit(double value) {
        return value * factor;
    }

    public double fromBaseUnit(double baseValue) {
        return baseValue / factor;
    }
}