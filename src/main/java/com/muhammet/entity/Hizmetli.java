package com.muhammet.entity;

public class Hizmetli extends Personel{
    private String bagliBirim;

    public Hizmetli(String ad,String email,double maasKatsayisi){
        super(ad, email, maasKatsayisi);
    }

    public double maasHesapla(double asgariNetUcret) {
        return asgariNetUcret * .25 * getMaasKatsayisi();
    }

    public String getBagliBirim() {
        return bagliBirim;
    }

    public void setBagliBirim(String bagliBirim) {
        this.bagliBirim = bagliBirim;
    }
}
