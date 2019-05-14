/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import javax.swing.JOptionPane;

/**
 *
 * @author alinizam
 */
public class myFileVisitor implements FileVisitor<Path> {

    String arananDosya;

    public myFileVisitor(String arananDosya) {
        this.arananDosya = arananDosya;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (String.valueOf(file.getFileName()).equals(arananDosya)) {
            System.out.println("Aranan dosya bulundu : " + file.toString());
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Devam Edilsin mi?")) {
                return FileVisitResult.CONTINUE;
            }else{
                return FileVisitResult.TERMINATE;
            }
        } else {
            return FileVisitResult.CONTINUE;
        }
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

}
