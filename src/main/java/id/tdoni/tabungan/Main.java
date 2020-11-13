/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        Tabungan tabungan;
        System.out.println("====Program Penarikan Uang====");
        tabungan = buatSaldoTabungan(scanner);
        tarikSaldoTabungan(scanner, tabungan);
    }
    
    public static Tabungan buatSaldoTabungan(Scanner scanner) {
        System.out.println("Masukan Saldo Awal : ");
        var saldoAwal = scanner.nextInt();
        return new Tabungan(saldoAwal);
    }
    
    public static void tarikSaldoTabungan(Scanner scanner,Tabungan tabungan) {
        System.out.println("Jumlah Uang Yang Diambil : ");
        var tarikSaldo = scanner.nextInt();
        var sisaSaldo = tabungan.ambilUang(tarikSaldo);
        System.out.println("Saldo Anda Sekarang : ".concat(Integer.toString(sisaSaldo)));
    }
    
}
