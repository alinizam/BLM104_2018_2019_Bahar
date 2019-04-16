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
public class Ornek2 {
    public static void main(String[] args) {
         
        // TODO code application logic here
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p where p.maas>:pMaas");
        q.setParameter("pMaas", 3000);
        List<Personel> personeller=q.getResultList();
        for (Personel personel : personeller) {
            System.out.println(personel.getAdi()+" "+personel.getMaas());
        }
   
    }
}
