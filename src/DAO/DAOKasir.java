/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Tabel_Ringkasan;
import model.kasir;

/**
 *
 * @author Suhaili Faruq
 */
public class DAOKasir
        extends DAOAdmin {

    PreparedStatement psmt;
    Statement st;
    ResultSet rs;

    public DAOKasir() {
        super();

    }

    public boolean addKasirUser(kasir u) {

        try {
            psmt = konek.prepareStatement(queryRegisInsert);
            psmt.setString(1, u.getUser());
            psmt.setString(2, u.getPass());
            psmt.setInt(3, u.getKodeunik());
            psmt.execute();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public float total(Tabel_Ringkasan uwu) {
        float hasil = 0;
        for (int i = 0; i < uwu.getRowCount(); i++) {
            hasil += Float.parseFloat(uwu.getValueAt(i, 3).toString());
        }
        return hasil;
    }

    public String cekLoginOperator(String user,
            String pass) {
        String status = null;
        try {
            st = konek.createStatement();
            rs = st.executeQuery(queryKasirSelect);
            while (rs.next()) {
                String userku = rs.getString("username");
                String passku = rs.getString("pass");
                System.out.println(pass);
                System.out.println(passku);
                if (userku.equals(user) && passku.equals(passku)) {
                    status = rs.getString("nama");
                }

            }
        }
        catch (SQLException e) {
            System.out.println("err " + e);
        }
        return status;
    }

    public void insertAbsen(String username) {

        int i = 0;
        try {
            st = konek.createStatement();
            rs = st.executeQuery(queryKasirSelect);
            while (rs.next()) {
                i = rs.getInt("absen");

            }
            absen(username, i);
        }
        catch (SQLException e) {
            System.out.println("err " + i + " " + e);
        }

    }

    public void absen(String user,
            int i) {
        try {
            i = i + 1;
            psmt = konek.prepareStatement(queryAbsenInsert);
            psmt.setInt(1, i);
            psmt.setString(2, user);
            psmt.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println("err " + i + " " + e);
        }

    }

    public boolean getStokBuku(String nama_buku,
            int kurang) {
        int jumlah = 0;
        try {

           psmt = konek.prepareStatement(queryStokBukuKurang);
            psmt.setString(1, nama_buku);
            rs = psmt.executeQuery();
            while (rs.next()) {
                jumlah = rs.getInt("stok_buku");
            }
        }
        catch (Exception e) {
            System.out.println("err " + e);
        }
        return ProsesKurangStokBuku(nama_buku, jumlah, kurang);
    }

    public boolean ProsesKurangStokBuku(String nama,
            int jumlah,
            int kurang) {
        boolean status = false;
        int hasil = jumlah - kurang;
        if (hasil > 0 && hasil != 0) {
            try {
                psmt = konek.prepareStatement(queryStokBukuUpdate);
                psmt.setInt(1, hasil);
                psmt.setString(2, nama);
                psmt.executeUpdate();
                status = true;
            }
            catch (SQLException e) {
                System.out.println("err " + e);
            }
        }
        else if (hasil == 0) {
            try {
                psmt = konek.prepareStatement(queryStokBukuUpdate);
                psmt.setInt(1, hasil);
                psmt.setString(2, nama);
                psmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Stok Telah Kosong Mohon hubungi Admin Toko");
                status = true;
            }
            catch (Exception e) {
                System.out.println("err " + e);
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Stok jumlah melebihi Stok");
            status = false;
        }

        return status;
    }

    public boolean getStokItem(String nama_buku,
            int kurang) {
        int jumlah = 0;
        try {

            psmt = konek.prepareStatement(queryStokBarangKurang);
            psmt.setString(1, nama_buku);
            rs = psmt.executeQuery();
            while (rs.next()) {
                jumlah = rs.getInt("stok_item");
            }
        }
        catch (Exception e) {
            System.out.println("err " + e);
        }
        return ProsesKurangStokItem(nama_buku, jumlah, kurang);
    }

    public boolean ProsesKurangStokItem(String nama,
            int jumlah,
            int kurang) {
        boolean status = false;
        int hasil = jumlah - kurang;
        if (hasil > 0 && hasil != 0) {
            try {
                psmt = konek.prepareStatement(queryStokBarangUpdateStok);
                psmt.setInt(1, hasil);
                psmt.setString(2, nama);
                psmt.executeUpdate();
                status = true;
            }
            catch (SQLException e) {
                System.out.println("err " + e);
            }
        }
        else if (hasil == 0) {
            try {
                psmt = konek.prepareStatement(queryStokBarangUpdateStok);
                psmt.setInt(1, hasil);
                psmt.setString(2, nama);
                psmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Stok Telah Kosong Mohon hubungi Admin Toko");
                status = true;
            }
            catch (Exception e) {
                System.out.println("err " + e);
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Stok jumlah melebihi Stok");
            status = false;
        }

        return status;
    }

}
