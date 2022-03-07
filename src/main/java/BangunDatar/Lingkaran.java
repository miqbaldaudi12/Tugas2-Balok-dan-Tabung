package BangunDatar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBidang {
    private double jari, luasbangun, kelilingbangun;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    public Lingkaran(){
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void luas() {
        this.luasbangun = (PHI * Math.pow(this.jari, 2));
    }

    @Override
    public void keliling() {
        this.kelilingbangun = (2 * PHI * this.jari);
    }

    public double getLuasbangun() {
        return luasbangun;
    }

    public double getKelilingbangun() {
        return kelilingbangun;
    }
    
    
}
