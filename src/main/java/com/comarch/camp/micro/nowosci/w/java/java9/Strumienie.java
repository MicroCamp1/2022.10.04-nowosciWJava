package com.comarch.camp.micro.nowosci.w.java.java9;

import java.util.List;

public class Strumienie {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.stream().takeWhile(i -> i < 4).forEach(System.out::println);
        System.out.println("----------------");
        list.stream().dropWhile(i -> i < 4).forEach(System.out::println);
    }
}
