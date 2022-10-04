package com.comarch.camp.micro.nowosci.w.java.java11;

public class MetodyDlaKlasyString {
    public static void main(String[] args) {
        String s1 = " ";

        System.out.println(s1.isBlank());

        String lines = "A\nB\nC\nD";
        lines.lines().forEach(System.out::println);

        String toRepeat = "cos";
        String repeat = toRepeat.repeat(5);
        System.out.println(repeat);

        String toStrip = " ABC ";
        System.out.println(toStrip.strip());
        System.out.println(toStrip.stripLeading());
        System.out.println(toStrip.stripTrailing());
    }
}
