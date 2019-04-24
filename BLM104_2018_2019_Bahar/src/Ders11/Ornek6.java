/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        PrintWriter pw=null;
        try {
            String dosya="c:\\dosyalar\\sayilar.txt";
            pw = new PrintWriter(new FileOutputStream(dosya));
            pw.printf("Evrak 2000%08d\n", 100);
            pw.printf("Evrak 2000%08d\n", 9);
            pw.printf("Evrak 2000%08d\n", 99999);
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
}
