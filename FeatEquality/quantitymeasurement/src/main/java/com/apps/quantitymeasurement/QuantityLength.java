package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {

        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Invalid value");

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    private double valueInFeet() {
        return unit.toFeet(value);
    }

    // UC6 Addition 
    public QuantityLength add(QuantityLength other) {

        if (other == null)
            throw new IllegalArgumentException("Second operand cannot be null");

        double sumFeet = this.valueInFeet() + other.valueInFeet();

        double result = this.unit.fromFeet(sumFeet);

        return new QuantityLength(result, this.unit);
    }

    // UC7 Addition with target unit 
    public static QuantityLength add(
            QuantityLength a,
            QuantityLength b,
            LengthUnit targetUnit) {

        if (a == null || b == null)
            throw new IllegalArgumentException("Operands cannot be null");

        if (targetUnit == null)
            throw new IllegalArgumentException("Target unit cannot be null");

        double sumFeet = a.valueInFeet() + b.valueInFeet();

        double result = targetUnit.fromFeet(sumFeet);

        return new QuantityLength(result, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        QuantityLength other = (QuantityLength) obj;

        return Double.compare(this.valueInFeet(), other.valueInFeet()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueInFeet());
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}