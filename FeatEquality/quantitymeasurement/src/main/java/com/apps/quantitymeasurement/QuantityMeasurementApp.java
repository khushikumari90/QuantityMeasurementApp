package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println("Convert 1 foot to inches:");
        System.out.println(q1.convertTo(LengthUnit.INCHES));

        System.out.println("\nAdd 1 foot + 12 inches (result in feet):");
        System.out.println(q1.add(q2, LengthUnit.FEET));

        System.out.println("\nEquality test:");
        System.out.println(
                new QuantityLength(36, LengthUnit.INCHES)
                        .equals(new QuantityLength(1, LengthUnit.YARDS)));

        System.out.println("\nAdd 1 yard + 3 feet (result in yards):");
        System.out.println(
                new QuantityLength(1, LengthUnit.YARDS)
                        .add(new QuantityLength(3, LengthUnit.FEET), LengthUnit.YARDS));

        System.out.println("\nConvert 2.54 cm to inches:");
        System.out.println(
                new QuantityLength(2.54, LengthUnit.CENTIMETERS)
                        .convertTo(LengthUnit.INCHES));
    }
}