/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        try {
            String dosya="c:\\dosyalar\\sayilar.txt";
            Scanner s=new Scanner(new FileInputStream(dosya));
          //  s.useDelimiter("[0-9]");
            while(s.hasNext()){
                //System.out.println(s.nextDouble());
                //System.out.println(s.nextInt());
                System.out.println(s.next("[0-9]"));
                System.out.println(s.next("[A-z]*"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
