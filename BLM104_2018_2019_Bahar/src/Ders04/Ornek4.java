/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmeti";
        System.out.println(s.substring(6,12));
        System.out.println(s.substring(6));
        
        String kelimeler[]=s.split(" ");
        System.out.println(kelimeler[0]);
        
        
        System.out.println(s.indexOf("ti"));
        System.out.println("İkinci ti : "+s.indexOf("ti",s.indexOf("ti")+"ti".length()));
    }
}
