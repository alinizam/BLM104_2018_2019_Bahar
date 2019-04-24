/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.Serializable;

/**
 *
 * @author fsmblm0
 */
public class Personel1 implements Serializable{
    String adi,soyadi;
    int maas;

    public Personel1(String adi, String soyadi, int maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
    }
    
}
