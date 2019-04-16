/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        String dosyaYolu = "c:\\dosyalar\\Merhaba.txt";
        try (FileInputStream f = new FileInputStream(dosyaYolu)) {
            int a=f.read();
            while (a != -1) {
                System.out.print((char)a);
                a= f.read();
            } 

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
