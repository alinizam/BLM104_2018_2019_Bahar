/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        
        try {
            Path file=Paths.get("c:\\dosyalar\\sayilar.txt");
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println(attr.creationTime());
            System.out.println(attr.size());
            System.out.println(attr.lastModifiedTime());
           
            System.out.println(Files.getOwner(file));
           /* UserPrincipal owner=new UserPrincipal() {
                @Override
                public String getName() {
                    return "ANIZAM\\alinizam";
                }
            };
            Files.setOwner(file,owner);*/
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
