/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            String dosya = "c:\\dosyalar\\sayilar.dat";
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(dosya)));
            while (dis.available() > 0) {
                System.out.println(dis.readInt()+" "+dis.available());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek8.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dis.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek8.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
