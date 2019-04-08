/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
         try {
 
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            DatabaseMetaData dbData=con.getMetaData();
            System.out.println(dbData.getDatabaseProductName());
            System.out.println(dbData.getDatabaseProductVersion());
            
        } catch (SQLException ex) {
            Logger.getLogger(Ders08.Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        
            
    }
    }
}
