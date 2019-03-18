/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author alinizam
 */
public class Ornek12 {
    public static void main(String[] args) throws FileNotFoundException {
        dosyaOku();
    }
    static void dosyaOku() throws FileNotFoundException{
        FileReader f=new FileReader("c:\\dosyalar\\Merhaba.txt");
    }
}
