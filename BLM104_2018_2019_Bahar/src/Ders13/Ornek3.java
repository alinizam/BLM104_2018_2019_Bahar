/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        try {
            Path file=Paths.get("c:\\dosyalar\\sayilar.txt");
            byte[] veriler=Files.readAllBytes(file);
            for (int i = 0; i < veriler.length; i++) {
                 System.out.print((char)veriler[i]);
            }  
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
