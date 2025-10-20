package org.example;

import java.util.Scanner;

public class Operation {

    /**
     * I -> 1
     * II -> 2
     * III -> 3
     * IV -> 4
     * V -> 5
     * VI -> 6
     * VII -> 7
     * VIII -> 8
     * IX -> 9
     * X 10
     *
     * @param roman
     * @return
     */
    public static int convertFromRomanToArabic(String roman) {
        if (roman == null || roman.equals("")) {
            return 0;
        }

        if ("I".equalsIgnoreCase(roman)) {
            return 1;
        }
        if ("II".equals(roman)) {
            return 2;
        }
        if ("III".equals(roman)) {
            return 3;
        }
        return 4;
    }


    /*
    1- Write test
    2- Run
      2.1- Green: Do nothing and move to the next case
      2.2- Red: Write the minimal amount of code to make the test case green
    3- Run the test to ensure it is green
    4- Code refactor
     */


    /*
    test 1:
    Title: Covert number I to 1
    Input: I
    Expected output : 1

    test 2:
    Title: Covert number II to 2
    Input: II
    Expected output : 2
     */


}
