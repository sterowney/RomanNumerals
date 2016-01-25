package com.thebluecabrio.roman.numerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by steven.rowney on 25/01/16.
 */
public class ArabicConverterTest {

    private ArabicConverter arabicConverter;

    @Before
    public void setUp() throws Exception {
        arabicConverter = new ArabicConverter();

        assertEquals("The lengths should always be the same", ArabicConverter.ARABIC_NUMBERS.length, ArabicConverter.NUMERALS.length);
    }

    @Test
    public void testCreateArabicConverter() throws Exception {

        assertNotNull("This should not be null", arabicConverter);
    }

    @Test
    public void testConvert_One_To_I() throws Exception {

        assertEquals("The numeral returned should be I", "I", arabicConverter.convert(1));
    }

    @Test
    public void testConvert_Two_To_II() throws Exception {

        assertEquals("The numeral returned should be II", "II", arabicConverter.convert(2));
    }

    @Test
    public void testConvert_Three_To_III() throws Exception {

        assertEquals("The numeral returned should be III", "III", arabicConverter.convert(3));
    }

    @Test
    public void testConvert_Four_To_IV() throws Exception {

        assertEquals("The numeral returned should be IV", "IV", arabicConverter.convert(4));
    }

    @Test
    public void testConvert_Five_To_V() throws Exception {

        assertEquals("The numeral returned should be V", "V", arabicConverter.convert(5));
    }

    @Test
    public void testConvert_Six_To_VI() throws Exception {

        assertEquals("The numeral returned should be VI", "VI", arabicConverter.convert(6));
    }

    @Test
    public void testConvert_Seven_To_VII() throws Exception {

        assertEquals("The numeral returned should be VII", "VII", arabicConverter.convert(7));
    }

    @Test
    public void testConvert_Eight_To_VIII() throws Exception {

        assertEquals("The numeral returned should be VIII", "VIII", arabicConverter.convert(8));
    }

    @Test
    public void testConvert_Nine_To_IX() throws Exception {

        assertEquals("The numeral returned should be", "IX", arabicConverter.convert(9));
    }

    @Test
    public void testConvert_Ten_To_X() throws Exception {

        assertEquals("The numeral returned should be", "X", arabicConverter.convert(10));
    }

    @Test
    public void testConvert_Eleven_To_XI() throws Exception {

        assertEquals("The numeral returned should be", "XI", arabicConverter.convert(11));
    }

    @Test
    public void testConvert_Twelve_To_XII() throws Exception {

        assertEquals("The numeral returned should be", "XII", arabicConverter.convert(12));
    }

    @Test
    public void testConvert_Nineteen_To_XIX() throws Exception {

        assertEquals("The numeral returned should be", "XIX", arabicConverter.convert(19));
    }

    @Test
    public void testConvert_24_To_XXIV() throws Exception {

        assertEquals("The numeral returned should be", "XXIV", arabicConverter.convert(24));
    }

    @Test
    public void testConvert_50_To_L() throws Exception {

        assertEquals("The numeral returned should be", "L", arabicConverter.convert(50));

    }

    @Test
    public void testConvert_49_To_L() throws Exception {

        assertEquals("The numeral returned should be", "XLIX", arabicConverter.convert(49));

    }

    @Test
    public void testConvert_89_To_L() throws Exception {

        assertEquals("The numeral returned should be", "LXXXIX", arabicConverter.convert(89));

    }

    @Test
    public void testConvert_90_To_L() throws Exception {

        assertEquals("The numeral returned should be", "XC", arabicConverter.convert(90));

    }

    @Test
    public void testConvert_() throws Exception {

        assertEquals("The numeral returned should be", "MDLXXXVIII", arabicConverter.convert(1588));

    }

    @Test
    public void testConvert_CDL() throws Exception {

        assertEquals("The numeral returned should be", "", arabicConverter.convert(0));

    }
}
