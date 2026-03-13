package com.apps.quantitymeasurement;

public enum LengthUnit implements IMeasurable {

    FEET(1.0),
    INCHES(1.0/12),
    YARDS(3.0),
    CENTIMETERS(1.0/30.48);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double toBaseUnit(double value) {
        return value * factor;
    }

    public double fromBaseUnit(double baseValue) {
        return baseValue / factor;
    }
}