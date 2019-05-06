/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("c:\\dosyalar");
            DirectoryStream<Path> akis=Files.newDirectoryStream(file,"*{.txt,.dat}");
            for (Path dosya : akis) {
                System.out.println(dosya.getFileName());
            }
        } catch (IOException ex) {
            Logger.getLogger(Ornek11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
