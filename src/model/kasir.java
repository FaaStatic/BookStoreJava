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
public class kasir {

    /**
     * @return the jekel
     */
    public String getJekel() {
        return jekel;
    }

    /**
     * @param jekel the jekel to set
     */
    public void setJekel(String jekel) {
        this.jekel = jekel;
    }

    /**
     * @return the tanggal_masuk
     */
    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    /**
     * @param tanggal_masuk the tanggal_masuk to set
     */
    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    /**
     * @return the ShowAbsen
     */
    public int getShowAbsen() {
        return ShowAbsen;
    }

    /**
     * @param ShowAbsen the ShowAbsen to set
     */
    public void setShowAbsen(int ShowAbsen) {
        this.ShowAbsen = ShowAbsen;
    }



    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the pass
     */
    public String getPass() {
            return this.pass;
        
       
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the Shift
     */
    public String getShift() {
        return Shift;
    }

    /**
     * @param Shift the Shift to set
     */
    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    /**
     * @return the absen
     */
    public int getAbsen() {
        return absen;
    }

    /**
     */
    public void setAbsen() {
        this.absen += 1;
    }
    

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the kodeunik
     */
    public int getKodeunik() {
        return kodeunik;
    }

    /**
     * @param kodeunik the kodeunik to set
     */
    public void setKodeunik(int kodeunik) {
        this.kodeunik = kodeunik;
    }
    
    private String kode;
    private String nama;
    private String user;
    private String pass;
    private String Shift;
    private int kodeunik;
    private int absen = 0;
    private int ShowAbsen;
    private String tanggal_masuk;
    private String jekel;

  
}
