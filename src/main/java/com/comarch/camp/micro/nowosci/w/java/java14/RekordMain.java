package com.comarch.camp.micro.nowosci.w.java.java14;

public class RekordMain {
    public static void main(String[] args) {
        Rekord rekord = new Rekord("Jan", "Kowalski", 40);
        System.out.println(rekord.imie());
        System.out.println(rekord.nazwisko());
        System.out.println(rekord.wiek());
        System.out.println(rekord);

        Rekord rekord2 = new Rekord("Jan", "Kowalski", 40);
        System.out.println(rekord.equals(rekord2));

        rekord.a();
    }
}
