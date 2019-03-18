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
public class Ornek13 {
    public static void main(String[] args) {
        try {
            Object o=null;
            int dizi[]=new int[3];
            dizi[4]=5;
            int a=1/0;
            o.toString();
           
            
            System.out.println("Normal devam");
        } catch (NullPointerException e) {
            System.out.println("Hata oldu");
        } catch (ArithmeticException|IndexOutOfBoundsException e) {
            System.out.println("Aritmetik veya index hatası");
        } catch (Exception e){
            System.out.println("Çok fazla hata var.");
        }
        System.out.println("Bitti");
 
    }
}
