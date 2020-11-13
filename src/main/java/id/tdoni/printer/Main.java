/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.printer;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk print nama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Aplikasi Pencetak Nama======");
        var scanner = new Scanner(System.in);
        var printer = buatDataPrinter(scanner);
        String nama = printer.getNama();
        int jumlahCetak = printer.getJmlCetak();
        printer.cetak(nama);
        printer.cetak(jumlahCetak, nama);
    }
    
    public static Printer buatDataPrinter(Scanner scanner) {
        var printer = new Printer();
        
        System.out.println("Masukan nama anda : ");
        var nama = scanner.nextLine();
        
        System.out.println("Mau cetak nama berapa kali? : ");
        var jumlahCetak = scanner.nextInt();
        
        printer.setNama(nama);
        printer.setJmlCetak(jumlahCetak);
        
        return printer;
    }
    
}
