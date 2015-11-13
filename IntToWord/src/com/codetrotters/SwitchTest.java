package com.codetrotters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by diegofigs on 11/10/15.
 */
public class SwitchTest {

    @Test
    /**
     * Test for examples outlined in README.md
     */
    public void testInt_to_word() throws Exception {
        String result = Switch.int_to_word(4527);
        assertEquals("four thousand five hundred twenty seven", result);
        result = Switch.int_to_word(200017);
        assertEquals("two hundred thousand seventeen", result);
        result = Switch.int_to_word(784);
        assertEquals("seven hundred eighty four", result);
        result = Switch.int_to_word(1000215);
        assertEquals("one million two hundred fifteen", result);
    }

    @Test
    /**
     * Test for numbers in the million's range.
     */
    public void testMillions() throws Exception {
        String result = Switch.int_to_word(201180000);
        assertEquals("two hundred one million one hundred eighty thousand", result);
        result = Switch.int_to_word(23000017);
        assertEquals("twenty three million seventeen", result);
        result = Switch.int_to_word(4019100);
        assertEquals("four million nineteen thousand one hundred", result);
        result = Switch.int_to_word(987053018);
        assertEquals("nine hundred eighty seven million fifty three thousand eighteen", result);
    }

    @Test
    /**
     * Test for numbers in the thousand's range.
     */
    public void testThousands() throws Exception {
        String result = Switch.int_to_word(10000);
        assertEquals("ten thousand", result);
        result = Switch.int_to_word(560117);
        assertEquals("five hundred sixty thousand one hundred seventeen", result);
        result = Switch.int_to_word(186101);
        assertEquals("one hundred eighty six thousand one hundred one", result);
        result = Switch.int_to_word(5718);
        assertEquals("five thousand seven hundred eighteen", result);
    }

    @Test
    /**
     * Test for numbers in the hundred's range, including zero.
     */
    public void testHundreds() throws Exception {
        String result = Switch.int_to_word(186);
        assertEquals("one hundred eighty six", result);
        result = Switch.int_to_word(18);
        assertEquals("eighteen", result);
        result = Switch.int_to_word(99);
        assertEquals("ninety nine", result);
        result = Switch.int_to_word(1);
        assertEquals("one", result);
        result = Switch.int_to_word(0);
        assertEquals("zero", result);
    }

    @Test
    /**
     * Test for negative numbers.
     */
    public void testNegatives() throws Exception {
        String result = Switch.int_to_word(-8);
        assertEquals("negative eight", result);
        result = Switch.int_to_word(-12065);
        assertEquals("negative twelve thousand sixty five", result);
        result = Switch.int_to_word(-581);
        assertEquals("negative five hundred eighty one", result);
        result = Switch.int_to_word(-1081783);
        assertEquals("negative one million eighty one thousand seven hundred eighty three", result);

    }
}