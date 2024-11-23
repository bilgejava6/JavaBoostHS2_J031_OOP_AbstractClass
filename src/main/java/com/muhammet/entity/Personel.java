package com.muhammet.entity;

import java.util.UUID;

public abstract class Personel {
    private String id;
    private String ad;
    private String email;
    private final double maasKatsayisi;

    public Personel(String ad, String email, double maasKatsayisi){
        id = UUID.randomUUID().toString();
        this.ad = ad;
        this.email = email;
        this.maasKatsayisi = maasKatsayisi;
    }

    abstract double maasHesapla(double asgariNetUcret);


    public String getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getEmail() {
        return email;
    }

    public double getMaasKatsayisi() {
        return maasKatsayisi;
    }
}
