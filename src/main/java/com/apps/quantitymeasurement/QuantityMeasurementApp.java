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

        // LENGTH
        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);

        // WEIGHT
        Quantity<WeightUnit> kg = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> gram = new Quantity<>(1000.0, WeightUnit.GRAM);

        // VOLUME (UC11)
        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> millilitre = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);

        // LENGTH OPERATIONS
        demonstrateEquality(feet, inches);
        demonstrateConversion(feet, LengthUnit.INCHES);
        demonstrateAddition(feet, inches, LengthUnit.FEET);

        // WEIGHT OPERATIONS
        demonstrateEquality(kg, gram);
        demonstrateConversion(kg, WeightUnit.GRAM);
        demonstrateAddition(kg, gram, WeightUnit.KILOGRAM);

        // VOLUME OPERATIONS
        demonstrateEquality(litre, millilitre);
        demonstrateConversion(litre, VolumeUnit.MILLILITRE);
        demonstrateAddition(litre, millilitre, VolumeUnit.LITRE);

        demonstrateConversion(gallon, VolumeUnit.LITRE);
        demonstrateAddition(litre, gallon, VolumeUnit.MILLILITRE);
    }
}