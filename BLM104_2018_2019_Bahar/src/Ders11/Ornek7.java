/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        DataOutputStream dos=null;
        try {
            String dosya="c:\\dosyalar\\sayilar.dat";
            dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(dosya)));
            for (int i = 0; i < 10; i++) {
                dos.writeInt(i);
            }

            //dos.writeUTF("Ahmet");
            //dos.writeUTF("Ak");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dos.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
