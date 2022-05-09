/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCustRes;

/**
 *
 * @author Anushree
 */
import java.sql.PreparedStatement;
import CustLogin.CustLoginF;
import java.awt.*;
import java.awt.event.*;
import NewCustRes2.*;
import ResiComm.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NewCustRes extends javax.swing.JFrame {
    
   public Connection conn = null;
    
    String url="jdbc:mysql://localhost:3306/electricitybilling";
    String user="root";
    String password="";
    
    public Connection getConn(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException classNotFoundException) {
            
            JOptionPane.showMessageDialog(null,classNotFoundException);
        }
        
        try {
            conn = DriverManager.getConnection(url,user,password);
            
            JOptionPane.showMessageDialog(null,"Connected");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return conn;
    }
   
     
   
    public NewCustRes() {
        initComponents();
        setBounds(300,20,1000,770);
         getConn(); 
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEmail = new javax.swing.JTextField();
        tfFN = new javax.swing.JTextField();
        tfLN = new javax.swing.JTextField();
        tfPN = new javax.swing.JTextField();
        tfCity = new javax.swing.JTextField();
        bBack = new javax.swing.JButton();
        bProceed = new javax.swing.JButton();
        tfMN1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfEmail);
        tfEmail.setBounds(490, 600, 330, 30);

        tfFN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfFN);
        tfFN.setBounds(490, 190, 330, 30);

        tfLN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfLN);
        tfLN.setBounds(490, 270, 330, 30);

        tfPN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfPN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPNKeyTyped(evt);
            }
        });
        getContentPane().add(tfPN);
        tfPN.setBounds(490, 440, 330, 30);

        tfCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfCity);
        tfCity.setBounds(490, 520, 330, 30);

        bBack.setBackground(new java.awt.Color(255, 102, 102));
        bBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bBack.setText("Back");
        bBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBackMouseClicked(evt);
            }
        });
        getContentPane().add(bBack);
        bBack.setBounds(450, 670, 160, 40);

        bProceed.setBackground(new java.awt.Color(255, 102, 102));
        bProceed.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bProceed.setText("Proceed");
        bProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bProceedMouseClicked(evt);
            }
        });
        getContentPane().add(bProceed);
        bProceed.setBounds(660, 670, 160, 40);

        tfMN1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfMN1);
        tfMN1.setBounds(490, 360, 330, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\NewCustRes\\5.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 999, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBackMouseClicked
      dispose();
      new ResiComm().setVisible(true);
    }//GEN-LAST:event_bBackMouseClicked

    private void bProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProceedMouseClicked
       dispose();
        try {
            String sqlQuery = "INSERT INTO profile (fn,ln,meter_no,phone_no,email,city)VALUES ( ?, ?, ?, ?, ?, ?);";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            pst.setString(1, tfFN.getText());
            pst.setString(2, tfLN.getText());
            pst.setString(3, tfMN1.getText());
            pst.setString(4, tfPN.getText());
            pst.setString(5, tfCity.getText());
            pst.setString(6,tfEmail.getText());
            pst.executeUpdate();
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null,sQLException);
        }
       new NewCustRes2().setVisible(true);
    }//GEN-LAST:event_bProceedMouseClicked

    private void tfPNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPNKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();}
    }//GEN-LAST:event_tfPNKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustRes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bProceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFN;
    private javax.swing.JTextField tfLN;
    private javax.swing.JTextField tfMN1;
    private javax.swing.JTextField tfPN;
    // End of variables declaration//GEN-END:variables
}
