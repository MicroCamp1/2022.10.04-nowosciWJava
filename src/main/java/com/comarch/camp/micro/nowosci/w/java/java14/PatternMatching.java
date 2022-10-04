package com.comarch.camp.micro.nowosci.w.java.java14;

import java.util.Locale;

public class PatternMatching {
    public static void main(String[] args) {
        Object o = "ABC";
        if(o instanceof String) {
            String s = (String) o;
            System.out.println(s.toLowerCase());
        }

        Object o2 = "ABC";
        if(o instanceof String s) {
            System.out.println(s.toLowerCase());
        }
    }
}
