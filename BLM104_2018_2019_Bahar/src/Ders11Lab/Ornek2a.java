/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fsmblm0
 */
public class Ornek2a {

    public static void main(String[] args) {
        String dosya = "/home/fsmblm0/Desktop/File/";
        Personel1 personeller[] = {new Personel1("Burak", "Ceylan", 15), new Personel1("Fauk", "Ceylan", 25), new Personel1("Mahmut", "Dere", 30)};
        try {
            ObjectOutput oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dosya + "personel.dat")));
            for (Personel1 personel : personeller) {
                oos.writeObject(personel);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
