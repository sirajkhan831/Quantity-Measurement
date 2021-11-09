package com.bridgelabz;

/**
 * @author -> Siraj Khan
 * @version -> 1.0
 */
public class Volume extends QuantityMeasurement {

    /**
     * This class converts all the volume values to kilogram and vice versa
     */
    public Volume(Unit unit, double number) {
        super.convertedValue = conversionTable(unit, number);
    }
}