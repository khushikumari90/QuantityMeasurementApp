package com.apps.quantitymeasurement;

public enum TemperatureUnit implements IMeasurable {

    CELSIUS {
        public double toBaseUnit(double value) { return value + 273.15; }
        public double fromBaseUnit(double base) { return base - 273.15; }
    },

    FAHRENHEIT {
        public double toBaseUnit(double value) {
            return (value - 32) * 5/9 + 273.15;
        }
        public double fromBaseUnit(double base) {
            return (base - 273.15) * 9/5 + 32;
        }
    },

    KELVIN {
        public double toBaseUnit(double value) { return value; }
        public double fromBaseUnit(double base) { return base; }
    };
}