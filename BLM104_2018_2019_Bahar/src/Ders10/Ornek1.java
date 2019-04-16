/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p");
        List<Personel> personeller=q.getResultList();
        for (Personel personel : personeller) {
            System.out.println(personel.getAdi()+" "+personel.getSoyadi());
        }
        Personel p1=new Personel();
        p1.setPersonelId(16);
        p1.setAdi("Halil");
        p1.setSoyadi("Oruç");
        em.getTransaction().begin();
        em.persist(p1);
      
      
        
        personeller=q.getResultList();
        for (Personel personel : personeller) {
            System.out.println(personel.getPersonelId()+" "+personel.getAdi()+" "+personel.getSoyadi());
        }
        
        p1.setAdi("Kemal");
        
        
              
       
        Query qUpdate=em.createQuery("update Personel p set p.adi='Mehmet' where p.personelId=16");
        qUpdate.executeUpdate();
        em.flush();
        Query q1=em.createQuery("select p from Personel p");
        personeller=q1.getResultList();
        for (Personel personel : personeller) {
            System.out.println(personel.getPersonelId()+" "+personel.getAdi()+" "+personel.getSoyadi());
        }
         
        em.getTransaction().commit(); 
        em.close();
        emf.close();
                
        
    }
}
