package com.muhammet.ornek;

public class Altigen extends Sekil{
    private final double kenarUzunlugu;

    public Altigen(String renk,double kenarUzunlugu){
        super(renk, "Altıgen");
        this.kenarUzunlugu = kenarUzunlugu;
    }

   public double alanHesapla() {
        // 6a^2*K3/4
        return (6 * kenarUzunlugu *kenarUzunlugu * Math.sqrt(3))/4;
    }

    void kenarUzunlugunuGoster(){
        System.out.println("altıgenin kenar uzunluğu....: "+ this.kenarUzunlugu);
    }
}
