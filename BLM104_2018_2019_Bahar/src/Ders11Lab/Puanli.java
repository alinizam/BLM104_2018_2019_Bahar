/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author fsmblm0
 */
public class Puanli {

    public static void main(String[] args) {
        String dosya = "/home/fsmblm0/Desktop/File/";
        try {
            ObjectOutputStream oosk = new ObjectOutputStream(new FileOutputStream(dosya + "kucuk.dat"));
            ObjectOutputStream ooso = new ObjectOutputStream(new FileOutputStream(dosya + "orta.dat"));
            ObjectOutputStream oosb = new ObjectOutputStream(new FileOutputStream(dosya + "buyuk.dat"));
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LabPU");
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("Select p from Personel p");
            List<Personel> personeller = q.getResultList();
            for (Personel p : personeller) {
                if (p.getSalary() > 0 && p.getSalary() < 1000) {
                    oosk.writeObject(p);
                } else if (p.getSalary() > 1000 && p.getSalary() < 2000) {
                    ooso.writeObject(p);
                } else if (p.getSalary() > 2000) {
                    oosb.writeObject(p);
                }
            }
            oosk.close();
            oosb.close();
            ooso.close();
            em.close();
            emf.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
