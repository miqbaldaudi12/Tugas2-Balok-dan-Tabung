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
public class PersegiPanjang implements MenghitungBidang{
    private double p, l, luasbangun, kelilingbangun;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public void luas() {
        this.luasbangun = this.p * this.l;
    }

    @Override
    public void keliling() {
        this.kelilingbangun = 2*(this.p + this.l);
    }

    public double getLuasbangun() {
        return luasbangun;
    }

    public double getKelilingbangun() {
        return kelilingbangun;
    }
    
    
    
}
