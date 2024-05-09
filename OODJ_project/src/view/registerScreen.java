package view;

import view.loginScreen;
import classes.administrator;
import classes.staticMethod;
import javax.swing.JOptionPane;

public class registerScreen extends javax.swing.JFrame {

    private String userId;

    public registerScreen(String userId, String condition) {
        
        this.userId = userId;
        initComponents();
        
        if(condition == "show"){
            backBtn.setVisible(true);
        } else {
            backBtn.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpButton = new javax.swing.ButtonGroup();
        grpButton2 = new javax.swing.ButtonGroup();
        txtContact = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radFemale = new javax.swing.JRadioButton();
        btnLogIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radSalesPerson = new javax.swing.JRadioButton();
        radOfficer = new javax.swing.JRadioButton();
        radAdmin = new javax.swing.JRadioButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtContact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Yoyo furniture");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Please select your gender : ");

        grpButton.add(radMale);
        radMale.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radMale.setText("Male");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Please enter your  password :");

        grpButton.add(radFemale);
        radFemale.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radFemale.setText("Female");

        btnLogIn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLogIn.setText("Log in");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Please enter your  name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Please reenter password : ");

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtPassword.setText("jPasswordField1");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Please enter your email : ");

        txtConfirmPassword.setText("jPasswordField1");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Please enter your contact : ");

        grpButton2.add(radSalesPerson);
        radSalesPerson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radSalesPerson.setText("Sales Person");
        radSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSalesPersonActionPerformed(evt);
            }
        });

        grpButton2.add(radOfficer);
        radOfficer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radOfficer.setText("Officer");
        radOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOfficerActionPerformed(evt);
            }
        });

        grpButton2.add(radAdmin);
        radAdmin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radAdmin.setText("Administrator");
        radAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAdminActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(radAdmin)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radFemale)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radSalesPerson)
                    .addComponent(radOfficer)
                    .addComponent(radAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radMale)
                            .addComponent(radFemale)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(btnLogIn))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        loginScreen go = new loginScreen();
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String confirmPassword = String.valueOf(txtConfirmPassword.getPassword());
        String email = txtEmail.getText();
        String contact = txtContact.getText();
        String gender = null;
        if (radMale.isSelected()) {
            gender = radMale.getText();
        } else if (radFemale.isSelected()) {
            gender = radFemale.getText();
        }

        String checkEmptyName = staticMethod.emptyValidation(username);
        String checkEmptyPassword = staticMethod.emptyValidation(password);
        String checkEmptyConfirmPassword = staticMethod.emptyValidation(confirmPassword);
        String checkEmptyEmail = staticMethod.emptyValidation(email);
        String checkEmptyContact = staticMethod.emptyValidation(contact);

        // To determine whether register for officer or salesPerson
        String registrationType = null;
        String autoPassword = "on";
        if (radSalesPerson.isSelected()) {
            registrationType = radSalesPerson.getText();
        } else if (radOfficer.isSelected()) {
            registrationType = radOfficer.getText();
        } else if (radAdmin.isSelected()) {
            registrationType = radAdmin.getText();
            autoPassword = "off";
        }

        // Perform validation checking for each input field 
        String validatePassword = staticMethod.userProfileValidation(2, password);
        String doubleCheckPassword = staticMethod.passwordConfirm(password, confirmPassword);
        String validateEmail = staticMethod.userProfileValidation(3, email);
        String validateContact = staticMethod.userProfileValidation(4, contact);

        if (autoPassword.equals("off")) {
            if ("Pass".equals(checkEmptyName) && "Pass".equals(checkEmptyPassword) && "Pass".equals(checkEmptyConfirmPassword) && "Pass".equals(checkEmptyEmail) && "Pass".equals(checkEmptyContact) && grpButton.getSelection() != null && grpButton2.getSelection() != null) {
                if ("Pass".equals(doubleCheckPassword)) {
                    if ("Success".equals(validatePassword) && "Success".equals(validateEmail) && "Success".equals(validateContact)) {
                        if ("Administrator".equals(registrationType)) {
                            // Store into admin text file
                            administrator object = new administrator("", username, password, email, gender, contact, "1", "default_pic.png");
                            String result = object.registration(3);
                        }
                    }
                }
            }
        } else {
            if ("Pass".equals(checkEmptyName) && "Pass".equals(checkEmptyEmail) && "Pass".equals(checkEmptyContact) && grpButton.getSelection() != null && grpButton2.getSelection() != null) {
                String randomPassword = staticMethod.randomPasswordGenerator();
                if ("Sales Person".equals(registrationType)) {
                    // Store into Sales Person text file
                    administrator object = new administrator("", username, randomPassword, email, gender, contact, "1", "default_pic.png");
                    String result = object.registration(1);
                    if ("Success".equals(result)) {
                        staticMethod.notifyUser(1, "yoyofurniture3@gmail.com", "afvsjyzudbokdutk", email, randomPassword);
                        JOptionPane.showMessageDialog(null, "New users added successfully !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if ("Officer".equals(registrationType)) {
                    // Store into officer text file
                    administrator object = new administrator("", username, randomPassword, email, gender, contact, "1", "default_pic.png");
                    String result = object.registration(2);
                    if ("Success".equals(result)) {
                        staticMethod.notifyUser(2, "yoyofurniture3@gmail.com", "afvsjyzudbokdutk", email, randomPassword);
                        JOptionPane.showMessageDialog(null, "New users added successfully !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // Redirect back to own screen
        workerProfileScreen go = new workerProfileScreen(userId);
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void radSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSalesPersonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Reminder, password is not needed as system will random generate", "Success", JOptionPane.INFORMATION_MESSAGE);
        txtPassword.setEditable(false);
        txtConfirmPassword.setEditable(false);
    }//GEN-LAST:event_radSalesPersonActionPerformed

    private void radOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOfficerActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Reminder, password is not needed as system will random generate", "Success", JOptionPane.INFORMATION_MESSAGE);
        txtPassword.setEditable(false);
        txtConfirmPassword.setEditable(false);
    }//GEN-LAST:event_radOfficerActionPerformed

    private void radAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAdminActionPerformed
        // TODO add your handling code here:
        txtPassword.setEditable(true);
        txtConfirmPassword.setEditable(true);
    }//GEN-LAST:event_radAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup grpButton;
    private javax.swing.ButtonGroup grpButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radAdmin;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JRadioButton radOfficer;
    private javax.swing.JRadioButton radSalesPerson;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
