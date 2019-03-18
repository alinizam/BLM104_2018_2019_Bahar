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
public class Ambar {
    int kalanMalzeme;
    void cikis(int cikisMiktar){
        kalanMalzeme-=cikisMiktar;
        if (kalanMalzeme-cikisMiktar<0)
            throw new StokHata(kalanMalzeme-cikisMiktar);
    }
}
