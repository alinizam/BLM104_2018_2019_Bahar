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
public class Ornek10 {
    public static void main(String[] args) {
        int i=3,j=0;
        try{
            System.out.println(i/j);
        }
        catch(Exception e){
            System.out.println("Sıfıra bölme hatası");
            System.out.println(e.getMessage()+ e.getClass());
        }
    }
}
