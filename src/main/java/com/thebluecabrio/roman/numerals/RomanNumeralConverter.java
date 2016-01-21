package com.thebluecabrio.roman.numerals;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by steven.rowney on 21/01/16.
 */
public class RomanNumeralConverter {

    protected static final String I = "I"; // 1
    protected static final String V = "V"; // 5
    protected static final String X = "X"; // 10
    protected static final String L = "L"; // 50
    protected static final String C = "C"; // 100
    protected static final String D = "D"; // 500
    protected static final String M = "M"; //1000

    private static Map<String, Integer> numeralMap;

    static {
        numeralMap = new HashMap<String, Integer>();
        numeralMap.put(I, 1);
        numeralMap.put(V, 5);
        numeralMap.put(X, 10);
        numeralMap.put(L, 50);
        numeralMap.put(C, 100);
        numeralMap.put(D, 500);
        numeralMap.put(M, 1000);
    }

    public RomanNumeralConverter() {

    }

    /**
     *
     * @param numeral
     * @return
     */
    public Integer convert(String numeral) {
        return numeralMap.get(numeral);
    }

    public int convertNumeralString(String numeralString) {

        Integer runningTotal = 0;
        Integer currentValue;
        Integer lastProcessedNumeral = 0;

        // work backwards through the numeral string
        for (int i = numeralString.length()-1; i >= 0; i--) {

            currentValue = convert(charToString(numeralString.charAt(i)));

            // what happens if the digit entered is incorrect because some idiot doesn't know roman numerals
            if(currentValue == null) {
                continue;
            }

            // if current value is greater than last number we processed
            if (currentValue < lastProcessedNumeral) {
                runningTotal -= currentValue;
            } else {
                runningTotal += currentValue;
            }

            lastProcessedNumeral = currentValue;
        }

        return runningTotal;
    }

    private String charToString(char numeral) {
        return String.valueOf(numeral);
    }
}
