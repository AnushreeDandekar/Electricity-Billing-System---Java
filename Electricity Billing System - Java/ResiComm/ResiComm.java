/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResiComm;

/**
 *
 * @author Anushree
 */

import NewCustRes.*;
import NewCustComm.*;
import CustLogin.*;
import CustLoginC.CustLoginC;
import MainPage.MainPage;
import java.awt.event.MouseEvent;
public class ResiComm extends javax.swing.JFrame {

    public ResiComm() {
        initComponents();
        setBounds(300,20,1000,750);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCommercial = new javax.swing.JButton();
        bResidential = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bCommercial.setBackground(new java.awt.Color(255, 102, 102));
        bCommercial.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        bCommercial.setText("Commercial");
        bCommercial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCommercialMouseClicked(evt);
            }

            private void bCommercialMouseClicked(MouseEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new CustLoginC().setVisible(true);
            }
        });
        getContentPane().add(bCommercial);
        bCommercial.setBounds(570, 330, 340, 70);

        bResidential.setBackground(new java.awt.Color(255, 102, 102));
        bResidential.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        bResidential.setText("Residential");
        bResidential.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bResidentialMouseClicked(evt);
            }

            private void bResidentialMouseClicked(MouseEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               // new NewCustRes().setVisible(true);
               new CustLoginF().setVisible(true);
            }
        });
        getContentPane().add(bResidential);
        bResidential.setBounds(90, 330, 340, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Go Back");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 440, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\ResiComm\\4.png")); // NOI18N
        jLabel1.setText("Go Back");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bResidentialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bResidentialMouseClicked
       dispose();
       // new NewCustRes().setVisible(true);
       new CustLoginF().setVisible(true);
    }//GEN-LAST:event_bResidentialMouseClicked

    private void bCommercialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCommercialMouseClicked
        dispose();
        new CustLoginC().setVisible(true);     
    }//GEN-LAST:event_bCommercialMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //new CustLogin().setVisible(true);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResiComm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCommercial;
    private javax.swing.JButton bResidential;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
