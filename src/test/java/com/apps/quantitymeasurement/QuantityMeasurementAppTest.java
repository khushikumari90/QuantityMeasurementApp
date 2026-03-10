package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    private static final double EPSILON = 0.01;

    // ---------------- LENGTH TESTS ----------------

    @Test
    void testLengthEquality() {

        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);

        assertEquals(q1, q2);
    }

    @Test
    void testLengthConversion() {

        Quantity<LengthUnit> q = new Quantity<>(1.0, LengthUnit.FEET);

        Quantity<LengthUnit> result = q.convertTo(LengthUnit.INCHES);

        assertEquals(12.0, result.getValue(), EPSILON);
    }

    @Test
    void testLengthAddition() {

        Quantity<LengthUnit> q1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> q2 = new Quantity<>(12.0, LengthUnit.INCHES);

        Quantity<LengthUnit> result = q1.add(q2, LengthUnit.FEET);

        assertEquals(2.0, result.getValue(), EPSILON);
    }

    // ---------------- WEIGHT TESTS ----------------

    @Test
    void testWeightEquality() {

        Quantity<WeightUnit> q1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> q2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        assertEquals(q1, q2);
    }

    @Test
    void testWeightConversion() {

        Quantity<WeightUnit> q = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        Quantity<WeightUnit> result = q.convertTo(WeightUnit.GRAM);

        assertEquals(1000.0, result.getValue(), EPSILON);
    }

    @Test
    void testWeightAddition() {

        Quantity<WeightUnit> q1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> q2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        Quantity<WeightUnit> result = q1.add(q2, WeightUnit.KILOGRAM);

        assertEquals(2.0, result.getValue(), EPSILON);
    }

    // ---------------- VOLUME TESTS (UC11) ----------------

    @Test
    void testVolumeEquality_LitreMillilitre() {

        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> ml = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);

        assertEquals(litre, ml);
    }

    @Test
    void testVolumeEquality_GallonLitre() {

        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> litre = new Quantity<>(3.78541, VolumeUnit.LITRE);

        assertEquals(gallon, litre);
    }

    @Test
    void testVolumeConversion_LitreToMillilitre() {

        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);

        Quantity<VolumeUnit> result = litre.convertTo(VolumeUnit.MILLILITRE);

        assertEquals(1000.0, result.getValue(), EPSILON);
    }

    @Test
    void testVolumeConversion_GallonToLitre() {

        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);

        Quantity<VolumeUnit> result = gallon.convertTo(VolumeUnit.LITRE);

        assertEquals(3.78541, result.getValue(), EPSILON);
    }

    @Test
    void testVolumeAddition_LitreMillilitre() {

        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> ml = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);

        Quantity<VolumeUnit> result = litre.add(ml, VolumeUnit.LITRE);

        assertEquals(2.0, result.getValue(), EPSILON);
    }

    @Test
    void testVolumeAddition_LitreGallon() {

        Quantity<VolumeUnit> litre = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);

        Quantity<VolumeUnit> result = litre.add(gallon, VolumeUnit.LITRE);

        assertEquals(4.78541, result.getValue(), EPSILON);
    }

    // ---------------- CROSS CATEGORY TEST ----------------

    @Test
    void testCrossCategoryComparison() {

        Quantity<LengthUnit> length = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<WeightUnit> weight = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        assertFalse(length.equals(weight));
    }

    // ---------------- VALIDATION TESTS ----------------

    @Test
    void testNullUnit() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Quantity<>(1.0, null)
        );
    }

    @Test
    void testInvalidValue() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Quantity<>(Double.NaN, LengthUnit.FEET)
        );
    }
}