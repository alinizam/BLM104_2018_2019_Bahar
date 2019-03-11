/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
       String desenMetni="[[abcd]&&[^defg]]";  
       String icindeDesenArananMetin="Fatih15 Sultan212 Mehmed12 cFatih";
       Ornek1.desenAra(desenMetni, icindeDesenArananMetin);
    }
}
