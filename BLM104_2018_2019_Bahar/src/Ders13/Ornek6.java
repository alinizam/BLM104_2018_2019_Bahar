/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            String path = "C:\\dosyalar\\sayilar.txt";
            fis = new FileInputStream(path);
            FileChannel fileChannel = fis.getChannel();
            
            fileChannel.position(5);
            ByteBuffer buffer = ByteBuffer.allocate(20);
            int bytesRead = fileChannel.read(buffer);
            for (byte b : buffer.array()) {
                System.out.print((char)b);
            }
           
               
       
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }

    
}
