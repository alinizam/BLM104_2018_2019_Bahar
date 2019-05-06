/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        try {
            File f = new File("c:\\dosyalar\\sayilar.txt");
            long fileLength = f.length();
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            raf.seek(0);
            String text = "Merhaba";
            raf.writeBytes(text);
            raf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
