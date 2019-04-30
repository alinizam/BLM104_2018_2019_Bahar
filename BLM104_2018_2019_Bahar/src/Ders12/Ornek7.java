/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        try {
            BufferedWriter f=new BufferedWriter(new FileWriter("c:\\dosyalar\\a.txt"));
            BufferedWriter f1=Files.newBufferedWriter(Paths.get("c:\\dosyalar\\a.txt"));
            f1.write("Merhaba");
            f1.close();
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
