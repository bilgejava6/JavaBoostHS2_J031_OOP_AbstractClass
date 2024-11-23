package com.muhammet.entity;

public class Mudur extends Personel{
    private String gorevTanimi;
    private final int gorevYuku;
    private final int kidemYili;
    public Mudur(String ad, String email, double maasKatsayisi, int gorevYuku, int kidemYili ){
        super(ad, email, maasKatsayisi);
        this.gorevYuku = gorevYuku;
        this.kidemYili = kidemYili;
    }

    public double maasHesapla(double asgariNetUcret){
        double temelMaas = asgariNetUcret * getMaasKatsayisi() * .25;
        double ekOdeme = asgariNetUcret * kidemYili * gorevYuku / 1000;
        return temelMaas + ekOdeme;
    }

    public String getGorevTanimi() {
        return gorevTanimi;
    }

    public void setGorevTanimi(String gorevTanimi) {
        this.gorevTanimi = gorevTanimi;
    }
}
