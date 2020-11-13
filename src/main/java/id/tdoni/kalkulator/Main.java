/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.kalkulator;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk mengatur method
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var kalkulator = buatKalkulator();
        TampilkanHasilKalkulator(kalkulator);
    }
    
    public static Kalkulator buatKalkulator() {
        var kalkulator = new Kalkulator();
        double value1 = 7d;
        double value2 = 5d;
        
        kalkulator.setValue1(value1);
        kalkulator.setValue2(value2);
        
        return kalkulator;
    }
    
    public static void TampilkanHasilKalkulator(Kalkulator kalkulator) {
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();
        String note = "This project shown you how to manage method in java";

        System.out.printf("VALUE 1 = %.1f\n", value1);
        System.out.printf("VALUE 2 = %.1f\n", value2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject(note);
        System.out.printf("Result Add is = %.1f\n", kalkulator.add(value1, value2));
        System.out.printf("Result Minus is = %.1f\n", kalkulator.minus(value1, value2));
        System.out.printf("Result Multiple is = %.1f\n", kalkulator.multiplication(value1, value2));
        System.out.printf("Result Division is = %.1f\n", kalkulator.division(value1, value2));
    }
    
}
