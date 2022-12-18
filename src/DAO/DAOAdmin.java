/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOInterface.AdminInterface;
import DAOInterface.BarangInterface;
import DAOInterface.BukuInterface;
import DAOInterface.operatorInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import konek.konekDB;
import model.Ringkas;
import model.adminLogin;
import model.buku;
import model.item;
import model.kasir;

/**
 *
 * @author Suhaili Faruq
 */
public class DAOAdmin extends DAOPenjualan implements BarangInterface,BukuInterface,operatorInterface,AdminInterface{

  
    Connection konek;
    
    final String queryBukuInsert = "INSERT INTO tb_buku (kd_buku,judul_buku,genre_buku,penulis_buku,penerbit_buku,tahun_buku,harga_buku,"
                                   + "harga_jual_buku,stok_buku)VALUES(?,?,?,?,?,?,?,?,?);";
    final String queryBukuUpdate = "UPDATE tb_buku SET judul_buku=?,genre_buku=?,penulis_buku=?,penerbit_buku=?,tahun_buku=?,harga_buku=?,"
                                   +"harga_jual_buku=?,stok_buku=? WHERE kd_buku = ?;";
    final String queryBukuSelect = "SELECT * FROM tb_buku;";
    final String queryBukuCari = "SELECT * FROM tb_buku WHERE judul_buku = ?;";
    final String queryBukuHapus = "DELETE FROM tb_buku WHERE kd_buku = ?;";
    
    final String queryItemInsert = "INSERT INTO tb_item (kd_item,nama_item,harga_item,"
                                   + "harga_jual_item,stok_item)VALUES(?,?,?,?,?);";
    final String queryItemUpdate = "UPDATE tb_item SET nama_item=?,harga_item=?,harga_jual_item=?,stok_item=? "
                                   +"WHERE kd_item = ?;";
    final String queryItemSelect = "SELECT * FROM tb_item;";
    final String queryItemCari = "SELECT * FROM tb_item WHERE nama_item = ?;";
    final String queryItemHapus = "DELETE FROM tb_item WHERE kd_item = ?;";
    
    final String queryKasirInsert = "INSERT INTO tb_kasir (kd_kasir,nama,kodeunik,shift)"
                                   + "VALUES(?,?,?,?);";
    protected final String queryRegisInsert = "UPDATE tb_kasir set username=?,pass=?"
                                   + "WHERE kodeunik=?;";
    protected final String queryAbsenInsert = "UPDATE tb_kasir SET absen=? WHERE username=?;";
    final String queryKasirUpdate = "UPDATE tb_kasir SET nama=?,shift=?"
                                   +"WHERE kd_kasir = ?;";
    final String queryStokBukuUpdate = "UPDATE tb_buku SET stok_buku=? where judul_buku=?;";
      final String queryStokItemUpdate = "UPDATE tb_item SET stok_item=? where nama_item=?;";
    final String queryKasirSelect = "SELECT * FROM tb_kasir";
    final String queryKasirCari = "SELECT * FROM tb_kasir WHERE kd_kasir = ?;";
    final String queryKasirHapus = "DELETE FROM tb_kasir WHERE kd_kasir = ?;";
    final String queryAdminCek = "SELECT * FROM admin;";
    final String queryStokBukuKurang = "SELECT stok_buku FROM tb_buku WHERE judul_buku=?;";
    final String queryStokBukuUpdateStok = "UPDATE tb_buku SET stok_buku WHERE judul_buku=? ;";
    final String queryStokBarangKurang = "SELECT * FROM tb_item WHERE nama_item=?;";
    final String queryStokBarangUpdateStok = "UPDATE tb_item SET stok_item=? WHERE nama_item=?;";
    
    private ResultSet rs = null;
    private Statement st;
    private PreparedStatement psmt = null;
    List<item> itemList=null;
    List<buku> bukuList = null;
    List<kasir> kasirList = null;
    List<Ringkas> ringkasList = null;
   
    boolean status =false;
    
  public DAOAdmin(){
      konek = konekDB.connect();
  }
  
    @Override
   public boolean insertBarang(item ku) {
       
        try {
             psmt = konek.prepareStatement(queryItemInsert);
             psmt.setString(1, ku.getKd_item());
             psmt.setString(2, ku.getNama_item());
             psmt.setFloat(3, ku.getHarga_item()); 
             psmt.setFloat(4, ku.getHarga_jual_item());
             psmt.setInt(5, ku.getStok_item());
             psmt.execute();      
             status = true;
        }
        catch (SQLException e) {
            System.out.println("err "+e);
        }
        return status;
    }

