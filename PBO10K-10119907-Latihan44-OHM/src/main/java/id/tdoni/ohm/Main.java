/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.ohm;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tegangan baterai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var baterai = buatBaterai();
        System.out.println("======Hukum Ohm======");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println();
        tampilkanDataBaterai(baterai);
    }
    
    public static Baterai buatBaterai() {
        float kuatArus = 3f;
        float hambatan = 12f;
        return new Baterai(kuatArus, hambatan);
    }
    
    public static void tampilkanDataBaterai(Baterai baterai) {
        float kuatArus = baterai.getKuatArus();
        float hambatan = baterai.getHambatan();
        float hasilTegangan = baterai.hitungTegangan();
        System.out.println("Kuat Arus : ".concat(Float.toString(kuatArus).concat(" ampere")));
        System.out.println("Hambatan : ".concat(Float.toString(hambatan).concat(" ohm")));
        System.out.println("Hasil Tegangan : ".concat(Float.toString(hasilTegangan).concat(" volt")));
    }
    
}
