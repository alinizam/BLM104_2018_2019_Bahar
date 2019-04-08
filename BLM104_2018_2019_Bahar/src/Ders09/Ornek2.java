/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            int malzeme_id=10;
            String adi="Ataç",turu="Kıstasiye";
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sql="INSERT INTO malzeme (malzeme_id,adi,turu) VALUES (?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1, malzeme_id);
            st.setString(2, adi);
            st.setString(3, turu);
            int i=st.executeUpdate();
            System.out.println(i+" adet kayıt girildi.");
        } catch (SQLException ex) {
            Logger.getLogger(Ders08.Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        
            
    }
    }
}
