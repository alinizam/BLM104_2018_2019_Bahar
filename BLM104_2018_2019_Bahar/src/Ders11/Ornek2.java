/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            String dosya="c:\\dosyalar\\Merhaba.txt";
            br = new BufferedReader(new FileReader(dosya));
            String s;
            while((s=br.readLine())!=null){
                if (!s.equals(""))   // Boş satır kontrolü
                    System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
