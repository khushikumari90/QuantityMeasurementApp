package com.apps.quantitymeasurement;

public enum LengthUnit implements IMeasurable {

    INCHES(1.0 / 12),
    FEET(1),
    YARDS(3),
    CENTIMETERS(0.0328084);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public String getUnitName() {
        return name();
    }
}