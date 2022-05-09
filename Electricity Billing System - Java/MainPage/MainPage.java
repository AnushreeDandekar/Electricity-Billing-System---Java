/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPage;

/**
 *
 * @author Anushree
 */


import MasterLogin.*;
import CustLogin.*;
import ResiComm.ResiComm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
        setBounds(300,20,1000,750);
        
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bMaster = new javax.swing.JButton();
        bUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bMaster.setBackground(new java.awt.Color(255, 153, 153));
        bMaster.setFont(new java.awt.Font("Modern No. 20", 0, 48)); // NOI18N
        bMaster.setText("Master");
        bMaster.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        bMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMasterMouseClicked(evt);
            }

            private void bMasterMouseClicked(MouseEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new MasterLogin().setVisible(true);
            }
        });
        getContentPane().add(bMaster);
        bMaster.setBounds(80, 380, 320, 80);

        bUser.setBackground(new java.awt.Color(255, 153, 153));
        bUser.setFont(new java.awt.Font("Modern No. 20", 0, 48)); // NOI18N
        bUser.setText("User");
        bUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        bUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUserMouseClicked(evt);
            }

            private void bUserMouseClicked(MouseEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //new CustLogin().setVisible(true);
                new ResiComm().setVisible(true);
            }
        });
        getContentPane().add(bUser);
        bUser.setBounds(610, 380, 310, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\MainPage\\1.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1002, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*private void bMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMasterMouseClicked
        dispose();
      new MasterLogin().setVisible(true);
    }//GEN-LAST:event_bMasterMouseClicked*/

    /*private void bUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUserMouseClicked
       dispose();
       new CustLogin().setVisible(true);
    }//GEN-LAST:event_bUserMouseClicked*/

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMaster;
    private javax.swing.JButton bUser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
