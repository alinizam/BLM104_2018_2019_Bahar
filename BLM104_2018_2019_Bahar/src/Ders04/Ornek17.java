/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek17 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[A-z0-9]{3}");
        Matcher m=p.matcher("1 Ahmet 2 Kİemal 3 Meh24562met");
        while(m.find()) 
            System.out.println(m.group());
    }
}
