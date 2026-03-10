package com.apps.quantitymeasurement;

public enum TemperatureUnit implements IMeasurable {

    CELSIUS,
    FAHRENHEIT,
    KELVIN;

    @Override
    public double toBaseUnit(double value) {

        if (this == CELSIUS)
            return value;

        if (this == FAHRENHEIT)
            return (value - 32) * 5 / 9;

        if (this == KELVIN)
            return value - 273.15;

        return value;
    }

    @Override
    public double fromBaseUnit(double baseValue) {

        if (this == CELSIUS)
            return baseValue;

        if (this == FAHRENHEIT)
            return (baseValue * 9 / 5) + 32;

        if (this == KELVIN)
            return baseValue + 273.15;

        return baseValue;
    }

    public String getUnitName() {
        return name();
    }
}