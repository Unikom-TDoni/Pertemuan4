/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.kubus;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung massa jenis kubus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var kubus = buatDataKubus();
        tampilkanDataKubus(kubus);
        tampilkanHasilPerhitunganKubus(kubus);
    }
    
    public static Kubus buatDataKubus(){
        var kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        return kubus;
    }
    
    public static void tampilkanDataKubus(Kubus kubus) {
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : ".concat(Integer.toString(kubus.getSisi())));
        System.out.println("Massa : ".concat(Integer.toString(kubus.getMassa())));
        System.out.println();
    }
    
    public static void tampilkanHasilPerhitunganKubus(Kubus kubus) {
        System.out.println("=====Hasil Perhitungan=====");
        int sisi = kubus.getSisi();
        int massa = kubus.getMassa();
        int volume = kubus.hitungVolume(sisi);
        int massaJenis = kubus.hitungMassaJenis(massa, volume);
        System.out.println("Volume : ".concat(Integer.toString(volume)));
        System.out.println("Massa Jenis : ".concat(Integer.toString(massaJenis)));

    }
    
}
