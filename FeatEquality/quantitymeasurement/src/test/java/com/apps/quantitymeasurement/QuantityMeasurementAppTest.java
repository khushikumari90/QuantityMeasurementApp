package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementTest {

    private static final double EPSILON = 1e-6;

    @Test
    void testFeetEquality() {
        QuantityLength a = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(1, LengthUnit.FEET);
        assertEquals(a, b);
    }

    @Test
    void testFeetAndInchesEquality() {
        QuantityLength feet = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12, LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    void testYardEqualsFeet() {
        QuantityLength yard = new QuantityLength(1, LengthUnit.YARDS);
        QuantityLength feet = new QuantityLength(3, LengthUnit.FEET);
        assertEquals(yard, feet);
    }

    @Test
    void testCentimeterEqualsInch() {
        QuantityLength cm = new QuantityLength(2.54, LengthUnit.CENTIMETERS);
        QuantityLength inch = new QuantityLength(1, LengthUnit.INCHES);
        assertEquals(cm, inch);
    }

    @Test
    void testFeetToInchesConversion() {
        QuantityLength result = new QuantityLength(1, LengthUnit.FEET).convertTo(LengthUnit.INCHES);
        assertEquals(12, result.getValue(), EPSILON);
    }

    @Test
    void testFeetToYardsConversion() {
        QuantityLength result = new QuantityLength(3, LengthUnit.FEET).convertTo(LengthUnit.YARDS);
        assertEquals(1, result.getValue(), EPSILON);
    }

    @Test
    void testFeetToCentimetersConversion() {
        QuantityLength result = new QuantityLength(1, LengthUnit.FEET).convertTo(LengthUnit.CENTIMETERS);
        assertEquals(30.48, result.getValue(), EPSILON);
    }

    @Test
    void testAdditionFeet() {
        QuantityLength result = new QuantityLength(1, LengthUnit.FEET)
                .add(new QuantityLength(2, LengthUnit.FEET), LengthUnit.FEET);
        assertEquals(3, result.getValue(), EPSILON);
    }

    @Test
    void testAdditionFeetAndInches() {
        QuantityLength result = new QuantityLength(1, LengthUnit.FEET)
                .add(new QuantityLength(12, LengthUnit.INCHES), LengthUnit.FEET);
        assertEquals(2, result.getValue(), EPSILON);
    }

    @Test
    void testAdditionYardAndFeet() {
        QuantityLength result = new QuantityLength(1, LengthUnit.YARDS)
                .add(new QuantityLength(3, LengthUnit.FEET), LengthUnit.YARDS);
        assertEquals(2, result.getValue(), EPSILON);
    }

    @Test
    void testConvertToBaseUnit_Inches() {
        assertEquals(1, LengthUnit.INCHES.convertToBaseUnit(12), EPSILON);
    }

    @Test
    void testConvertFromBaseUnit_Inches() {
        assertEquals(12, LengthUnit.INCHES.convertFromBaseUnit(1), EPSILON);
    }

    @Test
    void testKilogramEqualsGram() {
        QuantityWeight kg = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight g = new QuantityWeight(1000, WeightUnit.GRAM);
        assertEquals(kg, g);
    }

    @Test
    void testKilogramEqualsPound() {
        QuantityWeight kg = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight lb = new QuantityWeight(2.20462, WeightUnit.POUND);
        assertEquals(kg, lb);
    }

    @Test
    void testKgToGramConversion() {
        QuantityWeight result = new QuantityWeight(1, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM);
        assertEquals(1000, result.getValue(), EPSILON);
    }

    @Test
    void testKgToPoundConversion() {
        QuantityWeight result = new QuantityWeight(1, WeightUnit.KILOGRAM).convertTo(WeightUnit.POUND);
        assertEquals(2.20462, result.getValue(), 0.01);
    }

    @Test
    void testWeightAddition() {
        QuantityWeight result = QuantityWeight.add(
                new QuantityWeight(1, WeightUnit.KILOGRAM),
                new QuantityWeight(500, WeightUnit.GRAM)
        );

        assertEquals(1.5, result.getValue(), EPSILON);
    }

    @Test
    void testWeightAdditionWithTargetUnit() {
        QuantityWeight result = QuantityWeight.add(
                new QuantityWeight(1, WeightUnit.KILOGRAM),
                new QuantityWeight(1, WeightUnit.POUND),
                WeightUnit.GRAM
        );

        assertTrue(result.getValue() > 1400);
    }

    @Test
    void testNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(1, null)
        );
    }

    @Test
    void testInvalidValue() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(Double.NaN, LengthUnit.FEET)
        );
    }
}