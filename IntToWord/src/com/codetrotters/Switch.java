package com.codetrotters;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by diegofigs on 11/10/15.
 */
public class Switch {
    // Constant string arrays for conversion
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
    /**
     * @param number integer to be converted to string
     * @return equivalent string of number
     */
    public static String int_to_word(int number){
        // Stack for grouping digits into groups
        Stack<String> groupStack = new Stack<String>();
        // Queue that acts as a buffer for words
        Queue<String> wordQueue = new LinkedList<String>();

        // Entered number in String format
        String numberString = Integer.toString(number);

        // String buffer used as temp storage
        String buffer = "";
        // Divide number into three-digit groups
        for(int i = numberString.length()-1; i >= 0; i--) {
            Character c = numberString.charAt(i);
            buffer = c + buffer;
            if (buffer.length() == 3) {
                groupStack.add(buffer);
                buffer = "";
            }
        }
        if(!buffer.isEmpty())
            groupStack.add(buffer);

        numberString = "";
        // Iterate through every word group
        for(int j = groupStack.size(); j > 0; j--) {
            // Process next group using buffer
            buffer = groupStack.pop();

            // Iterate through every character in group adding words as needed
            for (int i = 0; i < buffer.length(); i++) {
                // Current digit being processed
                int digit = Character.getNumericValue(buffer.charAt(i));
                if(digit == 0)
                    continue;
                // Position of digit in entered number
                int position = buffer.length() - i;

                // Third position
                if (position == 3) {
                    // Add digit word
                    wordQueue.add(NUMBERS[digit]);
                    // Add hundred
                    wordQueue.add("hundred");
                }

                // Second position
                else if (position == 2) {
                    // If higher than 1, add digit by ten word
                    if (digit > 1)
                        wordQueue.add(BYTENS[digit]);
                        // Else, look at next number for correct teen number word
                    else if (digit == 1) {
                        String teenNumber = buffer.substring(i, i + 2);
                        int teenDigit = Character.getNumericValue(teenNumber.charAt(1));
                        wordQueue.add(TEENS[teenDigit]);
                    }
                }

                // First position
                else {
                    // If this digit is not the most significant
                    if (i != 0) {
                        // Check if previous number is higher than 1
                        if (Character.getNumericValue(buffer.charAt(i - 1)) != 1) {
                            wordQueue.add(NUMBERS[digit]);
                        }
                    }
                    // If it is, just add the number
                    else {
                        wordQueue.add(NUMBERS[digit]);
                    }
                }
            }
            if (j == 3 && !wordQueue.isEmpty())
                wordQueue.add("million");
            if (j == 2 && !wordQueue.isEmpty())
                wordQueue.add("thousand");
            // Empty wordQueue in numberString
            while (!wordQueue.isEmpty()) {
                numberString += wordQueue.remove() + " ";
            }

        }
        return numberString.trim();
    }
}
