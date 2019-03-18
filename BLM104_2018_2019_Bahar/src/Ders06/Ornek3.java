/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Arrays;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        //1 ile 10 arası 10 adet rasgele sayı
        int sayilar[]=new int[3];
        for (int i = 0; i < 1000000; i++) {
            sayilar[(int)(Math.random() * 3)]++;
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
