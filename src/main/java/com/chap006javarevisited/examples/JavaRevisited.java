package com.chap006javarevisited.examples;

import java.util.Locale;

public class JavaRevisited {
    public static String addHttp(String url) {
        return "http://" + url;
    }

    public static String likelyGenderIs(String title) {
        String likelyGender;
        switch (title.toLowerCase()) {
            case "sir":
            case "mr":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }
}
