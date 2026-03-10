package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateEquality(Quantity<?> q1, Quantity<?> q2) {
        System.out.println(q1 + " == " + q2 + " -> " + q1.equals(q2));
    }

    public static <U extends IMeasurable> void demonstrateConversion(Quantity<U> q, U target) {
        System.out.println(q + " -> " + q.convertTo(target));
    }

    public static <U extends IMeasurable> void demonstrateAddition(Quantity<U> q1, Quantity<U> q2, U target) {
        System.out.println(q1 + " + " + q2 + " -> " + q1.add(q2, target));
    }

    public static void main(String[] args) {

        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);

        Quantity<WeightUnit> kg = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> gram = new Quantity<>(1000.0, WeightUnit.GRAM);

        demonstrateEquality(feet, inches);
        demonstrateConversion(feet, LengthUnit.INCHES);
        demonstrateAddition(feet, inches, LengthUnit.FEET);

        demonstrateEquality(kg, gram);
        demonstrateConversion(kg, WeightUnit.GRAM);
        demonstrateAddition(kg, gram, WeightUnit.KILOGRAM);

        Quantity<TemperatureUnit> celsius =
                new Quantity<>(0.0, TemperatureUnit.CELSIUS);

        Quantity<TemperatureUnit> fahrenheit =
                new Quantity<>(32.0, TemperatureUnit.FAHRENHEIT);

        demonstrateEquality(celsius, fahrenheit);

        demonstrateConversion(
                new Quantity<>(100.0, TemperatureUnit.CELSIUS),
                TemperatureUnit.FAHRENHEIT);

        demonstrateConversion(
                new Quantity<>(273.15, TemperatureUnit.KELVIN),
                TemperatureUnit.CELSIUS);

        try {
            new Quantity<>(100.0, TemperatureUnit.CELSIUS)
                    .add(new Quantity<>(50.0, TemperatureUnit.CELSIUS), TemperatureUnit.CELSIUS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}