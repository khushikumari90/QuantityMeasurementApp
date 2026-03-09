package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityWeight {

    private final double value;
    private final WeightUnit unit;

    public QuantityWeight(double value, WeightUnit unit) {

        if (unit == null)
            throw new IllegalArgumentException();

        if (Double.isNaN(value))
            throw new IllegalArgumentException();

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public QuantityWeight convertTo(WeightUnit targetUnit) {

        double base = unit.convertToBaseUnit(value);
        double result = targetUnit.convertFromBaseUnit(base);

        return new QuantityWeight(result, targetUnit);
    }

    public static QuantityWeight add(QuantityWeight w1, QuantityWeight w2) {

        double base1 = w1.unit.convertToBaseUnit(w1.value);
        double base2 = w2.unit.convertToBaseUnit(w2.value);

        double sum = base1 + base2;

        return new QuantityWeight(sum, WeightUnit.KILOGRAM);
    }

    public static QuantityWeight add(QuantityWeight w1, QuantityWeight w2, WeightUnit target) {

        double base1 = w1.unit.convertToBaseUnit(w1.value);
        double base2 = w2.unit.convertToBaseUnit(w2.value);

        double sum = base1 + base2;

        double result = target.convertFromBaseUnit(sum);

        return new QuantityWeight(result, target);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof QuantityWeight)) return false;

        QuantityWeight other = (QuantityWeight) obj;

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        return Math.abs(base1 - base2) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit.convertToBaseUnit(value));
    }
}