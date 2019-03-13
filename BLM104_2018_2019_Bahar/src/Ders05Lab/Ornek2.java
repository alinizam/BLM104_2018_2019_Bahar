/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        Random r = new Random();

        String s = "Fatih 123.3 Sultan Mehmet3.2 vakıf Üniversitesi3";
        char secim = s.charAt(r.nextInt(s.length()));
        System.out.println(secim);
        String[] kelimeler = s.split(" ");
        for (String kelime : kelimeler) {
            if (kelime.contains(String.valueOf(secim))) {
                System.out.println(kelime);
            }
        }
        //
        int adet=0;
        
        Pattern desen = Pattern.compile("[0-9]");
        
         
        for (String kelime : kelimeler) {
            Matcher arama = desen.matcher(kelime);
            if (arama.find()) {
                System.out.println(kelime);
                adet++;
            }
        }
        System.out.println("Adet = "+adet);
        
        StringBuilder sb=new StringBuilder(s);
        Pattern desen1 = Pattern.compile("[0-9]+.[0-9]+");
        Matcher arama1 = desen1.matcher(sb);
       
        while(arama1.find()){
            DecimalFormat f=new DecimalFormat("###.00");
            String bicimliSayi=f.format(Double.parseDouble(arama1.group()));
            sb.replace(arama1.start(), arama1.end(),bicimliSayi );
         
        }
        System.out.println(sb);
    }
}
