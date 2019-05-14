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
public class Ornek5 {
    public static void main(String[] args) {
        /*for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }*/
        azalanYazdir(10);
        
    }
    static void azalanYazdir(int i){
        if (i>0){
            System.out.println(i);
            azalanYazdir(i-1);
        }
            
    }
}
