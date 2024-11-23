package com.muhammet.ornek;

public abstract class Sekil {
    String renk;
    private String tur;
    public Sekil(String renk, String tur){
        this.renk = renk;
        this.tur = tur;
    }

    abstract double alanHesapla();

    void bilgiVer(){
        System.out.println(renk+ " renkte bir "+tur+" dir");
    }
}
