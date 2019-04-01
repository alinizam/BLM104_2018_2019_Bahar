/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.awt.BorderLayout;
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
public class Ornek1 {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st=con.createStatement();
            String sql="SELECT *"
                    + " FROM customer";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("customer_id")+" "+rs.getString("name"));
            }
            con.close();
            System.out.println("Bağlandı");    
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
