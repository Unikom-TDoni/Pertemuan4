/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.kalkulatorkinetik.KalkulatorEnergiKinetik;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung energi kinetik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var kalkulator = new KalkulatorEnergiKinetik();
        tampilkanHasilPerhitunganKalkulatorEnergiKinetik(kalkulator);
    }
    
    private static void tampilkanHasilPerhitunganKalkulatorEnergiKinetik(KalkulatorEnergiKinetik kalkulator) {
        System.out.println("======Hasil Perhitungan Energi Kinetik Suatu Benda======");
        System.out.printf("Massa Benda : %.3f Kg\n", kalkulator.getMassaKg());
        System.out.printf("Kecepatan Benda : %.1f m/s\n", kalkulator.getKecepatan());
        System.out.printf("Energi Kinetik Benda : %.3f Joule\n", kalkulator.getEnergiKinetik());
        System.out.printf("Usaha Benda Untuk Mencapai Kecepatan %.1f : %.3f Joule\n", kalkulator.getKecepatan(), kalkulator.getEnergiKinetik());
    }
    
}
