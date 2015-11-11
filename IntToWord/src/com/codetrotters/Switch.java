package com.codetrotters;

/**
 * Created by diegofigs on 11/10/15.
 */
public class Switch {

    private static final String[] NUMBERS = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };

    private static final String [] TEENS = {
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private static final String [] BYTENS = {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    public static String int_to_word(int number){
        String numberString = Integer.toString(number);
        int length = numberString.length();

        // Iterate through every character adding words as needed
        for(int i = 0; i < length; i++){
            // Current digit being processed
            int digit = Character.getNumericValue(numberString.charAt(i));

            // Position of digit in entered number
            int position = length - i;

            // Third position
            if(position % 3 == 0){
                // Add digit word

                // Add hundred

            }

            // Second position
            else if(position == 8 || position == 5 || position == 2){
                // Check if higher than 1

                // Else, look at next number for correct teen number
            }
            
            // First position
            else {
                // Check if previous number is higher than 1

                // Add million or thousand if necessary
            }
        }

        return null;
    }
}
