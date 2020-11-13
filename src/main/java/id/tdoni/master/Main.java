/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.kalkulatornilai.*;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung nilai mahasiswa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var kalkulatorNilai = new KalkulatorNilai();
        
        DataNilai dataNilaiMahasiswaCollection[] = {
            new DataNilai(75, 45, 34),
            new DataNilai(60, 80, 75),
            new DataNilai(30, 80, 40)
        };
        
        for (var dataNilaiMahasiswa : dataNilaiMahasiswaCollection) {
            kalkulatorNilai.setDataNilai(dataNilaiMahasiswa);
            tampilkanDataNilaiMahasiswa(dataNilaiMahasiswa);
            tampilkanHasilKalkulatorNilai(kalkulatorNilai);
        }
    }
    
    private static void tampilkanDataNilaiMahasiswa(DataNilai dataNilaiMahasiswa) {
        System.out.printf("QUIZ \t\t\t= %.1f\n", dataNilaiMahasiswa.nilaiQuiz);
        System.out.printf("UTS \t\t\t= %.1f\n", dataNilaiMahasiswa.nilaiUts);
        System.out.printf("UAS \t\t\t= %.1f\n", dataNilaiMahasiswa.nilaiUas);
        System.out.println();
    }
    
    private static void tampilkanHasilKalkulatorNilai(KalkulatorNilai kalkulatorNilai) {
        System.out.printf("Nilai Ahkir \t\t= %.1f\n", kalkulatorNilai.getNilaiAhkir());
        System.out.println();
        System.out.printf("Index \t\t\t= %s\n", kalkulatorNilai.getIndexNilai());
        System.out.printf("Keterangan \t\t= %s\n", kalkulatorNilai.getKeteranganNilai());
        System.out.println();
    }
}
