package com.bridgelabz;

import java.util.HashMap;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Volume {

    /**
     * This program converts all the volume values to litres and vice versa
     */
    private final Unit unit;
    private final double number;
    private final double convertedValue;
    public HashMap<Unit, Double> conversionTable = new HashMap<>();        // Used for storing all the static conversion values

    enum Unit {GALLONS, LITRES, MILLILITRES}

    public Volume(Unit unit, double number) {
        this.unit = unit;
        this.number = number;
        this.convertedValue = value();
    }

    /**
     * @return -> returns converted value
     * @value -> 1Gallon=3.78Litres 1Litre=1000Millilitres
     * This method converts all the given values to Inch
     */
    public double value() {
        conversionTable.put(Unit.GALLONS, number * 3.78);
        conversionTable.put(Unit.LITRES, number);
        conversionTable.put(Unit.MILLILITRES, number / 1000.0);
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
        Volume volume = (Volume) o;
        return Double.compare(volume.convertedValue, convertedValue) == 0;
    }
}