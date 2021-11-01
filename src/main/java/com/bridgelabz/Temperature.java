package com.bridgelabz;

import java.util.HashMap;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Temperature {

    /**
     * This program converts all the temperature values to celsius and vice versa
     */
    private final Unit unit;
    private final double number;
    private final double convertedValue;
    public HashMap<Unit, Double> conversionTable = new HashMap<>();        // Used for storing all the static conversion values

    enum Unit {CELSIUS, FAHRENHEIT}

    public Temperature(Unit unit, double number) {
        this.unit = unit;
        this.number = number;
        this.convertedValue = value();
    }

    /**
     * @return -> returns converted value
     * @value -> 100 Celsius = 212 Fahrenheit
     * This method converts all the given values to Inch
     */
    public double value() {
        conversionTable.put(Unit.FAHRENHEIT, (number - 32) * ((double) 5 / 9));
        conversionTable.put(Unit.CELSIUS, number);
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
        Temperature temperature = (Temperature) o;
        return Double.compare(temperature.convertedValue, convertedValue) == 0;
    }
}