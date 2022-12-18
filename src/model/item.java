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
public class item {

    /**
     * @return the harga_item
     */
    public float getHarga_item() {
        return harga_item;
    }

    /**
     * @param harga_item the harga_item to set
     */
    public void setHarga_item(float harga_item) {
        this.harga_item = harga_item;
    }

    /**
     * @return the harga_jual_item
     */
    public float getHarga_jual_item() {
        return harga_jual_item;
    }

    /**
     * @param harga_jual_item the harga_jual_item to set
     */
    public void setHarga_jual_item(float harga_jual_item) {
        this.harga_jual_item = harga_jual_item;
    }

    /**
     * @return the kd_item
     */
    public String getKd_item() {
        return kd_item;
    }

    /**
     * @param kd_item the kd_item to set
     */
    public void setKd_item(String kd_item) {
        this.kd_item = kd_item;
    }

    /**
     * @return the nama_item
     */
    public String getNama_item() {
        return nama_item;
    }

    /**
     * @param nama_item the nama_item to set
     */
    public void setNama_item(String nama_item) {
        this.nama_item = nama_item;
    }

 

    /**
     * @return the stok_item
     */
    public int getStok_item() {
        return stok_item;
    }

    /**
     * @param stok_item the stok_item to set
     */
    public void setStok_item(int stok_item) {
        this.stok_item = stok_item;
    }
    private String kd_item;
    private String nama_item;
    private float harga_item;
    private float harga_jual_item;
    private int stok_item;
}
