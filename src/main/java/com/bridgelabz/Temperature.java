package com.bridgelabz;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Temperature extends QuantityMeasurement {

    /**
     * This class converts all the temperature values to celsius and vice versa
     */
    public Temperature(Unit unit, double number) {
        super.convertedValue = conversionTable(unit, number);
    }
}