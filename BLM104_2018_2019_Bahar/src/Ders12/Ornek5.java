/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

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
public class Ornek5 {
    public static void main(String[] args) {
        try {
            Path p=Paths.get("a.txt");
            System.out.println(p.toAbsolutePath());
            System.out.println(Files.isSameFile(p, p.toAbsolutePath()));
        } catch (IOException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
