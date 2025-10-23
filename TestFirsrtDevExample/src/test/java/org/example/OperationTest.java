package org.example;

import org.junit.Assert;
import org.junit.Test;


public class OperationTest {

    /**
     * Title: Test convert Romain to Arabic for number I
     * Description: Test converting number I to one
     *
     * input: I
     * Expected output: 1
     * Steps to run the test:
     * - Call the convertFromRomanToArabic
     */
    @Test
    public void testIOperation() {

        int expectedResult = 1;
        String input = "I";
        verify(input, expectedResult);
    }

    @Test
    public void testSmallIOperation() {

        int expectedResult = 1;
        String input = "i";
        verify(input, expectedResult);
    }

    @Test
    public void testIIOperation() {

        int expectedResult = 2;
        String input = "II";
        verify(input, expectedResult);
    }

    @Test
    public void testIIIOperation() {

        int expectedResult = 3;
        String input = "III";
        verify(input, expectedResult);
    }

    @Test
    public void testIVOperation() {

        int expectedResult = 4;
        String input = "IV";
        verify(input, expectedResult);
    }

    @Test
    public void testEmptyStringOperation() {

        int expectedResult = 0;
        String input = "";
        verify(input, expectedResult);
    }

    @Test
    public void testNullStringOperation() {

        int expectedResult = 0;
        String input = null;

        verify(input, expectedResult);
    }

    private void verify(String input, int expectedResult) {

        int actualResult = Operation.convertFromRomanToArabic(input);

        //Checking ensure actualResult == expectedResult
        Assert.assertEquals(expectedResult, actualResult);
    }
}