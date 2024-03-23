package com.mylibsys.libsystem.ui;

import com.mylibsys.libsystem.ui.UIND.LibSystemND;
import com.mylibsys.libsystem.dao.UserDao;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginUIQLNoSql extends javax.swing.JFrame {

    static String nameAdmin;
    UserDao usDAO = new UserDao();
    JFrame fr = new JFrame();

    public LoginUIQLNoSql() {
        initComponents();
        setLocationRelativeTo(this);
//        lbForgotPassWord.setVisible(false);
    }

    public boolean validateForm() {
        if (txtUsername.getText().isEmpty()) {
            txtUsername.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Tài khoản không được để trống!");
            txtUsername.requestFocus();
            return false;
        } else {
            txtUsername.setBackground(Color.WHITE);
        }

        if (txtPassword.getText().isEmpty()) {
            txtPassword.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống!");
            txtPassword.requestFocus();
            return false;
        } else {
            txtPassword.setBackground(Color.WHITE);
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnFLogin = new javax.swing.JPanel();
        lblDangNhap = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbForgotPassWord = new javax.swing.JLabel();
        btnCancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setResizable(false);

        jpnFLogin.setBackground(new java.awt.Color(0, 153, 153));
        jpnFLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 3, true));

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangNhap.setText("ĐĂNG NHẬP HỆ THỐNG");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("Username");
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Password");
        txtPassword.setPreferredSize(new java.awt.Dimension(78, 26));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setPreferredSize(new java.awt.Dimension(75, 30));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Thoát");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setMaximumSize(new java.awt.Dimension(100, 24));
        btnCancel.setMinimumSize(new java.awt.Dimension(100, 24));
        btnCancel.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lbForgotPassWord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbForgotPassWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbForgotPassWord.setText("Quên mật khẩu?");
        lbForgotPassWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbForgotPassWord.setDisplayedMnemonicIndex(1);
        lbForgotPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgotPassWordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbForgotPassWordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbForgotPassWordMouseExited(evt);
            }
        });

        btnCancel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel1.setText("Đăng Ký");
        btnCancel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel1.setMaximumSize(new java.awt.Dimension(100, 24));
        btnCancel1.setMinimumSize(new java.awt.Dimension(100, 24));
        btnCancel1.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFLoginLayout = new javax.swing.GroupLayout(jpnFLogin);
        jpnFLogin.setLayout(jpnFLoginLayout);
        jpnFLoginLayout.setHorizontalGroup(
            jpnFLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnFLoginLayout.createSequentialGroup()
                .addGroup(jpnFLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnFLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpnFLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnFLoginLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lbForgotPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnFLoginLayout.setVerticalGroup(
            jpnFLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbForgotPassWord)
                .addGap(18, 18, 18)
                .addGroup(jpnFLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Trường THPT Trần Hưng Đạo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Sứ Mệnh Là Mang Đến Tri Thức Cho Học Sinh !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(283, 283, 283))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnFLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equalsIgnoreCase("Username")) {
            txtUsername.setText(null);
            txtUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().equalsIgnoreCase("")) {
            txtUsername.setText("Username");
            txtUsername.setForeground(new Color(105, 105, 105));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equalsIgnoreCase("Password")) {
            txtPassword.setText(null);
            txtPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().equalsIgnoreCase("")) {
            txtPassword.setText("Password");
            txtPassword.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (validateForm()) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();

            if (usDAO.checkLogin(username, password)) {
                this.dispose();
                nameAdmin = "AD: " + txtUsername.getText();
                LibSystem main = new LibSystem();
                main.setVisible(true);
                System.out.println("tenad" + nameAdmin);
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra lại tên tài khoản hoặc mật khẩu", "Error", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btnLoginActionPerformed
    }


    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (validateForm()) {
//                String username = txtUsername.getText();
//                String pass = new String(txtPassword.getPassword());
//                
//                UserDAO us = new UserDAO();
//                if (us.checkLogin(username, pass) ) {
//                    MainJForm main = new MainJForm();
//                    main.setVisible(true);
//                    this.dispose();
//                } else if (us.checkLogin(username, pass) ) {
//                    MainJFormUser mainUser = new MainJFormUser();
//                    mainUser.setVisible(true);
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Sai tên đăng nhập/mật khẩu hoặc vai trò!");
//                }
//            }
//        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (validateForm()) {
//                String username = txtUsername.getText();
//                String pass = new String(txtPassword.getPassword());
//                
//                UserDAO us = new UserDAO();
//                if (us.checkLogin(username, pass) ) {
//                    libSysForm main = new libSysForm();
//                    main.setVisible(true);
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Sai tên đăng nhập/mật khẩu hoặc vai trò!");
//                }
//            }
//        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void lbForgotPassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotPassWordMouseClicked
           JPanel jp = new quenMkUi();
        fr.add(jp);
        fr.setSize(900, 600);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

//        String a="a";
//        JPasswordField passwordField = new JPasswordField();
//        int option = JOptionPane.showConfirmDialog(null, passwordField, "Nhập mật khẩu quản lý cấp:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
//        if (option == JOptionPane.OK_OPTION){
////            char[] password = passwordField.getPassword();
//            String input = passwordField.getText();
//            if(input.equalsIgnoreCase(a)){
//            
//        ForgotPass fg = new ForgotPass(this, true);
//        fg.setVisible(true);
//            
//            }
////            System.out.println("Mật khẩu là: " + input);
//        } else {
//            System.out.println("Người dùng đã hủy");
//        }

    }//GEN-LAST:event_lbForgotPassWordMouseClicked

    private void lbForgotPassWordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotPassWordMouseEntered
        // TODO add your handling code here:
        lbForgotPassWord.setForeground(Color.red);
    }//GEN-LAST:event_lbForgotPassWordMouseEntered

    private void lbForgotPassWordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotPassWordMouseExited
        // TODO add your handling code here:
        lbForgotPassWord.setForeground(Color.black);
    }//GEN-LAST:event_lbForgotPassWordMouseExited

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancel1ActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibSystemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibSystemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibSystemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibSystemND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUIQLNoSql().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnFLogin;
    private javax.swing.JLabel lbForgotPassWord;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
