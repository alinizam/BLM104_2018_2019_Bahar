/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st=con.createStatement();
            String sql="SELECT *"
                    + " FROM malzeme";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsData=rs.getMetaData();
            for (int i = 1; i <= rsData.getColumnCount(); i++) {
                System.out.println(rsData.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
