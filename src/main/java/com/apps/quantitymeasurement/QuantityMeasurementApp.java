package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        demonstrateSubtraction();
        demonstrateDivision();
    }

    private static void demonstrateSubtraction() {

        System.out.println("Subtraction Operations");

        Quantity<LengthUnit> length1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> length2 = new Quantity<>(6.0, LengthUnit.INCHES);

        System.out.println(length1.subtract(length2));
        System.out.println(length1.subtract(length2, LengthUnit.INCHES));

        Quantity<WeightUnit> weight1 = new Quantity<>(10.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> weight2 = new Quantity<>(5000.0, WeightUnit.GRAM);

        System.out.println(weight1.subtract(weight2));

        Quantity<VolumeUnit> volume1 = new Quantity<>(5.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> volume2 = new Quantity<>(500.0, VolumeUnit.MILLILITRE);

        System.out.println(volume1.subtract(volume2));
    }

    private static void demonstrateDivision() {

        System.out.println("\nDivision Operations");

        Quantity<LengthUnit> length1 = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> length2 = new Quantity<>(2.0, LengthUnit.FEET);

        System.out.println(length1.divide(length2));

        Quantity<WeightUnit> weight1 = new Quantity<>(10.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> weight2 = new Quantity<>(5.0, WeightUnit.KILOGRAM);

        System.out.println(weight1.divide(weight2));

        Quantity<VolumeUnit> volume1 = new Quantity<>(5.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> volume2 = new Quantity<>(10.0, VolumeUnit.LITRE);

        System.out.println(volume1.divide(volume2));
    }
}