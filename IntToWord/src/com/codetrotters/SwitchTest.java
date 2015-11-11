package com.codetrotters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
}