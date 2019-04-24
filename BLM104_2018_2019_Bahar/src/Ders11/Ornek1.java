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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        FileInputStream f=null;
        try {
            String dosya="c:\\dosyalar\\Merhaba.txt";
            f = new FileInputStream(dosya);
            BufferedInputStream bis=new BufferedInputStream(f);
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }
}
