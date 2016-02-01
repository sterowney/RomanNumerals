package com.thebluecabrio.roman.numerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by steven.rowney on 21/01/16.
 */
public class RomanNumeralConverterTest {

    private RomanNumeralConverter romanNumeralConverter;

    @Before
    public void setUp() throws Exception {

        romanNumeralConverter = new RomanNumeralConverter();

        assertNotNull(romanNumeralConverter);
    }

    @Test
    public void testConvertRomanNumeral() throws Exception {

        assertEquals(new Integer(1), romanNumeralConverter.convert(RomanNumeralConverter.I));
        assertEquals(new Integer(5), romanNumeralConverter.convert(RomanNumeralConverter.V));
        assertEquals(new Integer(10), romanNumeralConverter.convert(RomanNumeralConverter.X));
        assertEquals(new Integer(50), romanNumeralConverter.convert(RomanNumeralConverter.L));
        assertEquals(new Integer(100), romanNumeralConverter.convert(RomanNumeralConverter.C));
        assertEquals(new Integer(500), romanNumeralConverter.convert(RomanNumeralConverter.D));
        assertEquals(new Integer(1000), romanNumeralConverter.convert(RomanNumeralConverter.M));
    }

    @Test
    public void testInvalidNumeralOnConvert() throws Exception {

        assertEquals(null , romanNumeralConverter.convert("A"));
    }

    @Test
    public void testInvalidRomanNumeralString() throws Exception {

        // should we ignore the incorrect numeral or reject the log? We've gone for ignore.
        assertEquals(4, romanNumeralConverter.convertNumeralString("IVA"));
    }

    @Test
    public void testConvertRomanNumeralString() throws Exception {

        // I
        assertEquals(1, romanNumeralConverter.convertNumeralString(RomanNumeralConverter.I));

        // II
        assertEquals(2, romanNumeralConverter.convertNumeralString("II"));

        // III
        assertEquals(3, romanNumeralConverter.convertNumeralString("III"));

        // IV
        assertEquals(4, romanNumeralConverter.convertNumeralString("IV"));

        // V
        assertEquals(5, romanNumeralConverter.convertNumeralString("V"));

        // VI
        assertEquals(6, romanNumeralConverter.convertNumeralString("VI"));

        // VIII
        assertEquals(8, romanNumeralConverter.convertNumeralString("VIII"));
        assertEquals(9, romanNumeralConverter.convertNumeralString("IX"));
        assertEquals(11, romanNumeralConverter.convertNumeralString("XI"));
        assertEquals(12, romanNumeralConverter.convertNumeralString("XII"));
    }

    @Test
    public void testConvertRomanNumeral_Complex() throws Exception {

        assertEquals(1666, romanNumeralConverter.convertNumeralString("MDCLXVI"));

        assertEquals(2008, romanNumeralConverter.convertNumeralString("MMVIII"));

        assertEquals(1990, romanNumeralConverter.convertNumeralString("MCMXC"));

    }
}
