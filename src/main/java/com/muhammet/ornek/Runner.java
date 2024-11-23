package com.muhammet.ornek;

public class Runner {
    public static void main(String[] args) {
        Altigen altigen = new Altigen("Yeşil",6.3);
        double alan = altigen.alanHesapla();
        System.out.println("altıgenin alanı...: "+ alan);
        altigen.kenarUzunlugunuGoster();
        altigen.bilgiVer();
    }
}
