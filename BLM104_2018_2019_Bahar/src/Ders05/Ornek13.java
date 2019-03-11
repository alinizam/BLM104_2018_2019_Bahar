/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.text.DecimalFormat;

/**
 *
 * @author alinizam
 */
public class Ornek13 {
    public static void main(String[] args) {
        String desen="000,000.##";
        DecimalFormat bicim=new DecimalFormat(desen);
        System.out.println(bicim.format(50000.126));
        
       
    }
}
