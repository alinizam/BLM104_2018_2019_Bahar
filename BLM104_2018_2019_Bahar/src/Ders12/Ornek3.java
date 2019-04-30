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
public class Ornek3 {
    public static void main(String[] args) {
         Path p=Paths.get("c:\\dosyalar\\a.txt");
         System.out.println(p.toAbsolutePath());
         System.out.println(p.toUri());
    }
}
