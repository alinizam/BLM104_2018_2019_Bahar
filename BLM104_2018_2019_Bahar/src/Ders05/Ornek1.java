/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String desenMetni="[0-9]";
        Pattern desen=Pattern.compile(desenMetni);
        String icindeDesenArananMetin="Fatih15 Sultan212 Mehmet12";
        Matcher arama=desen.matcher(icindeDesenArananMetin);
        while(arama.find()){
            System.out.println(arama.group()+" "+arama.start()+":"+arama.end());
        }
        
    }
    static void desenAra(String desenMetni,String icindeDesenArananMetin){
        
        Pattern desen=Pattern.compile(desenMetni);
        Matcher arama=desen.matcher(icindeDesenArananMetin);
        while(arama.find()){
            System.out.println(arama.group()+" "+arama.start()+":"+arama.end());
        }
    
    }
            
            
        
}
