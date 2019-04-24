/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fsmblm0
 */
public class Ornek1 {

    public static void main(String[] args) {
        String dosya = "/home/fsmblm0/Desktop/File/";
        try {
            Scanner sc=new Scanner(new FileInputStream(dosya+"a.txt"));
            sc.useDelimiter("^[0-9]");
            while (sc.hasNextInt()) {                
                System.out.println(sc.nextInt());
            }
            FileInputStream fi = new FileInputStream(dosya + "a.txt");
            String sayi = "";
           int[] dizi=new int[3];
           int eleman=0;
            while (fi.available() > 0) {
                int c = fi.read();
                if ((char) c == '\n') {
                    dizi[eleman]=Integer.valueOf(sayi);
                    eleman++;
                    sayi="";
                } else {
                 sayi+=(char)c;   
                }
            }
            for (int i : dizi) {
                System.out.println(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
