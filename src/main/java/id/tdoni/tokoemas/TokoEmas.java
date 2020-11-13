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
public final class TokoEmas {
    private final String namaToko = "Semar Jaya";
    private final DataPembeli dataPembeli = new DataPembeli();
    private final KursBulananEmas kursBulanan = KursBulananEmas.OCTOBER;
    private final KalkulatorEmas kalkulator = 
            new KalkulatorEmas(dataPembeli.beratEmasInginDiBeli, kursBulanan);
    
    public void tampilkanStructPembelian() {
        System.out.printf("======Struck Pembelian Emas Di Toko %s======\n", namaToko);
        System.out.println();
        System.out.println("Nama Pembeli = ".concat(dataPembeli.getNama()));
        System.out.printf("Jumlah Yang Dibeli = %,.1f gram\n", dataPembeli.beratEmasInginDiBeli);
        System.out.printf("Kurs Emas Bulan Ini = Rp.%,d\n", kursBulanan.currentKurs);
        System.out.printf("Total Biaya Yang Dibayar = Rp.%,.1f\n", kalkulator.getTotalHarga());
    }
}