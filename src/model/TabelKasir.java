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
public class TabelKasir extends AbstractTableModel{
    List<kasir>lsKasir;
    public TabelKasir(List<kasir>lsKasir){
        this.lsKasir = lsKasir;
    }
    @Override
    public int getRowCount() {
        return  lsKasir.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex,
            int columnIndex) {
        String test=null;
       switch(columnIndex){
             case 0:
                return lsKasir.get(rowIndex).getKode();
            case 1:
                return lsKasir.get(rowIndex).getUser();
            case 2:
                return lsKasir.get(rowIndex).getPass();
            case 3:
                return lsKasir.get(rowIndex).getNama();
            case 4:
                return lsKasir.get(rowIndex).getJekel();
            case 5:
                return lsKasir.get(rowIndex).getShift();
             case 6:
                return lsKasir.get(rowIndex).getKodeunik();
               case 7:
                return lsKasir.get(rowIndex).getShowAbsen();
               case 8:
                return lsKasir.get(rowIndex).getTanggal_masuk();
             default:
                 return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
              case 0:
                return "Kode Kasir";
            case 1:
                return "Username Kasir";
            case 2:
                return "Password Kasir";
            case 3:
                return "Nama";
                
             case 4:
                return "Jenis Kelamin";
            case 5:
                return "Shift";
             case 6:
                return "Kode unik";
               case 7:
                return "absen";
               case 8:
                   return "tanggal_masuk";
             default:
                 return null;
        }
    }
    
}
