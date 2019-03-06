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
public class Ornek5 {
    public static void main(String[] args) {
        String isim="Ahmet Ak";
        String adi=isim.substring(0,isim.indexOf(" "));
        System.out.println(adi);
        String soyadi=isim.substring(isim.indexOf(" ")+1);
        System.out.println(soyadi);
        
        System.out.println("Ahmet".compareTo("Behra"));
        
        System.out.println("Fatih".toUpperCase());
        
        
    }
}
