package com.chap004testswithotherclasses.examples;

public class TestAppEnv {

//    public static final String URL = "http://192.123.0.3:67";
    public static final String domain = "http://192.123.0.3";
    public static final String port = "67";

    public static String getUrl() {
        return domain + ":" + port;
    }
}
