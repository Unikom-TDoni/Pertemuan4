/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tokoemas;

/**
 *
 * @author ACER
 */
final class KalkulatorEmas {
    private final float beratEmas;
    private final KursBulananEmas kursBulanan;
    
    KalkulatorEmas(float beratEmas, KursBulananEmas kursBulanan) {
        this.beratEmas = beratEmas;
        this.kursBulanan = kursBulanan;
    }
    
    float getTotalHarga() {
        return beratEmas * kursBulanan.currentKurs;
    }
}
