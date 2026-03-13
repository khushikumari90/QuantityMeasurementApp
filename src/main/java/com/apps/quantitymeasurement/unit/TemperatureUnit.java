package com.apps.quantitymeasurement.unit;

public enum TemperatureUnit {

    CELSIUS,
    FAHRENHEIT;

    public static double convert(double value, TemperatureUnit from) {

        if (from == CELSIUS)
            return value;

        return (value - 32) * 5 / 9;
    }
}