package com.comarch.camp.micro.nowosci.w.java.java10;

import java.util.List;

public class KopiowanieKlekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println(list);
        List<Integer> copyList = List.copyOf(list);
        System.out.println(copyList);

        //copyList.add(6);
    }
}
