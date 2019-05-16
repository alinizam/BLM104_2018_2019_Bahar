/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

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
public class Ornek1 {
    public static void main(String[] args) {
        int n=10;
        //binary(n);
        System.out.println("");
        Path p=Paths.get("c:\\dosyalar");
        ara(p);    
    }
    static void binary(int sayi){
        if (sayi>0){
            binary(sayi/2);
            System.out.print(sayi%2);
        }
    }
    
    static void ara(Path p){
        try {
            DirectoryStream<Path> ds=Files.newDirectoryStream(p);
           
            for (Path d : ds) {
                System.out.println(d);
                if(Files.isDirectory(d)){
                    ara(d);
                } 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    
}


