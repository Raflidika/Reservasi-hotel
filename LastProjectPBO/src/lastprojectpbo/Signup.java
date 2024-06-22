/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lastprojectpbo;

import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author Rafli Dika
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        masukkanPenggunaSignup = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordSignup = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        konfirmasiPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(808, 580));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\hotelbagus.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 620));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 117, -1));

        masukkanPenggunaSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukkanPenggunaSignupActionPerformed(evt);
            }
        });
        jPanel4.add(masukkanPenggunaSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 176, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 80, -1));
        jPanel4.add(passwordSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 181, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Konfirmasi Password");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, -1));
        jPanel4.add(konfirmasiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 181, -1));

        jButton2.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jButton2.setText("SignUp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -10, 400, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void masukkanPenggunaSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukkanPenggunaSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masukkanPenggunaSignupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(masukkanPenggunaSignup.getText().isEmpty()&& passwordSignup.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Isi Pengguna dan Password Terlebih Dahulu!", "Form Tidak Boleh Kosong", JOptionPane.WARNING_MESSAGE);
       }else if(masukkanPenggunaSignup.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Nama Pengguna Harus di isi", "Nama Pengguna Tidak Boleh Kosong", JOptionPane.WARNING_MESSAGE);
       }else if(passwordSignup.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Mohon Masukkan Password Terlebih Dahulu!");
       }
       
      if(masukkanPenggunaSignup.getText().isEmpty() || passwordSignup.getPassword().length == 0 || konfirmasiPassword.getPassword().length == 0) {
        JOptionPane.showMessageDialog(this, "Silakan lengkapi semua kolom!", "Form Belum Lengkap", JOptionPane.WARNING_MESSAGE);
        } else if (!Arrays.equals(passwordSignup.getPassword(), konfirmasiPassword.getPassword())) {
    JOptionPane.showMessageDialog(this, "Konfirmasi kata sandi tidak sesuai!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
    // Lanjutkan dengan proses pendaftaran ke database

       try{
       Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservasi_hotel", "root", "");
       String query = "INSERT INTO user (username, password) values (?, ?)";
       PreparedStatement ps = Conn.prepareStatement(query);
           ps.setString(1, masukkanPenggunaSignup.getText());
           ps.setString(2, passwordSignup.getText());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(this, "Registrasi Berhasil!");
           Conn.close();
           
           this.dispose();
           Login login = new Login();
           login.setVisible(true);
       
       }catch(SQLException ex){
           ex.printStackTrace();
           JOptionPane.showMessageDialog(this, ex.getMessage(), "Error, Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
       }
      
      }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField konfirmasiPassword;
    private javax.swing.JTextField masukkanPenggunaSignup;
    private javax.swing.JPasswordField passwordSignup;
    // End of variables declaration//GEN-END:variables
}
