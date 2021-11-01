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

    enum Unit {FEET, YARD, INCH, CENTIMETER}

    public Length(Unit unit, double number) {
        this.unit = unit;
        this.number = number;
    }
}