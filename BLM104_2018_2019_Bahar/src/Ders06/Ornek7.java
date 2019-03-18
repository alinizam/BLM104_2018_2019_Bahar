/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        //Bu metinde kaç ratgele seçimde bir rakkam bulunabilir.
        String metin ="Fatih12 Sultan23 Mehmet2";
        int secimSayisi=0;
        Random r=new Random();
        int rasgeleNokta;
        do {
            secimSayisi++;
            rasgeleNokta=r.nextInt(metin.length());
            System.out.println(metin.charAt(rasgeleNokta));
        }  while(!Character.isDigit(metin.charAt(rasgeleNokta)));
        System.out.println("Seçim sayısı = "+secimSayisi);
    }
}
