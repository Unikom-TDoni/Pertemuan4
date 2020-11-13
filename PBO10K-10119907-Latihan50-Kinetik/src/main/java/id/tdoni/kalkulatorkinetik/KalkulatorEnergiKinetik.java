/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.kalkulatorkinetik;

/**
 *
 * @author ACER
 */
public final class KalkulatorEnergiKinetik {
    final DataBolaBaseball dataBenda = new DataBolaBaseball();
    
    public float getMassaKg(){
        return dataBenda.massaKg;
    }
    
    public float getKecepatan() {
        return dataBenda.kecepatan;
    }
    
    public float getEnergiKinetik(){
        return (dataBenda.massaKg * (float)Math.pow(dataBenda.kecepatan, 2)) / 2;
    }
    
    public float getLajuDariKeadaanDiam() {
        return getEnergiKinetik();
    }
}
