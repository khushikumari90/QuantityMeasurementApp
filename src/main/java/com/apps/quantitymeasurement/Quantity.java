package com.apps.quantitymeasurement;

import java.util.Objects;

public class Quantity<U extends IMeasurable> {

    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {

        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        if (Double.isNaN(value))
            throw new IllegalArgumentException("Invalid value");

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    public Quantity<U> convertTo(U targetUnit) {

        double baseValue = unit.toBaseUnit(value);
        double targetValue = targetUnit.fromBaseUnit(baseValue);

        return new Quantity<>(targetValue, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        double resultBase = base1 + base2;

        double result = targetUnit.fromBaseUnit(resultBase);

        return new Quantity<>(result, targetUnit);
    }

    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        double resultBase = base1 - base2;

        double result = targetUnit.fromBaseUnit(resultBase);

        return new Quantity<>(result, targetUnit);
    }

    public double divide(Quantity<U> other) {

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        return base1 / base2;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Quantity))
            return false;

        Quantity<?> other = (Quantity<?>) obj;

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        return Math.abs(base1 - base2) < 0.01;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}