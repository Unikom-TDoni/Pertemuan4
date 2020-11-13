/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tandanyakamu;
import java.util.Scanner;
import java.time.LocalDateTime;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat status umur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        var age = buatDataUmur(scanner);
        TampilkanHasilPerhitungan(age);
    }
    
    public static Age buatDataUmur(Scanner scanner){
        var dateTime = LocalDateTime.now();
        var age = new Age(dateTime.getYear());
        
        System.out.println("Masukan Lahir Tahun Anda : ");
        var tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);
        
        return age;
    }
    
    public static void TampilkanHasilPerhitungan(Age age){
        int yearBirth = age.getYearBirth();
        int yearNow = age.getYearNow();
        int umur = age.hitungUmur();
        String status = age.tandanyaKamu(umur);
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir : ".concat(Integer.toString(yearBirth)));
        System.out.println("Hari ini tahun : ".concat(Integer.toString(yearNow)));
        System.out.println("Umur kamu sampai hari ini adalah ".concat(Integer.toString(umur)).concat(" Tahun"));
        System.out.println("Tandanya kamu ".concat(status));
    }
    
}
