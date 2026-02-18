package com.apps.quantitymeasurement;

import java.util.Scanner;

public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first feet value: ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter second feet value: ");
        double value2 = scanner.nextDouble();

        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);

        boolean result = feet1.equals(feet2);

        System.out.println("Input: " + value1 + " ft and " + value2 + " ft");
        System.out.println("Output: Equal (" + result + ")");

        scanner.close();
    }
}
