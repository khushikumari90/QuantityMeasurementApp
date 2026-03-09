package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityLengthTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testEquality_Feet() {

        QuantityLength a = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(1, LengthUnit.FEET);

        assertEquals(a, b);
    }

    @Test
    void testEquality_FeetAndInches() {

        QuantityLength feet =
                new QuantityLength(1, LengthUnit.FEET);

        QuantityLength inches =
                new QuantityLength(12, LengthUnit.INCHES);

        assertEquals(feet, inches);
    }

    @Test
    void testEquality_YardAndFeet() {

        QuantityLength yard =
                new QuantityLength(1, LengthUnit.YARDS);

        QuantityLength feet =
                new QuantityLength(3, LengthUnit.FEET);

        assertEquals(yard, feet);
    }

    @Test
    void testAddition_FeetPlusInches() {

        QuantityLength result =
                new QuantityLength(1, LengthUnit.FEET)
                        .add(new QuantityLength(12, LengthUnit.INCHES));

        assertEquals(
                new QuantityLength(2, LengthUnit.FEET),
                result);
    }

    @Test
    void testAddition_TargetUnit() {

        QuantityLength result =
                QuantityLength.add(
                        new QuantityLength(1, LengthUnit.FEET),
                        new QuantityLength(12, LengthUnit.INCHES),
                        LengthUnit.INCHES);

        assertEquals(24, result.getValue(), EPSILON);
    }

    @Test
    void testAddition_Yards() {

        QuantityLength result =
                QuantityLength.add(
                        new QuantityLength(3, LengthUnit.FEET),
                        new QuantityLength(3, LengthUnit.FEET),
                        LengthUnit.YARDS);

        assertEquals(2, result.getValue(), EPSILON);
    }

    @Test
    void testNullOperand() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(1, LengthUnit.FEET)
                        .add(null));
    }
}