/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tandanyakamu;

/**
 *
 * @author ACER
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        if(umur >= 0 && umur <= 5)
            return "LAGI LUCU-LUCU NYA" + red;
        else if (umur > 5 && umur <= 10)
            return "MASIH ANAK ANAK" + red;
        else if (umur > 10 && umur <= 13)
            return "MASIH REMADJA" + red;
        else if (umur > 13 && umur <= 19)
            return "ALAY" + red;
        else if (umur > 19 && umur <= 29)
            return "LAGI GALAU NYARI JODOH" + red;
        else if (umur > 29 && umur <= 35)
            return "LAGI SIBUK NYARI UANG" + red;
        else if (umur > 35 && umur <= 150)
            return "SUDAH TUA"+ red;
        else
            return "TIDAK TERDETEKSI DI KEHIDUPAN" + red;
    }
}
