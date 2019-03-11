/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
      public static void main(String[] args) {     
       String desenMetni="([A-z]{2}[0-9])";    //İki harfi takip eden 1 numara varsa bul
       String icindeDesenArananMetin="Fatih15#Sultan21245 MehmedFat342 cFat13ih";
       Ornek1.desenAra(desenMetni, icindeDesenArananMetin);
    }
}
