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
public class Ornek5 {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement stInsert=con.createStatement();
            con.setAutoCommit(false);
            //String sql="INSERT INTO malzeme (malzeme_id,adi) VALUES (5,'KAğıt')";
            String pMalzemeAdi="Bant";
            String pTuru="Kırtasiye";
            String sql="INSERT INTO malzeme (malzeme_id,adi,turu) "
                    + "VALUES (11,'"+pMalzemeAdi+"','"+pTuru+"')";
            System.out.println(sql);
            int i=stInsert.executeUpdate(sql);
            System.out.println(i+" Adet kayıt sisteme girildi.");
            String sqlSorgu="SELECT * FROM malzeme";
            System.out.println(sqlSorgu);
            Statement stSorgu=con.createStatement(); 
            ResultSet rs=stSorgu.executeQuery(sqlSorgu);
            int sayac=0;
            while(rs.next()) sayac++;
            System.out.println(sayac);
            con.commit();
                    
        } catch (SQLException ex) {
            Logger.getLogger(Ders08.Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
