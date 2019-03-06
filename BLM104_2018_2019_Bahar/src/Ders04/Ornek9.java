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
public class Ornek9 {
    public static void main(String[] args) {
        int i=1;
        System.out.printf("2007%07d\n",1);
        System.out.printf("2007%07d\n",1112);
        System.out.printf("2007%07d\n",1321314);
    
        String  s=String.format("2007%07d\n",1);
        System.out.println(s);
    }
}
