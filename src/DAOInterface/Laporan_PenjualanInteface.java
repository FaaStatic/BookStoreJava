/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;
import java.util.List;
import model.laporan_penjualan;
/**
 *
 * @author Suhaili Faruq
 */
public interface Laporan_PenjualanInteface {
    public List<laporan_penjualan>ShowLaporan();
    public void insertLaporan(laporan_penjualan pj);
}
