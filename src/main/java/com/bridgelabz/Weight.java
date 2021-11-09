package com.bridgelabz;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Weight extends QuantityMeasurement {

    /**
     * This class converts all the weight values to litres and vice versa
     */
    public Weight(Unit unit, double number) {
        super.convertedValue = conversionTable(unit, number);
    }
}