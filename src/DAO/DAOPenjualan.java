/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOInterface.Laporan_PenjualanInteface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import konek.konekDB;
import model.laporan_penjualan;
/**
 *
 * @author Suhaili Faruq
 */
public class DAOPenjualan implements Laporan_PenjualanInteface{

    List<laporan_penjualan> tes;
    Connection conn;
    PreparedStatement psmt;
    Statement st;
    ResultSet rs;
    final String query = "INSERT INTO laporan_penjualan (nama_barang,kategori,jumlah,bayar,kasir) VALUES (?,?,?,?,?);";
    
    public DAOPenjualan(){
        this.conn = konekDB.connect();
    }
    
    @Override
    public List<laporan_penjualan> ShowLaporan() {
        tes = new ArrayList<laporan_penjualan>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM laporan_penjualan");
            while (rs.next()) {                
                laporan_penjualan u = new laporan_penjualan();
                u.setId(rs.getInt("id"));
                u.setNama_barang(rs.getString("nama_barang"));
                u.setKategori(rs.getString("kategori"));
                u.setJumlah(rs.getInt("jumlah"));
                u.setBayar(rs.getFloat("bayar"));
                u.setKasir(rs.getString("kasir"));
                u.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
                tes.add(u);
            }
        }
        catch (SQLException e) {
            System.out.println("eror"+e);
        }
        return tes;
    }

 
    @Override
    public void insertLaporan(laporan_penjualan pj) {
        try {
            psmt = conn.prepareStatement(query);
            psmt.setString(1, pj.getNama_barang());
            psmt.setString(2, pj.getKategori());
            psmt.setInt(3, pj.getJumlah());
            psmt.setFloat(4, pj.getBayar());
            psmt.setString(5, pj.getKasir());
            psmt.execute();
            
            
        }
        catch (SQLException e) {
            System.out.println("eror "+e);
        }
    }
    
}
