package com.comarch.camp.micro.nowosci.w.java.java12;

public class Switch {
    public static void main(String[] args) {
        int i = 2;

        switch(i) {
            case 1,2 -> System.out.println("1 albo 2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            default -> System.out.println("cos innego !!");
        }

        String result = switch(i) {
            case 1,2 -> "1 albo 2";
            case 3 -> "3";
            case 4 -> "4";
            default -> "Default value";
        };

        System.out.println(result);
    }
}
