/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        ObjectOutputStream oos=null;
        try {
            String dosya="c:\\dosyalar\\nesneler.dat";
            oos = new ObjectOutputStream(
                     new BufferedOutputStream(
                             new FileOutputStream(dosya)));
            Personel personeller[]=new Personel[3];
            personeller[0]=new Personel("Ahmet","Ak",15000);
            personeller[1]=new Personel("Mehmet","Ak",15000);
            personeller[2]=new Personel("Kemal","Sarı",15000);
                    
            oos.writeObject(personeller);
            ArrayList<Personel> calisanlar=new ArrayList();
            calisanlar.add(new Personel("Ahmet","Ak",15000));
            calisanlar.add(new Personel("Ayşe","Ak",15000));
            calisanlar.add(new Personel("Ali","Ak",15000));
            oos.writeObject(calisanlar);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
