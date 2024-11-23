package com.muhammet;

import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;

public class Runner {
    public static void main(String[] args) {
       // her yıl ocak ayında belirlenir, temmuzda belli oranda zamlanır.
        double ahmetAmcaKatsayisi = 12.3;
        double asgariUcret = 17002;
        Hizmetli hizmetli = new Hizmetli("Demet TAŞKIN","demet.taskin@gmail.com", ahmetAmcaKatsayisi);
        Mudur mudur = new Mudur("Zeynep TOPRAK","z.toprak@gmail.com", ahmetAmcaKatsayisi,680,2);
        System.out.println("Müdür "+ mudur.getAd()+ " maaşı....: "+ mudur.maasHesapla(asgariUcret));
        System.out.println("Hizmetli "+ hizmetli.getAd()+ " maaşı....: "+ hizmetli.maasHesapla(asgariUcret));

        /**
         *
         *
         *
         */

    }
}