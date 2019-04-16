/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) throws IOException {
         
        String dosya="c:\\dosyalar\\Merhaba.txt";
        FileWriter f=new FileWriter(dosya);
        for (int i = 1; i < 1001; i++) {
           f.write(i);
        }
        f.close();
        System.out.println(""); 
 
    }
}
