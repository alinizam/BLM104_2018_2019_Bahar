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
public class Ornek7 {
     //Başında ve sonunda rakkam olan kelimeleri bulunuz.
      public static void main(String[] args) {     
       //Başında ve sonunda rakkam olan kelimeleri bulunuz.
       //String desenMetni="[0-9]+[A-z]+[0-9]+";    
       
       //Başında harf sonunda rakkam olan kelimeleri bulunuz. Tam çözülmedi
       String desenMetni="([^0-9]+[A-z]+[0-9]+)";    
       String icindeDesenArananMetin="Fatih15 112Sultan21245 Mehmed342 cFatih";
       Ornek1.desenAra(desenMetni, icindeDesenArananMetin);
    }
}
