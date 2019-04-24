/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        BufferedWriter br=null;
        try {
            String dosya="c:\\dosyalar\\Merhaba.txt";
            br = new BufferedWriter(new FileWriter(dosya,true));
            br.write("\nMehmet Ak");
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
