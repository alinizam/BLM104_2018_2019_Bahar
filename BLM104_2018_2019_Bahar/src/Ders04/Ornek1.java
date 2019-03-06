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
public class Ornek1 {
    public static void main(String[] args) {
        String s = "Ahmet";
        String s1=new String("Ahmet");
        char isim[]={'A','h','m','e','t'};
        String s2=new String(isim);
        System.out.println(s1);
        
        s="Mehmet";
        
        degistir(s);
        System.out.println(s);
    }
    static void degistir(String s){
        s=s+" AK";
    }
}
