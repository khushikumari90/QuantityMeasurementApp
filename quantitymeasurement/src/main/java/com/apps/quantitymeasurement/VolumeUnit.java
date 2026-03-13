package com.apps.quantitymeasurement;

public enum VolumeUnit implements IMeasurable {

    LITRE(1.0),
    MILLILITRE(1.0/1000);

    private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    public double toBaseUnit(double value) {
        return value * factor;
    }

    public double fromBaseUnit(double baseValue) {
        return baseValue / factor;
    }
}