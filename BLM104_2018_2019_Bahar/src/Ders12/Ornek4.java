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
public class Ornek4 {
    public static void main(String[] args) {
        Path p1=Paths.get("c:\\belgeler\\dosyalar\\a");
        Path p2=Paths.get("c:\\belgeler\\dosyalar\\c");
        System.out.println(p1.resolve(p2));
        System.out.println(p1.relativize(p2));
        
        
                
    }
}
