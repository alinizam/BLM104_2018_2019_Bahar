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
public class Ornek9 {
    public static void main(String[] args) {
        long toplam=0L;
        for (long i = 0; i < 1000000000; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }
}
