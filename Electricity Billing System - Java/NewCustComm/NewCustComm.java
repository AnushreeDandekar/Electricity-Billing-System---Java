/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCustComm;

/**
 *
 * @author Anushree
 */

import NewCustComm2.*;
import ResiComm.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NewCustComm extends javax.swing.JFrame {
    
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

    public NewCustComm() {
        initComponents();
        setBounds(300,20,1000,780);
        getConn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCN = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfON = new javax.swing.JTextField();
        tfCNum = new javax.swing.JTextField();
        tfONum = new javax.swing.JTextField();
        tfCity = new javax.swing.JTextField();
        tfMN = new javax.swing.JTextField();
        bProceed = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfCN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfCN);
        tfCN.setBounds(490, 190, 330, 30);

        tfEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfEmail);
        tfEmail.setBounds(490, 560, 330, 30);

        tfON.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfON);
        tfON.setBounds(490, 260, 330, 30);

        tfCNum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfCNum);
        tfCNum.setBounds(490, 330, 330, 30);

        tfONum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfONum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfONumKeyTyped(evt);
            }
        });
        getContentPane().add(tfONum);
        tfONum.setBounds(490, 410, 330, 30);

        tfCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfCity);
        tfCity.setBounds(490, 630, 330, 30);

        tfMN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(tfMN);
        tfMN.setBounds(490, 490, 330, 30);

        bProceed.setBackground(new java.awt.Color(255, 102, 102));
        bProceed.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bProceed.setText("Proceed");
        bProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bProceedMouseClicked(evt);
            }
        });
        getContentPane().add(bProceed);
        bProceed.setBounds(660, 690, 160, 40);

        bBack.setBackground(new java.awt.Color(255, 102, 102));
        bBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bBack.setText("Back");
        bBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBackMouseClicked(evt);
            }
        });
        getContentPane().add(bBack);
        bBack.setBounds(460, 690, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\NewCustComm\\7.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 999, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProceedMouseClicked
        dispose();
        try {
            String sqlQuery = "INSERT INTO commercial (company_name,owner_name,comp_number,owner_number,meter_number,email,city)VALUES ( ?, ?, ?, ?, ?, ?,?);";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            pst.setString(1, tfCN.getText());
            pst.setString(2, tfON.getText());
            pst.setString(3, tfCNum.getText());
            pst.setString(4, tfONum.getText());
            pst.setString(5, tfMN.getText());
            pst.setString(6, tfEmail.getText());
            pst.setString(7,tfCity.getText());
            pst.executeUpdate();
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null,sQLException);
        }
        new NewCustComm2F().setVisible(true);
    }//GEN-LAST:event_bProceedMouseClicked

    private void bBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBackMouseClicked
        dispose();
        new ResiComm().setVisible(true);
    }//GEN-LAST:event_bBackMouseClicked

    private void tfONumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfONumKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();}
    }//GEN-LAST:event_tfONumKeyTyped
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustComm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bProceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfCN;
    private javax.swing.JTextField tfCNum;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfMN;
    private javax.swing.JTextField tfON;
    private javax.swing.JTextField tfONum;
    // End of variables declaration//GEN-END:variables
}
