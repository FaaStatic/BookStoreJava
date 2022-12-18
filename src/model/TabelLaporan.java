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
public class TabelLaporan
        extends AbstractTableModel {

    List<laporan_penjualan> ds;

    public TabelLaporan(List<laporan_penjualan> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex,
            int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ds.get(rowIndex).getId();
            case 1:
                return ds.get(rowIndex).getNama_barang();
            case 2:
                return ds.get(rowIndex).getKategori();
            case 3:
                return ds.get(rowIndex).getJumlah();
            case 4:
                return ds.get(rowIndex).getBayar();
            case 5:
                return ds.get(rowIndex).getKasir();
             case 6:
                return ds.get(rowIndex).getTanggal_transaksi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int Column) {
        switch (Column) {
            case 0:
                return "id";
            case 1:
                return "Nama Barang";
            case 2:
                return "Kategori";
            case 3:
                return "jumlah";
            case 4:
                return "bayar";
            case 5:
                return "kasir";
            case 6:
                return "Tanggal Transaksi";
            default:
                return null;
        }
    }
}
