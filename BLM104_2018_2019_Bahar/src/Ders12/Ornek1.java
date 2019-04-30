/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        Path p=Paths.get("c:","dosyalar","a.txt");
        Path p1=Paths.get("c:\\dosyalar\\a.txt");
       
        System.out.println(p1.getFileName());
        for (int i = 0; i < p1.getNameCount(); i++) {
            System.out.println(p1.getName(i));
        }
        System.out.println(p1.getRoot());
        System.out.println("Üst klasör "+p1.getParent().getParent());
        System.out.println(p1.toString());
        
        Path p2=Paths.get("\\dosya");
        System.out.println(p2.toAbsolutePath());
        
        Path p3=Paths.get("c:\\dosyalar\\..\\a.txt");
        System.out.println(p3.normalize());
    }
}