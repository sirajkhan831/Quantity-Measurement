package com.bridgelabz;

import java.util.HashMap;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class QuantityMeasurement {

    /**
     * This program converts all the values to their base values.
     */
    public double convertedValue;

    public enum Unit {
        FEET, INCH, CENTIMETER, YARD, GALLONS, LITRES, MILLILITRES, KILOGRAM, MILLIGRAM, TONNE, FAHRENHEIT, CELSIUS
    }

    /**
     * This method converts all the given their base values.
     *
     * @return -> returns converted value.
     * @value -> Lengths -> inch, Weights -> kg, Volumes -> litres and Temperatures -> celsius. | [Format : Quantity Type -> Base Quantity]
     */
    public double conversionTable(Unit unit, double number) {
        HashMap<Unit, Double> conversionTable = new HashMap<>();                    //HashMap used for storing all the static conversion values.
        conversionTable.put(Unit.KILOGRAM, number);
        conversionTable.put(Unit.MILLIGRAM, number / 1000);
        conversionTable.put(Unit.TONNE, number * 1000.0);
        conversionTable.put(Unit.GALLONS, number * 3.78);
        conversionTable.put(Unit.LITRES, number);
        conversionTable.put(Unit.MILLILITRES, number / 1000.0);
        conversionTable.put(Unit.FEET, 12 * number);
        conversionTable.put(Unit.YARD, 36 * number);
        conversionTable.put(Unit.INCH, number);
        conversionTable.put(Unit.CENTIMETER, 0.4 * number);
        conversionTable.put(Unit.FAHRENHEIT, (number - 32) * ((double) 5 / 9));
        conversionTable.put(Unit.CELSIUS, number);
        return conversionTable.get(unit);
    }

    /**
     * Overriding the equals method to make sure only one object exists of same value
     *
     * @param o -> Object
     * @return -> Returns boolean value by comparing objects | if true -> Similar object already exists.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.convertedValue, convertedValue) == 0;
    }
}
