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
public class StokHata extends RuntimeException{
    int eksikMalzeme;
    public StokHata(int eksikMalzeme) {
        this.eksikMalzeme=eksikMalzeme;
        System.out.println("ambardan yanlış çıkış: "+eksikMalzeme+"kadar eksk var");
    }
    
}

