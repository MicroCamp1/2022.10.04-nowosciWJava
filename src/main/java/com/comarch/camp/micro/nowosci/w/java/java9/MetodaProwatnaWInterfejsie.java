package com.comarch.camp.micro.nowosci.w.java.java9;

public interface MetodaProwatnaWInterfejsie {
    void add();

    default int diff(int a, int b) {
        print(a);
        print(b);
        return a-b;
    }

    private void print(int a) {
        System.out.println(a);
    }
}
