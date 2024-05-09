package view;

import view.salesPersonProfileScreen;
import classes.salesOrder;
import classes.salesPerson;
import classes.staticMethod;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class salesScreen extends javax.swing.JFrame {

    private String userId, salesOrderId, price;

    public salesScreen(String userId) {
        this.userId = userId;
        initComponents();
        txtID.setText(userId);
        List<salesOrder> controller = salesOrder.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) salesOrderTable.getModel();
        // Get data and display in table
        pulldata(controller, tblModel);
        txtSearchId.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesOrderTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearchId = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JToggleButton();
        btnManageProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Welcome Sales Person");

        salesOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SOID", "createdDate", "Furniture ", "type", "url", "rate", "delivery", "sale", "price", "quantity", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        salesOrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesOrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salesOrderTable);
        if (salesOrderTable.getColumnModel().getColumnCount() > 0) {
            salesOrderTable.getColumnModel().getColumn(3).setResizable(false);
            salesOrderTable.getColumnModel().getColumn(8).setResizable(false);
        }

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("SOID :");

        txtSearchId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtID.setText("JLabel");

        btnSave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Quantity : ");

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnView.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnView.setText("View product");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnManageProfile.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnManageProfile.setText("Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtQuantity)
                                    .addComponent(txtSearchId, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogOut)
                            .addComponent(btnView)
                            .addComponent(btnManageProfile))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnSave))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pulldata(List<salesOrder> controller, DefaultTableModel tblModel) {
        for (salesOrder order : controller) {
            Object[] rowData = {
                order.salesOrderId,
                order.dateTime,
                order.furniture,
                order.type,
                order.url,
                order.rate,
                order.delivery,
                order.sale,
                order.price,
                order.quantity,
                order.approveStatus
            };
            tblModel.addRow(rowData);
        }
    }

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        loginScreen go = new loginScreen();
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String getQuantity = txtQuantity.getText();
        String checkEmpty = staticMethod.emptyValidation(getQuantity);

        if ("Pass".equals(checkEmpty)) {
            String validateQuantity = staticMethod.userProfileValidation(7, getQuantity);
            if ("Success".equals(validateQuantity)) {
                double quantity = Double.parseDouble(getQuantity);
                double price = Double.parseDouble(this.price);
                double newPrice = quantity * price;
                String newStringPrice = String.valueOf(newPrice);
                String date = staticMethod.getLocalCurrentDateTime();
                salesOrder object = new salesOrder(this.salesOrderId, date, "", "", "", "", "", "", newStringPrice, getQuantity, "");
                salesPerson edit = new salesPerson(userId);
                String result = edit.editSalesOrder(object);
                if ("Success".equals(result)) {
                    JOptionPane.showInternalMessageDialog(null, "Changes saved", "Success", JOptionPane.INFORMATION_MESSAGE);
                    List<salesOrder> controller = salesOrder.retrieveData();
                    DefaultTableModel tblModel = (DefaultTableModel) salesOrderTable.getModel();
                    tblModel.setRowCount(0);
                    pulldata(controller, tblModel);
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String getOrderId = txtSearchId.getText();
        salesPerson delete = new salesPerson(userId);
        salesOrder object = new salesOrder(getOrderId);

        delete.removeSalesOrder(object);
        JOptionPane.showInternalMessageDialog(null, "Changes saved", "Success", JOptionPane.INFORMATION_MESSAGE);
        List<salesOrder> controller = salesOrder.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) salesOrderTable.getModel();
        tblModel.setRowCount(0);
        pulldata(controller, tblModel);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        furnitureProductScreen go = new furnitureProductScreen(userId);
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String productId = txtSearchId.getText();
        String[] parts = productId.split("_");
        if (parts[0].trim().matches("SIOD")) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) salesOrderTable.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(productId, 0));
            salesOrderTable.setRowSorter(sorter);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
        salesPersonProfileScreen go = new salesPersonProfileScreen(userId,"1");
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void salesOrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesOrderTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) salesOrderTable.getModel();
        int selectedRow = salesOrderTable.getSelectedRow();
        salesOrderId = tblModel.getValueAt(selectedRow, 0).toString();
        price = tblModel.getValueAt(selectedRow, 8).toString();
        String getQuantity = tblModel.getValueAt(selectedRow, 9).toString();
        txtQuantity.setText(getQuantity);
        txtSearchId.setText(salesOrderId);
    }//GEN-LAST:event_salesOrderTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnSave;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salesOrderTable;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchId;
    // End of variables declaration//GEN-END:variables
}
