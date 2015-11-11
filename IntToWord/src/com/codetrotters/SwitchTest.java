package com.codetrotters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by diegofigs on 11/10/15.
 */
public class SwitchTest {

    @Test
    public void testInt_to_word() throws Exception {
        String test = Switch.int_to_word(4527);
        assertEquals("four thousand five hundred twenty seven", test);
        test = Switch.int_to_word(200017);
        assertEquals("two hundred thousand seventeen", test);
        test = Switch.int_to_word(784);
        assertEquals("seven hundred eighty four", test);
        test = Switch.int_to_word(1000215);
        assertEquals("one million two hundred fifteen", test);
    }

    @Test
    public void testMillions() throws Exception {
        String test = Switch.int_to_word(201180000);
        assertEquals("two hundred one million one hundred eighty thousand", test);
        test = Switch.int_to_word(23000017);
        assertEquals("twenty three million seventeen", test);
        test = Switch.int_to_word(4019100);
        assertEquals("four million nineteen thousand one hundred", test);
        test = Switch.int_to_word(987053018);
        assertEquals("nine hundred eighty seven million fifty three thousand eighteen", test);
    }

    @Test
    public void testThousands() throws Exception {
        String test = Switch.int_to_word(10000);
        assertEquals("ten thousand", test);
        test = Switch.int_to_word(560117);
        assertEquals("five hundred sixty thousand one hundred seventeen", test);
        test = Switch.int_to_word(186101);
        assertEquals("one hundred eighty six thousand one hundred one", test);
        test = Switch.int_to_word(50718);
        assertEquals("fifty thousand seven hundred eighteen", test);
    }

    @Test
    public void testHundreds() throws Exception {
        String test = Switch.int_to_word(186);
        assertEquals("one hundred eighty six", test);
        test = Switch.int_to_word(18);
        assertEquals("eighteen", test);
        test = Switch.int_to_word(99);
        assertEquals("ninety nine", test);
        test = Switch.int_to_word(1);
        assertEquals("one", test);
    }
}