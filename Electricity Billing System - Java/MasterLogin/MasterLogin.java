/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterLogin;

/**
 *
 * @author Anushree
 */

import Admin.Admin;
import AdminResOrComm.AResOrComm;
import MainPage.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax. swing. Timer;
public class MasterLogin extends javax.swing.JFrame {

    public MasterLogin() {
        initComponents();
        setBounds(300,20,1000,770);
        p.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        cb = new javax.swing.JCheckBox();
        bClear = new javax.swing.JButton();
        bLogin = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();
        p = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsername);
        tfUsername.setBounds(640, 350, 310, 50);

        pfPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(pfPassword);
        pfPassword.setBounds(640, 520, 310, 60);

        cb.setBackground(new java.awt.Color(51, 51, 51));
        cb.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        cb.setForeground(new java.awt.Color(255, 255, 255));
        cb.setText("Show Password");
        cb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 5, true));
        cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMouseClicked(evt);
            }
        });
        getContentPane().add(cb);
        cb.setBounds(630, 600, 160, 27);

        bClear.setBackground(new java.awt.Color(255, 102, 102));
        bClear.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bClear.setText("Clear");
        bClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        bClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bClearMouseClicked(evt);
            }
        });
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        getContentPane().add(bClear);
        bClear.setBounds(530, 660, 180, 40);

        bLogin.setBackground(new java.awt.Color(255, 102, 102));
        bLogin.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bLogin.setText("Login");
        bLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin);
        bLogin.setBounds(780, 660, 180, 40);

        lbBack.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbBack.setForeground(new java.awt.Color(255, 204, 204));
        lbBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBack.setText("Go back");
        lbBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 3, true));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        getContentPane().add(lbBack);
        lbBack.setBounds(371, 660, 80, 40);

        p.setBackground(new java.awt.Color(51, 51, 51));
        p.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Password must contain atleast one Uppercase ");
        p.add(jLabel2);

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("letter, one lowercase letter, one special  ");
        p.add(jLabel3);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("character and one number. Minimum 8 characters");
        p.add(jLabel4);

        getContentPane().add(p);
        p.setBounds(650, 430, 280, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\MasterLogin\\2.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseClicked
        tfUsername.setText("");
        pfPassword.setText("");
    }//GEN-LAST:event_bClearMouseClicked

    private void cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMouseClicked
       if (cb.isSelected()) {
      pfPassword.setEchoChar((char)0); 
   } else {
      pfPassword.setEchoChar('*');
   }

    }//GEN-LAST:event_cbMouseClicked

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClearActionPerformed

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        dispose();
        new MainPage().setVisible(true);
    }//GEN-LAST:event_lbBackMouseClicked

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void pfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfPasswordMouseClicked
        p.setVisible(true);
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               p.setVisible(false);
               
            }
        };
        Timer timer = new Timer(15000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_pfPasswordMouseClicked

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        Component JFrame = null;
        JOptionPane.showMessageDialog(JFrame,"Logged in successfully.");  
        dispose();
        new AResOrComm().setVisible(true);
    }//GEN-LAST:event_bLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterLogin().setVisible(true);
                
                
                

        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bLogin;
    private javax.swing.JCheckBox cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbBack;
    private javax.swing.JPanel p;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    public static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
