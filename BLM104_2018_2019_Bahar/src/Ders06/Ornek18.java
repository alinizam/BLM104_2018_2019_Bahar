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
public class Ornek18 {

    public static void main(String[] args) {

        try {
            Ambar a = new Ambar();
            a.kalanMalzeme = 20;
            a.cikis(10);
            System.out.println(a.kalanMalzeme);
            a.cikis(15);
        } catch (StokHata e) {
            System.out.println(e.eksikMalzeme);
        }

    }

}
