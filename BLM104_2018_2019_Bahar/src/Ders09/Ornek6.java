/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
            try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement stInsert=con.createStatement();
            con.setAutoCommit(false);
            String sql="UPDATE malzeme SET adi='Raptiye' WHERE malzeme_id=1";
            System.out.println(sql);
            int i=stInsert.executeUpdate(sql);
            System.out.println(i+" Adet kayıt sisteme girildi.");
           
            con.commit();
                    
        } catch (SQLException ex) {
            Logger.getLogger(Ders08.Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
