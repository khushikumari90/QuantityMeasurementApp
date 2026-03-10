package com.apps.quantitymeasurement;

public class Quantity<U extends IMeasurable> {

    private final double value;
    private final U unit;
    private static final double EPSILON = 0.0001;

    public Quantity(double value, U unit) {

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

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

        if (unit.getClass() != targetUnit.getClass()) {
            throw new IllegalArgumentException("Incompatible unit types");
        }

        double baseValue = unit.toBaseUnit(value);
        double convertedValue = targetUnit.fromBaseUnit(baseValue);

        return new Quantity<>(convertedValue, targetUnit);
    }

    private void validateArithmeticOperands(Quantity<U> other, String operation) {

        if (other == null) {
            throw new IllegalArgumentException("Quantity cannot be null");
        }

        if (unit.getClass() != other.unit.getClass()) {
            throw new IllegalArgumentException("Incompatible units");
        }

        unit.validateOperationSupport(operation);
    }

    public Quantity<U> add(Quantity<U> other, U resultUnit) {

        validateArithmeticOperands(other, "addition");

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        double result = base1 + base2;

        return new Quantity<>(resultUnit.fromBaseUnit(result), resultUnit);
    }

    public Quantity<U> subtract(Quantity<U> other, U resultUnit) {

        validateArithmeticOperands(other, "subtraction");

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        double result = base1 - base2;

        return new Quantity<>(resultUnit.fromBaseUnit(result), resultUnit);
    }

    public double divide(Quantity<U> other) {

        validateArithmeticOperands(other, "division");

        double base1 = unit.toBaseUnit(value);
        double base2 = other.unit.toBaseUnit(other.value);

        if (Math.abs(base2) < EPSILON) {
            throw new ArithmeticException("Division by zero");
        }

        return base1 / base2;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Quantity<?> other)) return false;

        if (unit.getClass() != other.unit.getClass())
            return false;

        double base1 = unit.toBaseUnit(value);
        double base2 = ((IMeasurable) other.unit).toBaseUnit(other.value);

        return Math.abs(base1 - base2) < EPSILON;
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}