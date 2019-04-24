/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fsmblm0
 */
public class Ornek2b {

    public static void main(String[] args) {
        String dosya = "/home/fsmblm0/Desktop/File/";
        int maast = 0;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosya + "personel.dat"));
            Personel1 p;
            while (true) {
                p = (Personel1) ois.readObject();
                maast += p.maas;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException ex) {
            System.out.println(maast);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Ornek2b.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
