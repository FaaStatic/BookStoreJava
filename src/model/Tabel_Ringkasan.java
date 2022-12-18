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
public class Tabel_Ringkasan extends AbstractTableModel{
  List<Ringkas> sd;
  
  public Tabel_Ringkasan(List<Ringkas> sd){
      this.sd = sd;
  }
  
    @Override
    public int getRowCount() {
      return sd.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex,
            int columnIndex) {
      switch(columnIndex){
           case 0:
                return sd.get(rowIndex).getNama_barang();
            case 1:
                return sd.get(rowIndex).getKategori();
            case 2:
                return sd.get(rowIndex).getJumlah();
            case 3:
                return sd.get(rowIndex).getTotal();
            case 4:
                return sd.get(rowIndex).getKasir();
             default:
                 return null;
    }
    }
    @Override
    
    public String getColumnName(int column){
       switch(column){
             case 0:
                return "Nama Barang";
            case 1:
                return "Kategori";
            case 2:
                return "Jumlah";
            case 3:
                return "Total";  
            case 4:
                return "Kasir";
           
             default:
                 return null;
       }
   }
   
    
}
