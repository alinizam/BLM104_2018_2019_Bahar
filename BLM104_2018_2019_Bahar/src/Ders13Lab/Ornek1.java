/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import Ders10.Personel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;

/**
 *
 * @author alinizam
 */
public class Ornek1 extends javax.swing.JFrame {

    /**
     * Creates new form Ornek1
     */
    public Ornek1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtBirimAdi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDosya = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSilinenDosya = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("BirimDosyalarıniOlustur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BirimdekiKişileriDosyayaAktar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dosyaları listele ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Dosyası Silinen Birimleri Listele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Dosyası Silinen Birimleri Sil");

        lstDosya.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstDosya);

        lstSilinenDosya.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstSilinenDosya);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirimAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtBirimAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select b from Birim b");
        List<Birim> birimler = q.getResultList();
        for (Birim birim : birimler) {
            try {
                Path path = Paths.get("c:", "dosyalar", "b", birim.getBirimAdi() + ".txt");
                Files.createFile(path);
            } catch (IOException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select b from Birim b");
        List<Birim> birimler = q.getResultList();
        for (Birim birim : birimler) {
            try {
                Path path = Paths.get("c:", "dosyalar", "b", birim.getBirimAdi() + ".txt");
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toString()));
                Query qPersonel = em.createQuery("select p from Personel p where p.birimId=:bId");
                qPersonel.setParameter("bId", birim.getBirimId());
                List<Personel> personeller = qPersonel.getResultList();
                for (Personel personel : personeller) {
                    oos.writeObject(personel);
                }
                oos.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultListModel dlm = new DefaultListModel();
        try {
            // TODO add your handling code here:

            Path dir = Paths.get("c:", "dosyalar", "b");
            DirectoryStream<Path> dosyalar = Files.newDirectoryStream(dir);
            for (Path path : dosyalar) {
                dlm.addElement(path.getFileName());
            }

        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        lstDosya.setModel (dlm);
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2018_2019_BaharPU");
        EntityManager em = emf.createEntityManager();
        DefaultListModel dlm = new DefaultListModel();
        Query q = em.createQuery("select b from Birim b");
        List<Birim> birimler = q.getResultList();
        for (Birim birim : birimler) {
            try {
                Path dir = Paths.get("c:", "dosyalar", "b");
                DirectoryStream<Path> dosyalar = Files.newDirectoryStream(dir);
                boolean varMi=false;
                for (Path path : dosyalar) {
                    if (String.valueOf(path.getFileName()).equals(birim.getBirimAdi()+".txt")){
                       varMi=true;
                       break;
                    }
                }
                if (!varMi) {
                    dlm.addElement(birim.getBirimAdi());
                }
            } catch (IOException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
            lstSilinenDosya.setModel(dlm);
         
        }
           em.close();
            emf.close();
    }//GEN-LAST:event_jButton4ActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ornek1.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ornek1.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ornek1.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ornek1.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ornek1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstDosya;
    private javax.swing.JList<String> lstSilinenDosya;
    private javax.swing.JTextField txtBirimAdi;
    // End of variables declaration//GEN-END:variables
}
