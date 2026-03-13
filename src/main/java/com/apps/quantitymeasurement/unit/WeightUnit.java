package com.apps.quantitymeasurement.unit;

public enum WeightUnit implements IMeasurable {

    KG(1000),
    GRAM(1);

    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double toBase(double value) {
        return value * factor;
    }
}