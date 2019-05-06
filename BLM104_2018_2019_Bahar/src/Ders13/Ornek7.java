/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek7 {

    public static void main(String[] args) {
        Path file=Paths.get("c:\\dosyalar\\sayilar.txt");
        String s = "Merhaba\n";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);
        try (FileChannel fc = (FileChannel.open(file, WRITE))) {
             fc.position(2);
             fc.write(out);
             fc.close();
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}