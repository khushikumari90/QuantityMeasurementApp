package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        
           //LENGTH MEASUREMENTS (UC1–UC8)
          
        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println("=== LENGTH OPERATIONS ===");

        System.out.println("\nConvert 1 foot to inches:");
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


      
          //WEIGHT MEASUREMENTS (UC9)
           

        System.out.println("\n\n=== WEIGHT OPERATIONS ===");

        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);
        QuantityWeight w3 = new QuantityWeight(2.20462, WeightUnit.POUND);

        System.out.println("\nWeight Equality:");

        System.out.println(w1 + " equals " + w2 + " ? " + w1.equals(w2));
        System.out.println(w1 + " equals " + w3 + " ? " + w1.equals(w3));

        System.out.println("\nWeight Conversion:");

        System.out.println("1 kg → grams: " + w1.convertTo(WeightUnit.GRAM));
        System.out.println("1 kg → pounds: " + w1.convertTo(WeightUnit.POUND));

        System.out.println("\nWeight Addition:");

        System.out.println(
                "1 kg + 500 g = " +
                        QuantityWeight.add(
                                new QuantityWeight(1, WeightUnit.KILOGRAM),
                                new QuantityWeight(500, WeightUnit.GRAM)));

        System.out.println(
                "1 kg + 1 lb (result in grams) = " +
                        QuantityWeight.add(
                                new QuantityWeight(1, WeightUnit.KILOGRAM),
                                new QuantityWeight(1, WeightUnit.POUND),
                                WeightUnit.GRAM));
    }
}