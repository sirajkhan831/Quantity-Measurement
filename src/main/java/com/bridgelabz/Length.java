package com.bridgelabz;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Length extends QuantityMeasurement {

    /**
     * This class converts all the length values to inch and vice versa
     */
    public Length(Unit unit, double number) {
        super.convertedValue = conversionTable(unit, number);
    }
}