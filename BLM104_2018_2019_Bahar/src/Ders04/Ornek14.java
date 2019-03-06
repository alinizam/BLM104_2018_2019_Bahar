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
public class Ornek14 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("Uzunluk= "+sb.length()+"  Kapasite= "+sb.capacity());
        sb.append("Ahmet");
        System.out.println("Uzunluk= "+sb.length()+"  Kapasite= "+sb.capacity());
        sb.append("Ak Eve Geldi mi acaba.");
        System.out.println("Uzunluk= "+sb.length()+"  Kapasite= "+sb.capacity());
        
        sb.insert(8, "saat 10'da ");
        System.out.println(sb);
        System.out.println(sb.replace(10, 15,"hangiccccccccccccc"));
        
        System.out.println(sb.reverse());
    }
}
