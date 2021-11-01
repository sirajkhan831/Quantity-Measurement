package com.bridgelabz;

import java.util.HashMap;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Weight {

    /**
     * This program converts all the weight values to Kilogram and vice versa
     */
    private final Unit unit;
    private final double number;
    private final double convertedValue;
    public HashMap<Unit, Double> conversionTable = new HashMap<>();        // Used for storing all the static conversion values

    enum Unit {KILOGRAM, MILLIGRAM, TONNE}

    public Weight(Unit unit, double number) {
        this.unit = unit;
        this.number = number;
        this.convertedValue = value();
    }

    /**
     * @return -> returns converted value
     * @value -> 1Tonne=1000KG 1KG=1000Milligrams
     * This method converts all the given values to Inch
     */
    public double value() {
        conversionTable.put(Unit.KILOGRAM, number);
        conversionTable.put(Unit.MILLIGRAM, number / 1000);
        conversionTable.put(Unit.TONNE, number * 1000.0);
        return conversionTable.get(unit);
    }

    /**
     * Overriding the equals method to make sure only one object exists of same value
     *
     * @param o -> Object
     * @return -> Returns boolean value by comparing objects | if true -> Similar Object already exists.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.convertedValue, convertedValue) == 0;
    }
}