package Admin;

import AdminFinalFinal.Admin_Final;
import AdminResOrComm.AResOrComm;
//import Adminupdate.Admin_Final;
import MasterLogin.MasterLogin;
import ViewCustInfo_Admin.ViewCustInfo_Admin1;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        setLocation(500,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bViewCustInfo = new javax.swing.JButton();
        bUpdateBill = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        bViewCustInfo.setBackground(new java.awt.Color(255, 51, 102));
        bViewCustInfo.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        bViewCustInfo.setText("View Customer Information");
        bViewCustInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 2, true));
        bViewCustInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewCustInfoActionPerformed(evt);
            }
        });

        bUpdateBill.setBackground(new java.awt.Color(255, 51, 102));
        bUpdateBill.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        bUpdateBill.setText("Update Bill");
        bUpdateBill.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 2, true));
        bUpdateBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUpdateBillMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(bUpdateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bViewCustInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(bViewCustInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(bUpdateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bUpdateBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUpdateBillMouseClicked
        dispose();
        new Admin_Final().setVisible(true);
    }//GEN-LAST:event_bUpdateBillMouseClicked

    private void bViewCustInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewCustInfoActionPerformed
        dispose();
        new ViewCustInfo_Admin1().setVisible(true);
        
    }//GEN-LAST:event_bViewCustInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new AResOrComm().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUpdateBill;
    private javax.swing.JButton bViewCustInfo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
