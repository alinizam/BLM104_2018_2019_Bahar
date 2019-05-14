/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(null);
        if (i==JFileChooser.APPROVE_OPTION){
            System.out.println(fc.getSelectedFile());
        }
        
    }
}
