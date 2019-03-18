/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        
        //1 ile 10 arası 10 adet rasgele sayı
        for (int i = 0; i < 10; i++) {
               System.out.println(Math.floor(Math.random()*10)+1);
        }
     
        
    }
}
