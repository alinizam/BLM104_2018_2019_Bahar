/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String[] kelimedizi={"dort","uc","iki","bir"};
        
        String cumle="Bir iki uc dort ";
        int bas=0;
        ArrayList<String> kelimeler=new ArrayList();
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' ') {
                kelimeler.add(cumle.substring(bas,i));
                bas=i+1;
            }
            
            
        }
       // kelimeler.add(cumle.substring(bas, cumle.length()));
        for (String string : kelimeler) {
                System.out.println(string);
            }
        
    }
    String cevir(String [] dizi){
    String cumle="";
        for (String string : dizi) {
            cumle=cumle.concat(string.concat(" "));
            
        }
       return cumle; 
        
    }
    
   char[]  karakterCevir(String metin){
       
       
       char[] karakterler=new char[metin.length()]; 
       for (int i = 0; i < metin.length(); i++) {
           karakterler[i]=metin.charAt(i);
       }
   return karakterler;
   }
    
}
