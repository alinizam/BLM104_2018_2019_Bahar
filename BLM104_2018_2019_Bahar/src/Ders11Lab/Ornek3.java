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
public class Ornek3 {
    public static void main(String[] args) {
         String dosya = "/home/fsmblm0/Desktop/File/";
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(dosya+"personeller.dat"));
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("LabPU");
            EntityManager em=emf.createEntityManager();
            Query q =em.createQuery("Select p from Personel p");
            List<Personel> personeller =q.getResultList();
            em.getTransaction().begin();
            for (Personel personel : personeller) {
                oos.writeObject(personel);
                Personel p=new Personel();
                p.setPersonelId(personel.getPersonelId()+10);
                p.setName(personel.getName());
                p.setSurname(personel.getSurname());
                p.setUnvanId(personel.getUnvanId());
                p.setSalary(personel.getSalary()+10);
                
                em.persist(p);
             
            } 
            em.getTransaction().commit();
            oos.close();
            em.close();
            emf.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
