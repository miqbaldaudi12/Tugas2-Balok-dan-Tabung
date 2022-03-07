package BangunRuang;

import BangunDatar.Lingkaran;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi, volumebangun, lpermbangun;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void volume() {
        this.volumebangun = (super.getLuasbangun() * this.tinggi);
    }

    @Override
    public void lperm() {
        this.lpermbangun = (super.getKelilingbangun() * this.tinggi + 2 * super.getLuasbangun());
    }

    public double getVolumebangun() {
        return volumebangun;
    }

    public double getLpermbangun() {
        return lpermbangun;
    }
    
    
    
    
}
