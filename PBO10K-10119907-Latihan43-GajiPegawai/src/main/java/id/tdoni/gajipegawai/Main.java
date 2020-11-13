/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.gajipegawai;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung gaji pegawai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var gajiPegawai = buatGajiPegawai();
        tampilkanGajiPegawai(gajiPegawai);
    }
    
    public static GajiPegawai buatGajiPegawai(){
        var gajiPegawai = new GajiPegawai();
        String nama = "Rizki Adam Kurniawan";
        String alamat = "Jalan Semar dlm 4 No 72/66";
        int uangTransport = 250000;
        int uangTunjangan = 300000;
        int gajiPokok = 4500000;
        
        gajiPegawai.setNama(nama);
        gajiPegawai.setAlamat(alamat);
        gajiPegawai.setUangTransport(uangTransport);
        gajiPegawai.setUangTunjangan(uangTunjangan);
        gajiPegawai.setGajiPokok(gajiPokok);
        
        return gajiPegawai;
    }
    
    public static void tampilkanGajiPegawai(GajiPegawai gajiPegawai) {
        String nama = gajiPegawai.getNama();
        String alamat = gajiPegawai.getAlamat();
        int uangTransport = gajiPegawai.getUangTransport();
        int uangTunjangan = gajiPegawai.getUangTunjangan();
        int gajiPokok = gajiPegawai.getGajiPokok();
        int totalGaji = gajiPegawai.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        
        gajiPegawai.setTotalGaji(totalGaji);
        gajiPegawai.tampilData(nama, alamat, uangTunjangan, uangTransport, gajiPokok, gajiPegawai.getTotalGaji());
    }
    
}
