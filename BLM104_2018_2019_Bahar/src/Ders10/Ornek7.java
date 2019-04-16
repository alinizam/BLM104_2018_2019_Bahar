/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\Merhaba.txt";
        FileReader f=new FileReader(dosya);
        int c;
        while((c=f.read())!=-1){
            System.out.print((char)c);
        }
        System.out.println(""); 
    }
}
