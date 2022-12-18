/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Suhaili Faruq
 */
public class laporan_penjualan {

    /**
     * @return the Tanggal_transaksi
     */
    public String getTanggal_transaksi() {
        return Tanggal_transaksi;
    }

    /**
     * @param Tanggal_transaksi the Tanggal_transaksi to set
     */
    public void setTanggal_transaksi(String Tanggal_transaksi) {
        this.Tanggal_transaksi = Tanggal_transaksi;
    }

  
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nama_barang
     */
    public String getNama_barang() {
        return nama_barang;
    }

    /**
     * @param nama_barang the nama_barang to set
     */
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @return the bayar
     */
    public float getBayar() {
        return bayar;
    }

    /**
     * @param bayar the bayar to set
     */
    public void setBayar(float bayar) {
        this.bayar = bayar;
    }

    /**
     * @return the kasir
     */
    public String getKasir() {
        return kasir;
    }

    /**
     * @param kasir the kasir to set
     */
    public void setKasir(String kasir) {
        this.kasir = kasir;
    }
   private int id;
   private String nama_barang;
   private String kategori;
   private int jumlah;
   private float bayar;
   private String kasir;
   private String Tanggal_transaksi;
}
