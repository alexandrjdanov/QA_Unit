package com.chap006domainentities.examples;

public class AdminUser extends User{

    public AdminUser() {
        this("admin", "pass123");
    }

    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public String getPermission() {
        return "elevated";
    }
}
