/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        String dizi[] = {"1", "6", "1g", "10", "d"};
        for (int i = 0; i<dizi.length ; i++) {

            try {

                int sayi = Integer.parseInt(dizi[i]);

            } catch (NumberFormatException e) {
                System.out.println(dizi[i]);

            }

        }

    }
}
