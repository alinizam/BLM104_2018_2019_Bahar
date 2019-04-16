/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        FileOutputStream f=null;
        try {
            String dosya="c:\\dosyalar\\ders10.txt";
            f = new FileOutputStream(dosya,true);
            for (int i = 65; i < 100; i++) {
                 f.write(i);
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
