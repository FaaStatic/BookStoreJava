/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;
import java.util.List;
import model.item;
/**
 *
 * @author Suhaili Faruq
 */
public interface BarangInterface {
    public boolean insertBarang(item ku);
    public boolean updateBarang(item ku);
    public boolean HapusBarang(String nama);
    public List<item> showBarangAll();
    public List<item> showBarangCari(String nama);
     public String StokBarang(String nama);
}
