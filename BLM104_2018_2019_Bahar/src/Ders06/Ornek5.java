/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        Random r=new Random();
        for (int i = 0; i < 1000000; i++) {
            sayilar[(int)(r.nextInt(3))]++;
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
