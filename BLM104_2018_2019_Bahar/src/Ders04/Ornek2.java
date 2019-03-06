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
public class Ornek2 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet";
        int boslukAdet=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') boslukAdet++; 
            System.out.println(s.charAt(i));
        }
        System.out.println("Boşluk Adet = "+boslukAdet);
    }
}
