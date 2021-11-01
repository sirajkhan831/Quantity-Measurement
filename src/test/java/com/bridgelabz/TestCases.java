package com.bridgelabz;

import org.junit.*;

public class TestCases {

    @Test
    public void whenGiven1FeetAnd12Inch_shouldAssertEqual() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Assert.assertEquals(feet, new Length(Length.Unit.INCH, 12));
    }

    @Test
    public void whenGiven1YardAnd36Inch_shouldAssertEqual() {
        Length yard = new Length(Length.Unit.YARD, 1);
        Assert.assertEquals(yard, new Length(Length.Unit.FEET, 3));
    }

    @Test
    public void whenGiven2SameFeetValueObject_ifEqual_shouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet, new Length(Length.Unit.FEET, 0.0));
    }

    @Test
    public void whenGivenFeetAndInchObjects_shouldNotEquals() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, new Length(Length.Unit.INCH, 1.0));
    }

    @Test
    public void whenGiven2DifferentFeetValueObject_shouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(feet, new Length(Length.Unit.FEET, 1.0));
    }

    @Test
    public void whenGiven2SameInchValueObjects_shouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch, new Length(Length.Unit.INCH, 0.0));
    }

    @Test
    public void whenGiven2DifferentInchObjects_shouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, new Length(Length.Unit.INCH, 1.0));
    }

    @Test
    public void whenGiven0FeetAnd0Inch_shouldReturnEquals() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet, new Length(Length.Unit.INCH, 0.0));
    }

    @Test
    public void whenGiven1FeetAnd1Yard_shouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, new Length(Length.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven3FeetAnd1Yard_shouldReturnEquals() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Assert.assertEquals(feet, new Length(Length.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1InchAnd1Yard_shouldReturnNotEquals() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch, new Length(Length.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1YardAnd36Inch_shouldReturnEquals() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Assert.assertEquals(yard, new Length(Length.Unit.INCH, 36.0));
    }

    @Test
    public void whenGiven36InchAnd1Yard_shouldReturnEquals() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Assert.assertEquals(inch, new Length(Length.Unit.YARD, 1.0));
    }

    @Test
    public void whenGiven1YardAnd3Feet_shouldReturnEquals() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Assert.assertEquals(yard, new Length(Length.Unit.FEET, 3.0));
    }

    @Test
    public void whenGiven2InchAnd5Centimeter_shouldReturnEquals() {
        Length centimeter = new Length(Length.Unit.CENTIMETER, 5);
        Assert.assertEquals(centimeter, new Length(Length.Unit.INCH, 2));
    }

    @Test
    public void whenGivenTwoInchValues_whenAdded_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 2);
        Length inch2 = new Length(Length.Unit.INCH, 2);
        Assert.assertEquals(inch1.value() + inch2.value(), 4.0, 0.1);
    }

    @Test
    public void whenGivenInchAndFeetValues_whenAdded_shouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Length inch = new Length(Length.Unit.INCH, 2);
        Assert.assertEquals(inch.value() + feet.value(), 14.0, 0.5);
    }

    @Test
    public void whenGivenTwoFeetValues_whenAdded_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1);
        Length feet2 = new Length(Length.Unit.FEET, 1);
        Assert.assertEquals(feet2.value() + feet1.value(), 24.0, 0.5);
    }

    @Test
    public void whenGivenInchAndCentimeterValues_whenAdded_shouldReturnEqual() {
        Length centimeter = new Length(Length.Unit.CENTIMETER, 2.5);
        Length inch = new Length(Length.Unit.INCH, 2);
        Assert.assertEquals(inch.value() + centimeter.value(), 3, 0.5);
    }

    @Test
    public void whenGivenGallonAndLitre_shouldReturnEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLONS,1);
        Assert.assertEquals(gallon,new Volume(Volume.Unit.LITRES,3.78));
    }
    @Test
    public void whenGivenMlAndLitre_shouldReturnEqual() {
        Volume ml = new Volume(Volume.Unit.MILLILITRES,1000);
        Assert.assertEquals(ml,new Volume(Volume.Unit.LITRES,1));
    }
}
