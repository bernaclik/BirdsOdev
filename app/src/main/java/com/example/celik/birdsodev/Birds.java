package com.example.celik.birdsodev;

/**
 * Created by celik on 11.03.2017.
 */

public class Birds {

    String tip;
    String ozellik;
    int  resim;

    public Birds(String tip, String ozellik, int resim) {
        this.tip = tip;
        this.ozellik = ozellik;
        this.resim = resim;
    }

    public String getTip() {
        return tip;
    }

    public String getOzellik() {
        return ozellik;
    }

    public int getResim() {
        return resim;
    }
}
