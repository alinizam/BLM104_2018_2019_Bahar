/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        try {
            Path pKaynak=Paths.get("c:\\dosyalar\\a\\Kaynak.txt");
            Path pHedef=Paths.get("c:\\dosyalar\\b\\Hedef.txt");
            Files.copy(pKaynak, pHedef,StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException ex) {
            Logger.getLogger(Ornek10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
