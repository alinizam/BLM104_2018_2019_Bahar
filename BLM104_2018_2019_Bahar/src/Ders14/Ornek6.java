/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

/**
 *
 * @author alinizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        //System.out.println(factorial(5));
        factorial(5);
        System.out.println("");
        System.out.println(fib(6));
        System.out.println(fibDongu(7));
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            System.out.print(") f (" + n);
            return n * factorial(n - 1);
        }

    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 2) + fib(n - 1); 
    }
    static int fibDongu(int n) {
        int sonuc;
        if (n < 2) {
            sonuc= n;
        }
        sonuc=2;
        int sonuc1=1;
        int sonuc2=1;
        
        for (int i = 2; i < n; i++) {
            sonuc=sonuc1+sonuc2;
            sonuc2=sonuc1;
            sonuc1=sonuc;
        }
        return sonuc;
    }
}
