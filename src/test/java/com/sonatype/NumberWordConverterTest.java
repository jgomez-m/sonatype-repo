package com.sonatype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberWordConverterTest {

    @Test
    public void testConvertUnitsNumber() {
        int number = 9;
        String expected = "nine";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 8;
        expected = "eight";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 7;
        expected = "seven";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 6;
        expected = "six";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 5;
        expected = "five";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 4;
        expected = "four";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 3;
        expected = "three";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 2;
        expected = "two";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 1;
        expected = "one";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertHundredPositiveNumber() {
        int number = 100;
        String expected = "one hundred";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertHundredNegativeNumber() {
        int number = -100;
        String expected = "minus one hundred";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertTensNumbers() {
        int number = 20;
        String expected = "twenty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 30;
        expected = "thirty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 40;
        expected = "forty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 50;
        expected = "fifty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 60;
        expected = "sixty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 70;
        expected = "seventy";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 80;
        expected = "eighty";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));

        number = 90;
        expected = "ninety";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertThousandNumber() {
        int number = 999;
        String expected = "nine hundred ninety nine";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertMillionNumber() {
        int number = 999999;
        String expected = "nine hundred ninety nine thousand nine hundred ninety nine";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testConvertBillionNumber() {
        int number = 1000000000;
        String expected = "one billion";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testMaximumInteger() {
        int number = Integer.MAX_VALUE;
        String expected = "two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testMinimumInteger() {
        int number = Integer.MIN_VALUE;
        String expected = "This value is not supported";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

    @Test
    public void testZeroNumber() {
        int number = 0;
        String expected = "zero";
        assertEquals("Number expected", expected, NumberWordConverter.convert(number));
    }

}
