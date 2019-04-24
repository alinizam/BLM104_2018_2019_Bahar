/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

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
public class Ornek4 {

    public static void main(String[] args) {
        String dosya = "/home/fsmblm0/Desktop/File/";
        try {
            ObjectInputStream oisk = new ObjectInputStream(new FileInputStream(dosya + "kucuk.dat"));
            ObjectInputStream oiso = new ObjectInputStream(new FileInputStream(dosya + "orta.dat"));
            ObjectInputStream oisb = new ObjectInputStream(new FileInputStream(dosya + "buyuk.dat"));
                System.out.println(((Personel)oisk.readObject()).getName());
                System.out.println(((Personel)oisb.readObject()).getName());
                System.out.println(((Personel)oiso.readObject()).getName());
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }catch (EOFException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
