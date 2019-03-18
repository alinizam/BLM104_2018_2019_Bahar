/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek15 {

    public static void main(String[] args) {
        FileReader f=null;
        try {
            f = new FileReader("c:\\dosyalar\\Merhaba.txt");
            //Hatalı kod
            if (f != null) {
                f.close();
            }
        } catch (FileNotFoundException e) {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ornek15.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        catch (IOException e) {
             if (f != null) {
                 try {
                     f.close();
                 } catch (IOException ex) {
                     Logger.getLogger(Ornek15.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }

    }
}
