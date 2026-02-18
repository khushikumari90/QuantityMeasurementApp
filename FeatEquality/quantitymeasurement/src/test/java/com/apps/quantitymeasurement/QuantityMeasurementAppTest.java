package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void testEquality_SameValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(feet1.equals(feet2),
                "Expected two Feet objects with same value to be equal");
    }

    @Test
    void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);

        assertFalse(feet1.equals(feet2),
                "Expected Feet objects with different values to be unequal");
    }

    @Test
    void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet.equals(null),
                "Expected Feet object comparison with null to return false");
    }

    @Test
    void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet.equals("1.0"),
                "Expected Feet object not to be equal to non-Feet object");
    }

    @Test
    void testEquality_SameReference() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(feet.equals(feet),
                "Expected Feet object to be equal to itself");
    }
}
