/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        String metin="Fatih Sultan Mehmet tan";
        String aranan="tan";
        for (int i = 0; i < metin.length()-aranan.length()+1; i++) {
            int arananKelimeHarfAdet=0;
            for (int j = 0; j < aranan.length(); j++) {
                if(metin.charAt(i+j)==aranan.charAt(j)){
                    arananKelimeHarfAdet=j+1;
                }else {
                    break;
                } 
            }
            if (arananKelimeHarfAdet==aranan.length()){
                System.out.println("Bulunan nokta = "+i);
            }
        }
        
    }
}
