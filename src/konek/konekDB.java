/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Suhaili Faruq
 */
public class konekDB {
    
    static Connection conn;
    
   public  static Connection connect(){
      
         String driver = "com.mysql.cj.jdbc.Driver";
          String url = "jdbc:mysql://localhost:3306/tokoBuku?&serverTimezone=UTC";
         String user = "root";
         String password = "";
        
        try {
            Class.forName(driver);
             try {
           conn = DriverManager.getConnection(url,user,password);
       }
       catch (SQLException e) {
           System.out.println("eror "+e);
       }
            
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}
