package com.comarch.camp.micro.nowosci.w.java.java10;

import java.util.List;
import java.util.stream.Collectors;

public class UnmodifableCollectors {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<String> collect = list.stream()
                .map(i -> i + "_STRING")
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        System.out.println(collect);
        //collect.add("ABC");
    }
}
