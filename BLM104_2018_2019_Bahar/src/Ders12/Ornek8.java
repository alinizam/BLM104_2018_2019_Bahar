/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        Path p=Paths.get("c:\\dosyalar\\a.txt");
        System.out.println(Files.exists(p));
        System.out.println(Files.notExists(p));
        System.out.println(Files.isWritable(p));
        
    }
}
