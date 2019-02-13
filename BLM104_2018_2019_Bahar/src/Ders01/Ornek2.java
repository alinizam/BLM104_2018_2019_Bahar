/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        JFrame ekranim=new JFrame();
        ekranim.setVisible(true);
        ekranim.setSize(100, 100);
        //ekranim.getContentPane().setBackground(Color.red);
       
        //ekranim.getContentPane().add(jb);
       
        for (int i = 0; i < 10; i++) {
             JButton jb=new JButton("Buton"+i);
              ekranim.add(jb);
        }
       
        //ekranim.getContentPane().add(jb);

        ekranim.setLayout(new FlowLayout());
        ekranim.pack();
    }
}
