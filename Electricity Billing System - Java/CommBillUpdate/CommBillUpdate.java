/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommBillUpdate;



/**
 *
 * @author Anushree
 */

import Admin.Admin;
import Admin1.Admin1;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CommBillUpdate extends javax.swing.JFrame {
    
     double charge,gramount;
       int count;
       String mt;
       //String month;

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
  
    public CommBillUpdate() {
        initComponents();
        getConn();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_month = new javax.swing.JLabel();
        lb_units = new javax.swing.JLabel();
        lb_meter_no = new javax.swing.JLabel();
        tf_units = new javax.swing.JTextField();
        tf_meter_no = new javax.swing.JTextField();
        tf_month = new javax.swing.JTextField();
        jb_generate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_month.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_month.setText("Month");

        lb_units.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_units.setText("Units");

        lb_meter_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_meter_no.setText("Meter No");

        jb_generate.setBackground(new java.awt.Color(255, 51, 102));
        jb_generate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jb_generate.setText("Generate");
        jb_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_generateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
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
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_meter_no, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_units, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_month, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_units, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_month, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_meter_no, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(316, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_meter_no, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_meter_no, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_units, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_units, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_month, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_month, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_generate, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jb_generateActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       
        
           
        
   /* try{  
          Statement st = null;

                    String meterno = tf_meter_no.getText();
                    String units = tf_units.getText();
                    String month = tf_month.getText();
                    
                  // String sqlQuery = "UPDATE `profile` SET`Res_Units`=?,`Month`=? WHERE `meter_no`=?;";
                  String sqlQuery = "Update `profile` SET `Res_Units`=('"+units+"'),`Month`=('"+month+"') where `meter_no`=('"+meterno+"');";
                    String query="INSERT into `profile`(`Amount`) VALUES ('"+gramount+"') WHERE `meter_no`=('"+meterno+"');";


// String sql = "INSERT INTO newuser(flat_no,name,phone_no,email,password) VALUES('"+flatno+"','"+name+"','"+phoneno+"','"+email+"','"+password+"');";

               st.executeUpdate(sqlQuery);
        
              st.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Updated");
 }       catch (SQLException ex) {
             Logger.getLogger(Admin_Final.class.getName()).log(Level.SEVERE, null, ex);
         }
*/
 
       
       
    try { 
             //String amount = String.valueOf(gramount);
              String sqlQuery = "UPDATE `commercial` SET`units`=? , `month` =? WHERE `meter_number`=?;";
              //String query="INSERT into `profile`(`Amount`) VALUES ('"+gramount+"') WHERE `meter_no`=?;";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            //PreparedStatement psst=conn.prepareStatement(query);
            //pst.setString(1, tf_meter_no.getText());
            pst.setString(2, tf_month.getText());
            pst.setString(1, tf_units.getText());
            pst.setString(3, tf_meter_no.getText());
            pst.executeUpdate();
            //String meternumber=tf_meter_no.getText();
             count = Integer.parseInt(tf_units.getText());
        if(count < 100)
        {
            charge = 3.00;
        }
        else if(count < 100 && count < 300)
        {
            charge = 7.00;
        }
        else if(count < 300 && count < 500)
        {
            charge = 10.00;
        }
        else if(count < 500 && count < 100)
        {
            charge = 11.00;
        }
        else
        {
            charge = 11.00;
        }
        gramount = charge * count;
        
        mt=tf_meter_no.getText();
        //month=tf_month.getText();
        
           // String query="UPDATE `profile` VALUES ('"+gramount+"') where `meter_no`=('"+mt+"')";
           String query="UPDATE `commercial` SET `amount`=('"+gramount+"') where `meter_number`=('"+mt+"')";
            PreparedStatement psst=conn.prepareStatement(query);
           // psst.setString(1,tf_meter_no.getText());
            
            psst.executeUpdate();
          // System.out.println(gramount);
         // System.out.println(mt);
            JOptionPane.showMessageDialog(null,"Updated");
        
        
      
        
         
      }catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null,sQLException);
    }                                           
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
        new Admin1().setVisible(true);
    }                                        
       
    
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
            java.util.logging.Logger.getLogger(CommBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommBillUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jb_generate;
    private javax.swing.JLabel lb_meter_no;
    private javax.swing.JLabel lb_month;
    private javax.swing.JLabel lb_units;
    private javax.swing.JTextField tf_meter_no;
    private javax.swing.JTextField tf_month;
    private javax.swing.JTextField tf_units;
    // End of variables declaration                   
}
