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
public final class KalkulatorNilai {
    private DataNilai dataNilai;
    
    private final float precentageQuiz = 20/100f;
    private final float precentageUts = 30/100f;
    private final float precentageUas = 50/100f;
    
    public void setDataNilai(DataNilai dataNilai) {
        this.dataNilai = dataNilai;
    }
    
    public float getNilaiAhkir() {
        return  dataNilai.nilaiQuiz * precentageQuiz + 
                dataNilai.nilaiUts * precentageUts + 
                dataNilai.nilaiUas * precentageUas;
    }
    
    public IndexNilai getIndexNilai() {
        var nilaiAkhir = getNilaiAhkir();
        if (nilaiAkhir > 80 && nilaiAkhir <= 100)
            return IndexNilai.A;
        else if (nilaiAkhir > 68 && nilaiAkhir <= 80)
            return IndexNilai.B;
        else if (nilaiAkhir > 56 && nilaiAkhir <= 68)
            return IndexNilai.C;
        else if (nilaiAkhir > 45 && nilaiAkhir <= 56)
            return IndexNilai.D;
        else
            return IndexNilai.E;
    }
    
    public String getKeteranganNilai(){
        var indexNilai = getIndexNilai();
        return indexNilai.getKeterangan();
    }
}
