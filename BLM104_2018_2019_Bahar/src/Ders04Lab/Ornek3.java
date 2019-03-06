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
public class Ornek3 {

    public static void main(String[] args) {
        String s = "Fatih123 Sultan mehmet vakıf4 Ün3iversitesi55";
        String[] kelimeler = s.split(" ");
        for (String kelime : kelimeler) {
            boolean arananMi = true;
            for (int i = 0; i < kelime.length(); i++) {
                if ((Character.isDigit(kelime.charAt(i)) || Character.isUpperCase(kelime.charAt(i)))) {
                    arananMi = false;
                    break;
                }
            }
            if (arananMi) {
                System.out.println(kelime);
            }
        }
        int toplam = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                toplam += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Toplam = " + toplam);

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--; //While ile çözülmesi önerilir.
            }

        }
        System.out.println(sb);
    }
}
