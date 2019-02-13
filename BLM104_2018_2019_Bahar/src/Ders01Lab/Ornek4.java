/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        JFrame ekran=new JFrame("Ekranım");
        JTextField txt=new JTextField("Metin");
        JLabel lbl=new JLabel("Etiket");
        JButton btn=new JButton("Buton");
        ekran.add(txt);
        ekran.add(lbl);
        ekran.add(btn);
        ekran.setLayout(new FlowLayout());
        ekran.setSize(300, 300);
        ekran.setVisible(true);
        ekran.validate();
    }
}
