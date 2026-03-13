package com.apps.quantitymeasurement.unit;

public enum VolumeUnit implements IMeasurable {

    LITER(1000),
    ML(1);

    private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    @Override
    public double toBase(double value) {
        return value * factor;
    }
}