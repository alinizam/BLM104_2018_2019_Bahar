/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(50));

        }
    }
}
