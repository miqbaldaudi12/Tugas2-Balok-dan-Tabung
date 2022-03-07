package BangunRuang;

import BangunDatar.PersegiPanjang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi, volumebangun, lpermbangun;

    public Balok(double tinggi, double p, double l) {
        super(p, l);
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
        this.volumebangun = this.tinggi * super.getLuasbangun();
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
