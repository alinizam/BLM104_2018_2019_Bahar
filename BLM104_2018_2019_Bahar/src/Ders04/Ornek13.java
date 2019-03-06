/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek13 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("");
        for (int i = 0; i < 10000000; i++) {
            s.append("a");
        }
        System.out.println("Bitti");
        
        System.out.println((new StringBuilder("Ahmet")==new StringBuilder("Ahmet")));
    }
}
