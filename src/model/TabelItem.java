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
public class TabelItem extends AbstractTableModel {

    List<item> lsitem;
    public TabelItem(List<item> itItem){
        this.lsitem = itItem;
        
    }
    @Override
    public int getRowCount() {
        return lsitem.size();
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
                return lsitem.get(rowIndex).getKd_item();
            case 1:
                return lsitem.get(rowIndex).getNama_item();
            case 2:
                return lsitem.get(rowIndex).getHarga_item();
            case 3:
                return lsitem.get(rowIndex).getHarga_jual_item();
            case 4:
                return lsitem.get(rowIndex).getStok_item();
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
                return "Nama Aksesoris";
            case 2:
                return "Harga Awal Kasesoris";
            case 3:
                return "Harga Jual Aksesoris";
            case 4:
                return "Stok Aksesoris";
             default:
                 return null;
        }
    }
    
    
}
