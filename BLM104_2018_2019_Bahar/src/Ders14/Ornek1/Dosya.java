/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Dosya {
    public static void main(String[] args) {
        try {
            Path start=Paths.get("c:\\dosyalar");
            Files.walkFileTree(start, new myFileVisitor("Merhaba.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Dosya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
