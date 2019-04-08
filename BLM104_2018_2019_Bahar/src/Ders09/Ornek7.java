/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Malzeme m=new Malzeme();
        m.setMalzemeId(20);
        m.setAdi("Tabak");
        m.setTuru("Ev");
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
 
}
