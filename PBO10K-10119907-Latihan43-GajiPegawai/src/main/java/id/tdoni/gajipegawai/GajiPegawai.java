/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.gajipegawai;

/**
 *
 * @author ACER
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int getUangTransport() {
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan() {
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji() {
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan,int uangTransport,int gajiPokok) {
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("---------------");
        System.out.println("Nama Karywan: ".concat(nama));
        System.out.println("Alamat: ".concat(alamat));
        System.out.println("Uang Transport: Rp. ".concat(Integer.toString(uangTransport)));
        System.out.println("Uang Tunjangan: Rp. ".concat(Integer.toString(uangTunjangan)));
        System.out.println("Gaji Pokok: Rp. ".concat(Integer.toString(gajiPokok)));
        System.out.println("TOTAL GAJI: Rp. ".concat(Integer.toString(totalGaji)));
    }
}
