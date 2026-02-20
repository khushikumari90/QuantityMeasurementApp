package com.apps.quantitymeasurement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuantityLengthTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {
        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals(q1, q2);
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength q2 = new QuantityLength(1.0, LengthUnit.INCH);
        assertEquals(q1, q2);
    }

    @Test
    void testEquality_FeetToInch_EquivalentValue() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inch = new QuantityLength(12.0, LengthUnit.INCH);
        assertEquals(feet, inch);
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {
        QuantityLength inch = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals(inch, feet);
    }

    @Test
    void testEquality_DifferentValues() {
        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(2.0, LengthUnit.FEET);
        assertNotEquals(q1, q2);
    }

    @Test
    void testEquality_SameReference() {
        QuantityLength q = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals(q, q);
    }

    @Test
    void testEquality_NullComparison() {
        QuantityLength q = new QuantityLength(1.0, LengthUnit.FEET);
        assertNotEquals(q, null);
    }

    @Test
    void testInvalid_NullUnit() {
        assertThrows(IllegalArgumentException.class,
                () -> new QuantityLength(1.0, null));
    }
}