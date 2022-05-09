package CustLoginC;
//import ResiComm.*;
//import MainUI.*;
import MainUI.MainUI;
import MainUIC.MainUIC;
import My_CNX.My_CNX;
import NewCustComm.NewCustComm;

import ResiComm.ResiComm;
//import My_CNX.My_CNX;
//import ResiComm.ResiComm1;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class CustLoginC extends javax.swing.JFrame {

    public CustLoginC() {
        initComponents();
        setBounds(300,20,1000,770);
         p.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLogin = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        cb = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        tfUsername1 = new javax.swing.JTextField();
        p = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        bLogin.setBounds(780, 640, 180, 40);

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
        bClear.setBounds(410, 640, 180, 40);

        cb.setBackground(new java.awt.Color(0, 51, 51));
        cb.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        cb.setForeground(new java.awt.Color(255, 255, 255));
        cb.setText("Show Password");
        cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMouseClicked(evt);
            }
        });
        getContentPane().add(cb);
        cb.setBounds(630, 600, 120, 25);

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Don't have an account? Register now!");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 670, 290, 50);

        tfUsername1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(tfUsername1);
        tfUsername1.setBounds(630, 340, 320, 60);

        p.setBackground(new java.awt.Color(51, 51, 51));
        p.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Password must contain atleast 8 characters ");
        p.add(jLabel3);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("and one special character ");
        p.add(jLabel4);

       /* jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("character and one number. Minimum 8 characters.");
        p.add(jLabel5);*/

        getContentPane().add(p);
        p.setBounds(650, 430, 280, 60);

        pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(pfPassword);
        pfPassword.setBounds(630, 520, 320, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\CustLogin\\3.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseClicked
        pfPassword.setText("");
        pfPassword.setText("");
    }//GEN-LAST:event_bClearMouseClicked

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        
        PreparedStatement st;
        ResultSet rs;
        
        
      //  String username = jTextField_Username.getText();
         String username;
        username = tfUsername1.getText();
        String password = String.valueOf(pfPassword.getPassword()); 
        
        //String query ="";
        String query = "SELECT * FROM `residential_reg2` WHERE `u_username` = ? AND `u_password` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
             if(rs.next())
            {
                // show a new form
                MainUIC form = new MainUIC();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustLoginC.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
     //    Component JFrame = null;
     //   JOptionPane.showMessageDialog(JFrame,"Logged in successfully."); 
        
    //    dispose();
     //  new MainUI().setVisible(true);
    }//GEN-LAST:event_bLoginActionPerformed

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

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        //new ResiComm().setVisible(true);
        new NewCustComm().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfPasswordMouseClicked
        p.setVisible(true);
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               p.setVisible(false);
               
            }
        };
        Timer timer = new Timer(10000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_pfPasswordMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustLoginC().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel p;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername1;
    // End of variables declaration//GEN-END:variables
}
