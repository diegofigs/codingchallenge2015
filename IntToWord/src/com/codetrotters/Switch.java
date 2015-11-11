package com.codetrotters;

import java.util.LinkedList;
import java.util.Queue;

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
        // Queue that acts as a buffer for words
        Queue<String> wordQueue = new LinkedList<String>();
        // Entered number in String format
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
                wordQueue.add(NUMBERS[digit]);
                // Add hundred
                wordQueue.add("hundred");
            }

            // Second position
            else if(position == 8 || position == 5 || position == 2){
                // If higher than 1, add digit by ten word
                if(digit > 1)
                    wordQueue.add(BYTENS[digit]);
                // Else, look at next number for correct teen number word
                else {
                    String teenNumber = numberString.substring(i,i+2);
                    int teenDigit = Character.getNumericValue(teenNumber.charAt(1));
                    wordQueue.add(TEENS[teenDigit]);
                }
            }

            // First position
            else {
                // Check if previous number is higher than 1
                if(Character.getNumericValue(numberString.charAt(i-1)) > 1){
                    // Add digit word if not zero
                    if(digit != 0)
                        wordQueue.add(NUMBERS[digit]);
                }
                // Add million or thousand if necessary
                if(position == 7)
                    wordQueue.add("million");
                else if(position == 4)
                    wordQueue.add("thousand");
            }
        }
        // Fill numberString with words
        numberString = "";
        for(String word: wordQueue) {
            numberString += word + " ";
        }
        return numberString.trim();
    }
}
