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
public class Ornek16 {
    //Metindeki sayıları bulunuz.
    public static void main(String[] args) {
        String s="Fatih1 Sultaaan2 Mehmmmet68 vakif4 Unnniversitesi9"; 
        int rakamSayi=0;
        for (int i = 0; i < s.length(); i++) {
           if (Character.isDigit(s.charAt(i))) rakamSayi++;
        }
        System.out.println("Rakam Sayı :"+rakamSayi);
    }
}
