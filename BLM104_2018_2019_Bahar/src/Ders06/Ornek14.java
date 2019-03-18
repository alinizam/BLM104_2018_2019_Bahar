/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek14 {

    public static void main(String[] args) {
        System.out.println("Main çağrıldı");
        a();
        System.out.println("Main bitti");
    }

    static void a() {
        System.out.println("A çağrıldı");
        b();
        System.out.println("A bitti");
    }

    static void b() {
        System.out.println("B çağrıldı");
        try {
            c();
        } catch (Exception e) {
        }
        System.out.println("B bitti");
    }

    static void c() {
        System.out.println("C çağrıldı");
        int cDegisken = 1 / 0;
        System.out.println("C bitti");
    }
}
