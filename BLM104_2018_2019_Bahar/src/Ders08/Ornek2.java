/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st=con.createStatement();
            //String sql="INSERT INTO malzeme (malzeme_id,adi) VALUES (5,'KAğıt')";
            String pMalzemeAdi="Bant";
            String sql="INSERT INTO malzeme (malzeme_id,adi) VALUES (6,'"+pMalzemeAdi+"')";
            System.out.println(sql);
            int i=st.executeUpdate(sql);
            System.out.println(i+" Adet kayıt sisteme girildi.");
        } catch (SQLException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
