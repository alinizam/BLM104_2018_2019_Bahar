/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        int i=5;
        Integer j=i;
        i=j;
        ArrayList<Integer> sayilar=new ArrayList();
        sayilar.add(110);
        sayilar.add((Integer)15);
        System.out.println(sayilar);
        System.out.println(Integer.MAX_VALUE/2);
        
    }
}
