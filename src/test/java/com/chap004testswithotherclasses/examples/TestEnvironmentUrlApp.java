package com.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnvironmentUrlApp {

    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the domain", "http://192.123.0.3", TestAppEnv.domain);
        assertEquals("Just the port", "67", TestAppEnv.port);
    }
}
