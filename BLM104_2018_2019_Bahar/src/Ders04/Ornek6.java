/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        String sayiMetni="132";
        
        int sayi=Integer.parseInt(sayiMetni);
        System.out.println(sayi+1);
        
        Integer sayi1=Integer.valueOf(sayiMetni);
        System.out.println(sayi1+1);
        
        System.out.println(Double.parseDouble(sayiMetni));
    }
    
}
