package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void givenFeetAndInches_WhenCompared_ShouldReturnTrue() {

        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);

        assertTrue(feet.equals(inches));
    }

    @Test
    void givenFeet_WhenConvertedToInches_ShouldReturn12() {

        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);

        Quantity<LengthUnit> result = feet.convertTo(LengthUnit.INCHES);

        assertEquals(12.0, result.getValue(), 0.01);
    }

    @Test
    void givenFeetAndInches_WhenAdded_ShouldReturn2Feet() {

        Quantity<LengthUnit> feet = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> inches = new Quantity<>(12.0, LengthUnit.INCHES);

        Quantity<LengthUnit> result =
                feet.add(inches, LengthUnit.FEET);

        assertEquals(2.0, result.getValue(), 0.01);
    }

    @Test
    void givenKilogramAndGram_WhenCompared_ShouldReturnTrue() {

        Quantity<WeightUnit> kg =
                new Quantity<>(1.0, WeightUnit.KILOGRAM);

        Quantity<WeightUnit> gram =
                new Quantity<>(1000.0, WeightUnit.GRAM);

        assertTrue(kg.equals(gram));
    }

    @Test
    void givenKg_WhenConvertedToGram_ShouldReturn1000() {

        Quantity<WeightUnit> kg =
                new Quantity<>(1.0, WeightUnit.KILOGRAM);

        Quantity<WeightUnit> result =
                kg.convertTo(WeightUnit.GRAM);

        assertEquals(1000.0, result.getValue(), 0.01);
    }

    @Test
    void givenLitreAndMilliLitre_WhenCompared_ShouldReturnTrue() {

        Quantity<VolumeUnit> litre =
                new Quantity<>(1.0, VolumeUnit.LITRE);

        Quantity<VolumeUnit> ml =
                new Quantity<>(1000.0, VolumeUnit.MILLILITRE);

        assertTrue(litre.equals(ml));
    }

    @Test
    void givenCelsiusAndFahrenheit_WhenCompared_ShouldReturnTrue() {

        Quantity<TemperatureUnit> celsius =
                new Quantity<>(0.0, TemperatureUnit.CELSIUS);

        Quantity<TemperatureUnit> fahrenheit =
                new Quantity<>(32.0, TemperatureUnit.FAHRENHEIT);

        assertTrue(celsius.equals(fahrenheit));
    }

    @Test
    void givenCelsius_WhenConvertedToFahrenheit_ShouldReturn212() {

        Quantity<TemperatureUnit> celsius =
                new Quantity<>(100.0, TemperatureUnit.CELSIUS);

        Quantity<TemperatureUnit> result =
                celsius.convertTo(TemperatureUnit.FAHRENHEIT);

        assertEquals(212.0, result.getValue(), 0.01);
    }

    @Test
    void givenTwoQuantities_WhenSubtracted_ShouldReturnCorrectValue() {

        Quantity<LengthUnit> feet1 =
                new Quantity<>(2.0, LengthUnit.FEET);

        Quantity<LengthUnit> feet2 =
                new Quantity<>(1.0, LengthUnit.FEET);

        Quantity<LengthUnit> result =
                feet1.subtract(feet2, LengthUnit.FEET);

        assertEquals(1.0, result.getValue(), 0.01);
    }

    @Test
    void givenTwoQuantities_WhenDivided_ShouldReturnRatio() {

        Quantity<LengthUnit> feet1 =
                new Quantity<>(4.0, LengthUnit.FEET);

        Quantity<LengthUnit> feet2 =
                new Quantity<>(2.0, LengthUnit.FEET);

        double result = feet1.divide(feet2);

        assertEquals(2.0, result, 0.01);
    }
}