package com.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlus() {
        int answer = 2 + 2;
        assertEquals("2 + 2 = 4", 4, answer);
    }
}
