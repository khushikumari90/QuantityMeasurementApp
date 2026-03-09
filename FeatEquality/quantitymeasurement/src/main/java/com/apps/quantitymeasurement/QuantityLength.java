package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Value must be finite");

        this.value = value;
        this.unit = unit;
    }

    private double valueInFeet() {
        return unit.toFeet(value);
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

       //UC6 ADDITION METHODS
       

    // Instance method
    public QuantityLength add(QuantityLength other) {

        if (other == null)
            throw new IllegalArgumentException("Second operand cannot be null");

        double sumInFeet = this.valueInFeet() + other.valueInFeet();

        double resultValue = this.unit.fromFeet(sumInFeet);

        return new QuantityLength(resultValue, this.unit);
    }

    // Static method
    public static QuantityLength add(QuantityLength a, QuantityLength b) {

        if (a == null || b == null)
            throw new IllegalArgumentException("Operands cannot be null");

        double sumInFeet = a.valueInFeet() + b.valueInFeet();

        double resultValue = a.unit.fromFeet(sumInFeet);

        return new QuantityLength(resultValue, a.unit);
    }

   
      // UC4 Equality
      

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