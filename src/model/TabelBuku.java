/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Suhaili Faruq
 */
public class TabelBuku extends AbstractTableModel{
     List<buku> lsBuku;
    
    public TabelBuku(List<buku> buku){
        this.lsBuku = buku;
    }

    @Override
    public int getRowCount() {
      return lsBuku.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex,
            int columnIndex) {
        
        switch(columnIndex){
              case 0:
                return lsBuku.get(rowIndex).getKd_buku();
            case 1:
                return lsBuku.get(rowIndex).getJudul_buku();
            case 2:
                return lsBuku.get(rowIndex).getGenre_buku();
            case 3:
                return lsBuku.get(rowIndex).getPenulis_buku();
            case 4:
                return lsBuku.get(rowIndex).getPenerbit_buku();
            case 5:
                return lsBuku.get(rowIndex).getTahun_buku();
            case 6:
                return lsBuku.get(rowIndex).getHarga_buku();
            case 7:
                return lsBuku.get(rowIndex).getHarga_jual_buku();
             case 8:
                return lsBuku.get(rowIndex).getStok_buku();
            default:
                return null;
              
        }
       
    }
    @Override
    public String getColumnName(int column){
        switch(column){
           
            case 0:
                return "Kode";
            case 1:
                return "Judul Buku";
            case 2:
                return "Genre Buku";
            case 3:
                return "Penulis Buku";
            case 4:
                return "Penerbit Buku";
            case 5:
                return "Tahun Peluncuran";
            case 6:
                return "Harga Awal";
            case 7:
                return "harga Jual";
             case 8:
                return "Stok Buku";
            default:
                return null;    
        }
    }
}
