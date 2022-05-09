/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package NewCustComm2;

/**
 *
 * @author Anushree
 */

/*import NewCustComm.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class NewCustComm2 extends javax.swing.JFrame {
    
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

    public NewCustComm2() {
        initComponents();
        setBounds(300,20,1000,750);
        getConn();
        
        p.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        cb = new javax.swing.JCheckBox();
        pfConfirmPassword = new javax.swing.JPasswordField();
        bSignUP = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        p = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(204, 204, 204));
        tfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsernameMouseClicked(evt);
            }
        });
        getContentPane().add(tfUsername);
        tfUsername.setBounds(490, 150, 360, 70);

        pfPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pfPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(pfPassword);
        pfPassword.setBounds(490, 340, 360, 70);

        cb.setBackground(new java.awt.Color(255, 102, 102));
        cb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cb.setForeground(new java.awt.Color(255, 255, 255));
        cb.setText("Show Password");
        cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMouseClicked(evt);
            }
        });
        getContentPane().add(cb);
        cb.setBounds(490, 430, 150, 25);

        pfConfirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(pfConfirmPassword);
        pfConfirmPassword.setBounds(490, 520, 360, 70);

        bSignUP.setBackground(new java.awt.Color(255, 102, 102));
        bSignUP.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bSignUP.setText("Sign Up");
        bSignUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSignUPMouseClicked(evt);
            }
        });
        getContentPane().add(bSignUP);
        bSignUP.setBounds(671, 651, 170, 40);

        bBack.setBackground(new java.awt.Color(255, 102, 102));
        bBack.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bBack.setText("Back");
        bBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBackMouseClicked(evt);
            }
        });
        getContentPane().add(bBack);
        bBack.setBounds(460, 650, 160, 40);

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
        p.setBounds(660, 420, 280, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anushree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\NewCustComm2\\8.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseClicked

    }//GEN-LAST:event_tfUsernameMouseClicked

    private void cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMouseClicked
        if (cb.isSelected()) {
            pfPassword.setEchoChar((char)0);
        } else {
            pfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMouseClicked

    private void bSignUPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignUPMouseClicked
        //if(pfPassword.equals(pfConfirmPassword)){
        String uname = tfUsername.getText();
        String pass = String.valueOf(pfPassword.getPassword());
        String c_pass = String.valueOf(pfConfirmPassword.getPassword());
        
         if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        
        else if(!pass.equals(c_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }
        
      /*  else if(checkUsername(uname))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }*/
        
        /*try {
            String sqlQuery =  "INSERT INTO residential_reg2 VALUES (?,?)";
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
           
            pst.setString(1, uname);
            pst.setString(2, pass);
           
            pst.executeUpdate();
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null,sQLException);
        }
        
        dispose();
        }
    //GEN-LAST:event_bSignUPMouseClicked

    private void bBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBackMouseClicked
        dispose();
        new NewCustComm().setVisible(true);
    }//GEN-LAST:event_bBackMouseClicked

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
                new NewCustComm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bSignUP;
    private javax.swing.JCheckBox cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel p;
    private javax.swing.JPasswordField pfConfirmPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}*/
