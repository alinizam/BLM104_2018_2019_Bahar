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
public class Ornek8 {
      public static void main(String[] args) {     
       
       //Başında harf sonunda rakkam olan kelimeleri bulunuz. Tam çözülmedi
       //String desenMetni="(\\b[A-z]+[0-9]+)";    
     
       //Metinde 6’dan fazla harf ve bunu takip eden en az 1 numara içeren kelimeleri bulunuz
       String desenMetni="(\\b[0-9]*[A-z]{6,}[0-9]+)";    
        
       String icindeDesenArananMetin="Fatih15 112Sultan21245 Mehmed342 cFatih";
       Ornek1.desenAra(desenMetni, icindeDesenArananMetin);
    }
}
