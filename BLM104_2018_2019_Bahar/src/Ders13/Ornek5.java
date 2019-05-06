/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile(null, ".myapp");
            System.out.format("The temporary file"
                    + " has been created: %s%n", tempFile);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }
}
