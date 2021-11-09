package com.bridgelabz;

import org.junit.*;

public class TestCases {

    @Test
    public void whenGiven1FeetAnd12Inch_shouldAssertEqual() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 1);
        Assert.assertEquals(feet, new Length(QuantityMeasurement.Unit.INCH, 12));
    }

    @Test
    public void whenGiven1YardAnd36Inch_shouldAssertEqual() {
        Length yard = new Length(QuantityMeasurement.Unit.YARD, 1);
        Assert.assertEquals(yard, new Length(QuantityMeasurement.Unit.FEET, 3));
    }

    @Test
    public void whenGiven2SameFeetValueObject_ifEqual_shouldReturnTrue() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 0.0);
        Assert.assertEquals(feet, new Length(QuantityMeasurement.Unit.FEET, 0.0));
    }

    @Test
    public void whenGivenFeetAndInchObjects_shouldNotEquals() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, new Length(QuantityMeasurement.Unit.INCH, 1.0));
    }

    @Test
    public void whenGiven2DifferentFeetValueObject_shouldReturnFalse() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, new Length(QuantityMeasurement.Unit.FEET, 1.0));
    }

    @Test
    public void whenGiven2SameInchValueObjects_shouldReturnTrue() {
        Length inch = new Length(QuantityMeasurement.Unit.INCH, 0.0);
        Assert.assertEquals(inch, new Length(QuantityMeasurement.Unit.INCH, 0.0));
    }

    @Test
    public void whenGiven2DifferentInchObjects_shouldReturnFalse() {
        Length inch = new Length(QuantityMeasurement.Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, new Length(QuantityMeasurement.Unit.INCH, 1.0));
    }

    @Test
    public void whenGiven0FeetAnd0Inch_shouldReturnEquals() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 0.0);
        Assert.assertEquals(feet, new Length(QuantityMeasurement.Unit.INCH, 0.0));
    }

    @Test
    public void whenGiven1FeetAnd1Yard_shouldReturnNotEquals() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, new Length(QuantityMeasurement.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven3FeetAnd1Yard_shouldReturnEquals() {
        Length feet = new Length(QuantityMeasurement.Unit.FEET, 3.0);
        Assert.assertEquals(feet, new Length(QuantityMeasurement.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1InchAnd1Yard_shouldReturnNotEquals() {
        Length inch = new Length(QuantityMeasurement.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch, new Length(QuantityMeasurement.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1YardAnd36Inch_shouldReturnEquals() {
        Length yard = new Length(QuantityMeasurement.Unit.YARD, 1.0);
        Assert.assertEquals(yard, new Length(QuantityMeasurement.Unit.INCH, 36.0));
    }

    @Test
    public void whenGiven36InchAnd1Yard_shouldReturnEquals() {
        Length inch = new Length(QuantityMeasurement.Unit.INCH, 36.0);
        Assert.assertEquals(inch, new Length(QuantityMeasurement.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1YardAnd3Feet_shouldReturnEquals() {
        Length yard = new Length(QuantityMeasurement.Unit.YARD, 1.0);
        Assert.assertEquals(yard, new Length(QuantityMeasurement.Unit.FEET, 3.0));
    }

    @Test
    public void whenGiven2InchAnd5Centimeter_shouldReturnEquals() {
        Length centimeter = new Length(QuantityMeasurement.Unit.CENTIMETER, 5);
        Assert.assertEquals(centimeter, new Length(QuantityMeasurement.Unit.INCH, 2));
    }

    @Test
    public void whenGivenGallonAndLitre_shouldReturnEqual() {
        Volume gallon = new Volume(QuantityMeasurement.Unit.GALLONS, 1);
        Assert.assertEquals(gallon, new Volume(QuantityMeasurement.Unit.LITRES, 3.78));
    }

    @Test
    public void whenGivenMlAndLitre_shouldReturnEqual() {
        Volume millilitre = new Volume(QuantityMeasurement.Unit.MILLILITRES, 1000);
        Assert.assertEquals(millilitre, new Volume(QuantityMeasurement.Unit.LITRES, 1));
    }

    @Test
    public void whenGivenMilligramAndKilogram_shouldReturnEqual() {
        Weight kg = new Weight(QuantityMeasurement.Unit.KILOGRAM, 1);
        Assert.assertEquals(kg, new Weight(QuantityMeasurement.Unit.MILLIGRAM, 1000));
    }

    @Test
    public void whenGivenTonneAndKilogram_shouldReturnEqual() {
        Weight kg = new Weight(QuantityMeasurement.Unit.KILOGRAM, 1000);
        Assert.assertEquals(kg, new Weight(QuantityMeasurement.Unit.TONNE, 1));
    }

    @Test
    public void whenGivenCelsiusAndFahrenheit_shouldEqual() {
        Temperature fahrenheit = new Temperature(QuantityMeasurement.Unit.FAHRENHEIT, 212);
        Assert.assertEquals(fahrenheit, new Temperature(QuantityMeasurement.Unit.CELSIUS, 100));
    }
}