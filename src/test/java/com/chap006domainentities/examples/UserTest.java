package com.chap006domainentities.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();

        assertEquals("Default username expected","username", user.getUsername());
        assertEquals("Default username password","password", user.getPassword());
    }

    @Test
    public void canConstructANewUserWithParameters() {
        User user = new User("admin", "admin123");

        assertEquals("given username expected","admin", user.getUsername());
        assertEquals("given password expected","admin123", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("123admin");

        assertEquals("set password expected","123admin", user.getPassword());
    }
}
