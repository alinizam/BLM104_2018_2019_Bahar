/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        //Rasgele seçilen karakter 3’ten büyük bir rakam ise metinden silen kodu yazınız. 
         String metin = "F999992";
        Random r = new Random();
        int rasgeleNokta=r.nextInt(metin.length());
        char secilenChar=metin.charAt(rasgeleNokta);
        StringBuilder metinSB=new StringBuilder(metin);
        if (Character.isDigit(secilenChar)&& Character.getNumericValue(secilenChar)>3){
           metinSB.deleteCharAt(rasgeleNokta);
        }
        System.out.println(secilenChar);
        System.out.println(metinSB);
            
    }
}
