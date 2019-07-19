package com.sonatype;

import java.util.Scanner;

/**
 * Class for convert from Integer numbers to English words
 * @author Julian Gomez
 */
public class NumberWordConverter {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if(number != 0) {
            return convertRecurr(number);
        } else {
            return "zero";
        }
    }

    private static String convertRecurr(int n) {
        if(n == Integer.MIN_VALUE) {
            return "This value is not supported";
        }

        if (n < 0) {
            return "minus " + convertRecurr(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convertRecurr(n % 100);
        }

        if (n < 1000000) {
            return convertRecurr(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convertRecurr(n % 1000);
        }

        if (n < 1000000000) {
            return convertRecurr(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convertRecurr(n % 1000000);
        }

        return convertRecurr(n / 1000000000) + " billion"  + ((n % 1000000000 != 0) ? " " : "") + convertRecurr(n % 1000000000);
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        String numberStr = "";

        System.out.println("Please enter a number to convert");
        while(!(numberStr = input.nextLine()).equals("exit")) {
            try{
                number = Integer.parseInt(numberStr);
                System.out.println(number + " = " + convert(number));

            } catch (NumberFormatException e) {
                System.out.println("This is not a valid number");
            }
            System.out.println("Please enter a number to convert or 'exit' to finish");
        }
    }
}