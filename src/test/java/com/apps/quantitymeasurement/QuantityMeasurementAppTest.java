package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    private static final double EPSILON = 0.01;

    @Test
    void testSubtraction_SameUnit() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(5, LengthUnit.FEET);

        Quantity<LengthUnit> result = q1.subtract(q2);

        assertEquals(5.0, result.getValue(), EPSILON);
    }

    @Test
    void testSubtraction_CrossUnit() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(6, LengthUnit.INCHES);

        Quantity<LengthUnit> result = q1.subtract(q2);

        assertEquals(9.5, result.getValue(), EPSILON);
    }

    @Test
    void testSubtraction_ExplicitUnit() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(6, LengthUnit.INCHES);

        Quantity<LengthUnit> result = q1.subtract(q2, LengthUnit.INCHES);

        assertEquals(114, result.getValue(), EPSILON);
    }

    @Test
    void testSubtraction_NegativeResult() {

        Quantity<LengthUnit> q1 = new Quantity<>(5, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(10, LengthUnit.FEET);

        Quantity<LengthUnit> result = q1.subtract(q2);

        assertEquals(-5, result.getValue(), EPSILON);
    }

    @Test
    void testSubtraction_ResultZero() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(120, LengthUnit.INCHES);

        Quantity<LengthUnit> result = q1.subtract(q2);

        assertEquals(0, result.getValue(), EPSILON);
    }

    @Test
    void testDivision_SameUnit() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(2, LengthUnit.FEET);

        double result = q1.divide(q2);

        assertEquals(5.0, result, EPSILON);
    }

    @Test
    void testDivision_CrossUnit() {

        Quantity<LengthUnit> q1 = new Quantity<>(24, LengthUnit.INCHES);
        Quantity<LengthUnit> q2 = new Quantity<>(2, LengthUnit.FEET);

        double result = q1.divide(q2);

        assertEquals(1.0, result, EPSILON);
    }

    @Test
    void testDivision_RatioLessThanOne() {

        Quantity<LengthUnit> q1 = new Quantity<>(5, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(10, LengthUnit.FEET);

        double result = q1.divide(q2);

        assertEquals(0.5, result, EPSILON);
    }

    @Test
    void testDivision_ByZero() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(0, LengthUnit.FEET);

        assertThrows(ArithmeticException.class, () -> q1.divide(q2));
    }

    @Test
    void testSubtraction_NullOperand() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> q1.subtract(null));
    }

    @Test
    void testDivision_NullOperand() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> q1.divide(null));
    }

    @Test
    void testSubtraction_Immutability() {

        Quantity<LengthUnit> q1 = new Quantity<>(10, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(5, LengthUnit.FEET);

        q1.subtract(q2);

        assertEquals(10, q1.getValue(), EPSILON);
    }
}