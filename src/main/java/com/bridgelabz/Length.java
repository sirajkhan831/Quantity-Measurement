package com.bridgelabz;

import java.util.HashMap;

/**
 * @author -> Siraj Khan
 */
public class Length {
    /**
     * This program converts all the length values to inch and vice versa
     */
    private final Unit unit;
    private final double number;
    private final double convertedValue;

    enum Unit {FEET, YARD, INCH, CENTIMETER}

    public Length(Unit unit, double number) {
        this.unit = unit;
        this.number = number;
        this.convertedValue = value();
    }

    /**
     * @return -> returns converted value
     * @value -> 1Feet=12Inch 1Yard=36Inch 1Cm=0.4Inch
     * This method is converting all the values to Inch
     */
    public double value() {
        HashMap<Unit, Double> conversionTable = new HashMap<>();
        conversionTable.put(Unit.FEET, 12 * number);
        conversionTable.put(Unit.YARD, 36 * number);
        conversionTable.put(Unit.INCH, 1 * number);
        conversionTable.put(Unit.CENTIMETER, 0.4 * number);
        return conversionTable.get(unit);
    }

    /**
     * Overriding the equals method to make sure only one object exists of same value
     *
     * @param o -> Object
     * @return -> Returns boolean value by comparing objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.convertedValue, convertedValue) == 0;
    }
}