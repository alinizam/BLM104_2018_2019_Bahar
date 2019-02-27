/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Hasta {
    String adi,soyadi,doktorAdi;
    int id;

    public Hasta() {
    }

    public Hasta(int id,String adi, String soyadi, String doktorAdi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.doktorAdi = doktorAdi;
        this.id = id;
    }
    

    public Hasta(String adi) {
        this.adi = adi;
    }
    

    @Override
    public String toString() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
