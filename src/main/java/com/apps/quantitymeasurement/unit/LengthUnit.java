package com.apps.quantitymeasurement.unit;

public enum LengthUnit implements IMeasurable {

    FEET(12),
    INCH(1),
    YARD(36);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double toBase(double value) {
        return value * factor;
    }
}