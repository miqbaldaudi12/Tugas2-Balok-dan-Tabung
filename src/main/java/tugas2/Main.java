package tugas2;

import BangunRuang.Tabung;
import BangunRuang.Balok;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        int pilihan, ulang;
        double panjang, lebar, jari, tinggiBalok, tinggiTabung;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("|----------------------------------------|");
            System.out.println("|Program Luas dan Volume Balok Dan Tabung");
            System.out.println("|----------------------------------------|");
            System.out.println("Opsi");
            System.out.println("------------");
            System.out.println("1. Tabung ");
            System.out.println("2. Balok");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            System.out.println();
            switch(pilihan){
                case 1:
                    System.out.print("Masukkan Tinggi tabung : "); tinggiTabung = input.nextDouble();
                    System.out.print("Masukkan Jari-Jari : "); jari = input.nextDouble();
                    Tabung tabung = new Tabung(tinggiTabung, jari);
                    tabung.luas(); tabung.keliling(); tabung.volume(); tabung.lperm();
                    System.out.println("Luas Lingkaran = "+tabung.getLuasbangun());
                    System.out.println("Keliling Lingkaran = "+tabung.getKelilingbangun());
                    System.out.println("Volume Tabung = "+tabung.getVolumebangun());
                    System.out.println("Luas Permukaan Tabung = "+tabung.getLpermbangun());
                    break;

                case 2:
                    System.out.print("Masukkan Panjang Balok : "); panjang = input.nextDouble();
                    System.out.print("Masukkan lebar balok : "); lebar = input.nextDouble();
                    System.out.print("Masukkan Tinggi Balok : "); tinggiBalok = input.nextDouble();
                    Balok balok = new Balok(tinggiBalok, panjang, lebar);
                    balok.luas(); balok.keliling(); balok.volume(); balok.lperm();
                    System.out.println("Luas Persegi Panjang = "+balok.getLuasbangun());
                    System.out.println("Keliling Persegi Panjang = "+balok.getKelilingbangun());
                    System.out.println("Volume Balok = "+balok.getVolumebangun());
                    System.out.println("Luas Permukaan Balok = "+balok.getLpermbangun());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                        System.out.println("Opsi Tidak Ada, Mohon Masukkan Opsi dengan Benar");
                        break;
            } 
            System.out.print("Apakah anda ingin mengulangi ? (Ya:1 || Tidak :0)");
            ulang = input.nextInt();
            
        
        } while (ulang==1);
        
        
    }
}
