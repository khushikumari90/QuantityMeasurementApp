package com.apps.quantitymeasurement;

public enum LengthUnit {

    INCHES(1.0 / 12),
    FEET(1),
    YARDS(3),
    CENTIMETERS(0.0328084);

    private final double toFeet;

    LengthUnit(double toFeet) {
        this.toFeet = toFeet;
    }

    public double convertToBaseUnit(double value) {
        return value * toFeet;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / toFeet;
    }
}