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
}
