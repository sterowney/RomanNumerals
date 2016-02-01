package com.thebluecabrio.roman.numerals;

/**
 * Created by steven.rowney on 25/01/16.
 */
public class ArabicConverter {

    protected static final String[] NUMERALS = new String[] {       "M",    "CM",   "D",    "CD",   "C",   "XC",   "L",    "XL",   "X",    "IX",   "V",    "IV",   "I"};
    protected static final Integer[] ARABIC_NUMBERS = new Integer[] {1000,   900,   500,    400,    100,    90,     50,     40,     10,     9,      5,      4,      1};

    private Integer remainder;

    public String convert(int arabicNumber) {

        StringBuilder result = new StringBuilder();
        remainder = arabicNumber;

        for(int i = 0; i < ARABIC_NUMBERS.length; i++) {

            while (remainder >= ARABIC_NUMBERS[i]) {
                result.append(NUMERALS[i]);
                remainder -= ARABIC_NUMBERS[i];
            }

        }

        return result.toString();
    }
}
