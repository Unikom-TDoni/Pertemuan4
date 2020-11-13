/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.kalkulatornilai;

/**
 *
 * @author ACER
 */
public enum IndexNilai {
    NONE(""),
    A("Sangat Baik"),
    B("Baik"),
    C("Cukup"),
    D("Kurang"),
    E("Sangat Kurang");
    
    private final String keterangan;
    
    private IndexNilai(String keterangan) {
        this.keterangan = keterangan;
    }
    
    String getKeterangan() {
        return keterangan;
    }
}
