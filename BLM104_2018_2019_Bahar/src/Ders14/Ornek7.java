/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.util.Arrays;

/**
 *
 * @author alinizam
 */
public class Ornek7 {

    public static void main(String[] args) {
        int sayilar[] = {8, 9, 1, 3, 5};
        int x = 6, y = 3;
        y = swap(x, x = y);
        System.out.println("x : " + x + "  y :" + y);
        //bubbleSort(sayilar);
        bubbleSortrec(sayilar, sayilar.length);
        for (int i : sayilar) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    sayilar[j + 1] = swap(sayilar[j], sayilar[j] = sayilar[j + 1]);
                }
            }
        }
    }

    static void bubbleSortrec(int[] sayilar, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (sayilar[i + 1] < sayilar[i]) {
                sayilar[i + 1] = swap(sayilar[i], sayilar[i] = sayilar[i + 1]);
            }
        }
        bubbleSortrec(sayilar, n - 1);
    }

    static int swap(int x, int y) {
        return x;
    }

}
