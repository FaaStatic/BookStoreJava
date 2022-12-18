/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import java.util.List;
import model.kasir;

/**
 *
 * @author Suhaili Faruq
 */
public interface operatorInterface {
       public boolean insertKasir(kasir ku);
    public boolean updateKasir(kasir ku);
    public boolean HapusKasir(String kd_kasir);
    public List<kasir> showKasirAll();
    public List<kasir> showKasirCari(String nama);
     public boolean insertKasirUsername(kasir ku);
      public void insertAbsen(kasir ku);
}
