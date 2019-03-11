/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.Locale;

/**
 *
 * @author alinizam
 */
public class Ornek12 {
    public static void main(String[] args) {
        System.out.format("%3.2f%n",10.0);
        System.out.format("Benim sayım %,05d\n",111);
        System.out.format("Benim sayım %+,09.2f sayısıdır\n",5510.0);
        System.out.format(Locale.GERMAN,"Benim sayım %+,09.2f sayısıdır\n",5510.0);

    }
}
