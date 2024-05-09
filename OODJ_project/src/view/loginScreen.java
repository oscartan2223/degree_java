package view;

import classes.administrator;
import classes.officer;
import classes.salesPerson;
import classes.staticMethod;
import javax.swing.JOptionPane;

public class loginScreen extends javax.swing.JFrame {

    public loginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassword = new javax.swing.JPasswordField();
        btnForgotPassword = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPassword.setText("x1crT$cB");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnForgotPassword.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnForgotPassword.setText("forgot password");
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Please enter your ID  : ");

        txtUserId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtUserId.setText("OID_1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Please enter your password : ");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin)
                    .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnForgotPassword))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
                    .addComponent(txtUserId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
        String inputID = JOptionPane.showInputDialog(this, "Enter your account ID: ");
        if (inputID != null) {
            String inputEmail = JOptionPane.showInputDialog(this, "Enter your account email to receive OTP code : ");

            if (inputEmail != null) {
                // Check empty input
                String checkEmptyInputID = staticMethod.emptyValidation(inputID);
                String checkEmptyEmail = staticMethod.emptyValidation(inputEmail);
                if ("Pass".equals(checkEmptyEmail) && "Pass".equals(checkEmptyInputID)) {
                    // Validate email
                    String validateEmail = staticMethod.userProfileValidation(3, inputEmail);
                    if ("Success".equals(validateEmail)) {

                        String otpCode = staticMethod.forgotPassword("yoyofurniture3@gmail.com", "afvsjyzudbokdutk", inputEmail);
                        String otpInput = JOptionPane.showInputDialog(this, "Please enter the OTP code : ");

                        String checkEmptyOtp = staticMethod.emptyValidation(otpCode);

                        String otpResult = staticMethod.verifyOTP(otpInput, otpCode);
                        if ("Pass".equals(otpResult)) {
                            // Redirect to change password page
                            resetPasswordScreen go = new resetPasswordScreen(inputID, inputEmail);
                            this.setVisible(false);
                            go.setVisible(true);

                            System.out.println("OTP code verification success");
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid otp code, please try again", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid email format, please try again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter your account email", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }


    }//GEN-LAST:event_btnForgotPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        // Get inputs from user
        String userId = txtUserId.getText();
        String password = String.valueOf(txtPassword.getPassword());
        // Check empty field
        String checkEmptyId = staticMethod.emptyValidation(userId);
        String checkEmptyPassword = staticMethod.emptyValidation(password);

        // Implementation
        if ("Pass".equals(checkEmptyId) && "Pass".equals(checkEmptyPassword)) {
            String checkUserId = staticMethod.userProfileValidation(1, userId);
            String checkPassword = staticMethod.userProfileValidation(2, password);
            if ("Success".equals(checkUserId) && "Success".equals(checkPassword)) {
                // check which user log in
                String[] split = userId.split("_");
                if ("AID".equals(split[0])) {
                    administrator loginObj = new administrator(userId, password);
                    String loginResult = loginObj.verifyLogin();
                    if ("Success".equals(loginResult)) {
                        workerProfileScreen go = new workerProfileScreen(userId);
                        go.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong user Id or password. Pls try again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if ("SID".equals(split[0])) {
                    salesPerson loginObj = new salesPerson(userId, password);
                    String loginResult = loginObj.verifyLogin();
                    if ("Success".equals(loginResult)) {
                        salesScreen go = new salesScreen(userId);
                        go.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong user Id or password. Pls try again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if ("OID".equals(split[0])) {
                    officer loginObj = new officer(userId, password);
                    String loginResult = loginObj.verifyLogin();
                    if ("Success".equals(loginResult)) {
                        // Redirect to officer main page
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong user Id or password. Pls try again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            System.out.println("Error2");
        }

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