    @Override
    public boolean updateBarang(item ku) {
        
        try {
            psmt = konek.prepareStatement(queryItemUpdate);
             psmt.setString(1, ku.getNama_item());
             psmt.setFloat(2, ku.getHarga_item());
             psmt.setFloat(3, ku.getHarga_jual_item());
             psmt.setInt(4, ku.getStok_item());
             psmt.setString(5, ku.getKd_item());
             psmt.executeUpdate();
       status = true;
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
      return status;
    }

    @Override
    public boolean HapusBarang(String nama) {
        
        try {
             psmt = konek.prepareStatement(queryItemHapus);
             psmt.setString(1, nama);
             psmt.executeUpdate();
            status=true;
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
     return status;
    }

    @Override
    public List<item> showBarangAll() {
        itemList = new ArrayList<item>();
        try {
            st =konek.createStatement();
           rs =st.executeQuery(queryItemSelect);
            while(rs.next()){
                item acc = new item();
                acc.setKd_item(rs.getString("kd_item"));
                acc.setNama_item(rs.getString("nama_item"));
                acc.setHarga_item(rs.getFloat("harga_item"));
                acc.setHarga_jual_item(rs.getFloat("harga_jual_item"));
                acc.setStok_item(rs.getInt("stok_item"));
                itemList.add(acc);
            }
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
        
        return itemList;
    }

    @Override
    public List<item> showBarangCari(String nama) {
        itemList = new ArrayList<item>();
        try {
            psmt = konek.prepareStatement(queryItemCari);
             psmt.setString(1, nama);
            rs = psmt.executeQuery();
            while(rs.next()){
                item b = new item();
                b.setKd_item(nama);
                b.setNama_item(rs.getString("nama_item"));
                b.setHarga_item(rs.getFloat("harga_item"));
                b.setHarga_jual_item(rs.getFloat("harga_jual_item"));
                b.setStok_item(rs.getInt("stok_item"));
                itemList.add(b);
            }
        }
        catch (SQLException e) 
        {
            System.out.println("eror"+e);
        }
        
        return itemList;
    }

    @Override
    public String StokBarang(String nama) {
        String hasil;
        int temp = 0;
        try {
            psmt = konek.prepareStatement(queryItemCari);
            psmt.setString(1, nama);
            rs = psmt.executeQuery();
            while (rs.next()) {                
                temp = rs.getInt("stok_item");
            }
            
        }
        catch (Exception e) {
            System.out.println("eror"+e);
        }
        
        hasil= String.valueOf(temp);
        return hasil;
    }

    @Override
    public boolean insertBuku(buku ku) {
          try {
             psmt = konek.prepareStatement(queryBukuInsert);
             psmt.setString(1, ku.getKd_buku());
             psmt.setString(2, ku.getJudul_buku());
              psmt.setString(3, ku.getGenre_buku());
             psmt.setString(4, ku.getPenulis_buku()); 
             psmt.setString(5, ku.getPenerbit_buku());
             psmt.setString(6, ku.getTahun_buku());
             psmt.setFloat(7, ku.getHarga_buku());
             psmt.setFloat(8, ku.getHarga_jual_buku());
             psmt.setInt(9, ku.getStok_buku()); 
             psmt.execute();      
             status = true;
        }
        catch (SQLException e) {
            System.out.println("err "+e);
        }
        return status;
    }

    @Override
    public boolean updateBuku(buku ku) {
         try {
            psmt = konek.prepareStatement(queryBukuUpdate);
            psmt.setString(1, ku.getJudul_buku());
            psmt.setString(2, ku.getGenre_buku());
            psmt.setString(3, ku.getPenulis_buku()); 
            psmt.setString(4, ku.getPenerbit_buku());
            psmt.setString(5, ku.getTahun_buku());
            psmt.setFloat(6, ku.getHarga_buku());
            psmt.setFloat(7, ku.getHarga_jual_buku());
            psmt.setInt(8, ku.getStok_buku()); 
            psmt.setString(9, ku.getKd_buku());
            psmt.executeUpdate();
       status = true;
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
      return status;
    }

    @Override
    public boolean HapusBuku(String kd_buku) {
        try {
            psmt =konek.prepareStatement(queryBukuHapus);
            psmt.setString(1, kd_buku);
            psmt.executeUpdate();
            status = true;
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
        return status;
    }

    @Override
    public List<buku> showBukuAll() {
       
        try {
            bukuList = new ArrayList<buku>();
            st = konek.createStatement();
            rs = st.executeQuery(queryBukuSelect);
            while(rs.next()){
                buku item = new buku();
                item.setKd_buku(rs.getString("kd_buku"));
                item.setJudul_buku(rs.getString("judul_buku"));
                item.setGenre_buku(rs.getString("genre_buku")); 
                item.setPenulis_buku(rs.getString("penulis_buku"));
                item.setPenerbit_buku(rs.getString("penerbit_buku"));
                item.setTahun_buku(rs.getString("tahun_buku"));
                item.setHarga_buku(rs.getFloat("harga_buku"));
                item.setHarga_jual_buku(rs.getFloat("harga_jual_buku")); 
                item.setStok_buku(rs.getInt("stok_buku"));
                bukuList.add(item);
            }
        }
        catch (SQLException e) {
           
        }
        return bukuList;
    }

    @Override
    public List<buku> showBukuCari(String nama) {
        bukuList = new ArrayList<buku>();
        try {
            psmt = konek.prepareStatement(queryBukuCari);
            psmt.setString(1, nama);
            rs = psmt.executeQuery();
            while(rs.next()){
                 buku item = new buku();
                 item.setKd_buku(rs.getString("kd_buku"));
                 item.setJudul_buku(nama);
                 item.setGenre_buku(rs.getString("genre_buku"));
                 item.setPenulis_buku(rs.getString("penulis_buku"));
                 item.setPenerbit_buku(rs.getString("penerbit_buku"));
                 item.setTahun_buku(rs.getString("tahun_buku"));
                 item.setHarga_buku(rs.getFloat("harga_buku"));
                 item.setHarga_jual_buku(rs.getFloat("harga_jual_buku"));
                 item.setStok_buku(rs.getInt("stok_buku"));
                 bukuList.add(item);
            }
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
        return bukuList;
    }

    @Override
    public String StokBuku(String nama) {
       String hasil;
        int temp = 0;
        try {
            psmt = konek.prepareStatement(queryBukuCari);
            psmt.setString(1, nama);
            rs = psmt.executeQuery();
            while (rs.next()) {                
                temp = rs.getInt("stok_buku");
            }
            
        }
        catch (Exception e) {
            System.out.println("eror"+e);
        }
        
        hasil= String.valueOf(temp);
        return hasil;
    }

    @Override
    public boolean insertKasir(kasir ku) {
        try {
            psmt = konek.prepareStatement(queryKasirInsert);
             psmt.setString(1,ku.getKode());
             psmt.setString(2, ku.getNama());
             psmt.setInt(3, ku.getKodeunik());
             psmt.setString(4, ku.getShift());
             psmt.execute();      
             status = true;
        }
        catch (SQLException e) {
            System.out.println("err "+e);
        }
        return status;
    }

    @Override
    public boolean updateKasir(kasir ku) {
          try {
            psmt = konek.prepareStatement(queryKasirUpdate);
             psmt.setString(1, ku.getNama());
             psmt.setString(2, ku.getShift());
             psmt.setString(3, ku.getKode());
             psmt.execute();      
             status = true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean HapusKasir(String kd_kasir) {
       try {
            psmt = konek.prepareStatement(queryKasirHapus);
             psmt.setString(1, kd_kasir);
             psmt.executeUpdate();      
             status = true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<kasir> showKasirAll() {
    kasirList = new ArrayList<kasir>();
        try {
            st = konek.createStatement();
           rs = st.executeQuery(queryKasirSelect);
            while(rs.next()){
                kasir t = new kasir();
                t.setKode(rs.getString("kd_kasir"));
                t.setUser(rs.getString("username"));
                t.setPass(rs.getString("pass"));
                t.setNama(rs.getString("nama"));
                t.setJekel(rs.getString("jekel"));
                t.setKodeunik(rs.getInt("kodeunik"));
                t.setShift(rs.getString("shift"));
                t.setShowAbsen(rs.getInt("absen"));
                t.setTanggal_masuk(rs.getString("tanggal_kasir"));
                kasirList.add(t);
            }
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
        return kasirList;
    }

    @Override
    public List<kasir> showKasirCari(String nama) {
        kasirList = new ArrayList<kasir>();
        try {
           psmt = konek.prepareStatement(queryKasirCari);
            psmt.setString(1, nama);
            rs = psmt.executeQuery();
            while(rs.next()){
                kasir t = new kasir();
                t.setKode(rs.getString("kd_kasur"));
                t.setUser(rs.getString("username"));
                t.setPass(rs.getString("pass"));
                t.setNama(rs.getString("nama"));
                t.setShift(rs.getString("shift"));
                t.setKodeunik(rs.getInt("kodeunik"));
                t.setAbsen();
                kasirList.add(t);
            }
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
        return kasirList;
    }

    

    @Override
    public boolean insertKasirUsername(kasir ku) {
        try {
            
           psmt = konek.prepareStatement(queryRegisInsert);
            psmt.setString(1, ku.getUser());
            psmt.setString(2, ku.getPass());
            psmt.setInt(3, ku.getKodeunik());
            psmt.execute();
           status = true;
            
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
        return status;
    }

    @Override
    public void insertAbsen(kasir ku) {
        try {
           psmt = konek.prepareStatement(queryAbsenInsert);
            psmt.setInt(1, ku.getAbsen());
            psmt.setString(2, ku.getUser());
            psmt.execute();
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
            
        }
        
    }
    
    public boolean cekLogin(String user,String pass){
        try {
            st = konek.createStatement();
            rs = st.executeQuery(queryAdminCek);
            while(rs.next()){
                if(rs.getString("username").equals(user) && rs.getString("pass").equals(pass)) {
                    status = true;
                    break;
                }
        }
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
    return status;
    }

     
public String checkAdmin(adminLogin tes){
    String nama=null;
    try {
           psmt = konek.prepareStatement(queryAdminCek);
          rs = psmt.executeQuery();
        while(rs.next()){
           if(  rs.getString("username").equals(tes.getUsername()) && rs.getString("pass").equals(tes.getPass())){
               status = true;
               nama = rs.getString("nama");
               break;
           }
        }
    }
    catch (SQLException e) {
        System.out.println("err "+e );
    }
    
    return nama;
}

  
   
   

 
}
