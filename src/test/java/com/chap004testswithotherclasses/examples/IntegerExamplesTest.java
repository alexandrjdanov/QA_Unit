package com.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = 4;
        Integer five = 5;
        String fiveS = "5";
        Integer gotFromValueOf = Integer.valueOf(fiveS);
        int gotFromParseInt = Integer.parseInt(fiveS);
        assertEquals("int value returns int 4", 5, gotFromValueOf.intValue());
        assertEquals("int value returns int 5", 5, five.intValue());

        Integer a = new Integer(4);
        Integer b = new Integer(4);
        assertEquals(a, b);
        assertTrue(a.equals(b));
    }
}
