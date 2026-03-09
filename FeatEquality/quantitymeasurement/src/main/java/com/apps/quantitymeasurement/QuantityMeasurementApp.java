package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength a = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12, LengthUnit.INCHES);

        System.out.println("Addition result (default unit):");
        System.out.println(a.add(b));

        System.out.println("\nAddition result in Inches:");
        System.out.println(
                QuantityLength.add(a, b, LengthUnit.INCHES));

        System.out.println("\nAddition result in Yards:");
        System.out.println(
                QuantityLength.add(a, b, LengthUnit.YARDS));

        System.out.println("\nAddition result in Centimeters:");
        System.out.println(
                QuantityLength.add(a, b, LengthUnit.CENTIMETERS));
    }
}