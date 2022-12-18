/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import java.util.List;
import model.buku;

/**
 *
 * @author Suhaili Faruq
 */
public interface BukuInterface {
     public boolean insertBuku(buku ku);
    public boolean updateBuku(buku ku);
    public boolean HapusBuku(String kd_buku);
    public List<buku> showBukuAll();
    public List<buku> showBukuCari(String nama);
    public String StokBuku(String nama);
}
