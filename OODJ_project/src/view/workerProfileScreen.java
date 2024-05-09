package view;

import classes.officer;
import classes.salesPerson;
import classes.staticMethod;
import java.awt.Component;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class workerProfileScreen extends javax.swing.JFrame {

    // Attributes 
    private String userId;

    public workerProfileScreen(String userId) {
        this.userId = userId;
        initComponents();
        profileTable.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
        profileTable.setRowHeight(100);
        
        List<salesPerson> controller = salesPerson.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) profileTable.getModel();
        // Pull sale person initially
        pullSalesPerson(controller, tblModel);
        radSalesPerson.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpButton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        profileTable = new javax.swing.JTable();
        radSalesPerson = new javax.swing.JRadioButton();
        radOfficer = new javax.swing.JRadioButton();
        txtSearchId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Yoyo furniture ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBack.setText("Log out");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        profileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Id", "User name", "User email", "User gender", "User contact", "User status", "User Profile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        profileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(profileTable);

        grpButton.add(radSalesPerson);
        radSalesPerson.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radSalesPerson.setText("Sales Person");
        radSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSalesPersonActionPerformed(evt);
            }
        });

        grpButton.add(radOfficer);
        radOfficer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        radOfficer.setText("Officer");
        radOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOfficerActionPerformed(evt);
            }
        });

        txtSearchId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Search id : ");

        btnSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnReport.setText("View report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReport)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnSearch)
                        .addGap(124, 124, 124)
                        .addComponent(radSalesPerson)
                        .addGap(18, 18, 18)
                        .addComponent(radOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch)
                    .addComponent(radSalesPerson)
                    .addComponent(radOfficer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static class ImageRenderer extends DefaultTableCellRenderer {
        
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        
        if (value instanceof ImageIcon) {
            ImageIcon originalIcon = (ImageIcon) value;

            // Get the original image from the ImageIcon
            Image originalImage = originalIcon.getImage();

            // Calculate the scaling factor for resizing
            double scaleFactor = (double) table.getRowHeight() / originalImage.getHeight(null);

            // Calculate the new width based on the scaling factor
            int newWidth = (int) (originalImage.getWidth(null) * scaleFactor);

            // Resize the original image
            Image resizedImage = originalImage.getScaledInstance(newWidth, table.getRowHeight(), Image.SCALE_SMOOTH);

            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            label.setIcon(resizedIcon);
        }

        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
    }

    
    
    
    private void pullSalesPerson(List<salesPerson> salesPerson, DefaultTableModel tblModel) {
        String getLocalDirectory = System.getProperty("user.dir");
        String destinationFolder = getLocalDirectory + "\\src\\images\\";
        for (salesPerson item : salesPerson) {
            Object[] rowData = {
                item.getUserId(),
                item.getName(),
                item.getEmail(),
                item.getGender(),
                item.getContact(),
                item.getStatus(),
                new ImageIcon(destinationFolder + item.getProfileImage())
            };
            tblModel.addRow(rowData);
        }
    }

    private void pullOfficer(List<officer> officer, DefaultTableModel tblModel) {
        String getLocalDirectory = System.getProperty("user.dir");
        String destinationFolder = getLocalDirectory + "\\src\\images\\";
        for (officer item : officer) {
            Object[] rowData = {
                item.getUserId(),
                item.getName(),
                item.getEmail(),
                item.getGender(),
                item.getContact(),
                item.getStatus(),
                new ImageIcon(destinationFolder + item.getProfileImage())
            };
            tblModel.addRow(rowData);
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        loginScreen go = new loginScreen();
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        registerScreen go = new registerScreen(userId, "show");
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void profileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) profileTable.getModel();
        int selectedRow = profileTable.getSelectedRow();

        int result = JOptionPane.showConfirmDialog(null, "View?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            String getId = tblModel.getValueAt(selectedRow, 0).toString();

            if (radSalesPerson.isSelected()) {
                salesPersonProfileScreen go = new salesPersonProfileScreen(getId, "2");
                go.setVisible(true);
                this.setVisible(false);
            } else if (radOfficer.isSelected()) {
//                officerProfileScreen go = new officerProfileScreen(getId);
//                go.setVisible(true);
//                this.setVisible(false);
            }
        }

    }//GEN-LAST:event_profileTableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String userId = txtSearchId.getText();
        String checkEmpty = staticMethod.emptyValidation(userId);
        if ("Pass".equals(checkEmpty)) {
            String validateId = staticMethod.userProfileValidation(1, userId);
            if ("Success".equals(validateId)) {
                String[] parts = userId.split("_");
                if (radSalesPerson.isSelected()) {
                    if (parts[0].trim().matches("SID")) {
                        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) profileTable.getModel()));
                        sorter.setRowFilter(RowFilter.regexFilter(userId, 0));
                        profileTable.setRowSorter(sorter);
                    }
                } else if (radOfficer.isSelected()) {
                    if (parts[0].trim().matches("OID")) {
                        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) profileTable.getModel()));
                        sorter.setRowFilter(RowFilter.regexFilter(userId, 0));
                        profileTable.setRowSorter(sorter);
                    }
                }
            } else{
                System.out.println("Hola");
            }
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void radSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSalesPersonActionPerformed
        List<salesPerson> controller = salesPerson.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) profileTable.getModel();
        tblModel.setRowCount(0);
        pullSalesPerson(controller, tblModel);
    }//GEN-LAST:event_radSalesPersonActionPerformed

    private void radOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOfficerActionPerformed
        List<officer> controller = officer.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) profileTable.getModel();
        tblModel.setRowCount(0);
        pullOfficer(controller, tblModel);
    }//GEN-LAST:event_radOfficerActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        adminProfileScreen go = new adminProfileScreen(userId);
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup grpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable profileTable;
    private javax.swing.JRadioButton radOfficer;
    private javax.swing.JRadioButton radSalesPerson;
    private javax.swing.JTextField txtSearchId;
    // End of variables declaration//GEN-END:variables
}
