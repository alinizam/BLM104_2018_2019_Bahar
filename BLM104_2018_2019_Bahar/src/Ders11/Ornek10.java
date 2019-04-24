/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
            String dosya="c:\\dosyalar\\nesneler.dat";
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dosya)));
            Personel p=(Personel)ois.readObject();
            System.out.println(p.adi+" "+p.soyadi+" : "+p.maas); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
