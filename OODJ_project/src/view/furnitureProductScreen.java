package view;

import classes.product;
import classes.salesOrder;
import classes.salesPerson;
import classes.staticMethod;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class furnitureProductScreen extends javax.swing.JFrame {

    // Attributes
    private String userId;

    public furnitureProductScreen(String userId) {
        this.userId = userId;
        initComponents();
        List<product> controller = product.retrieveData();
        DefaultTableModel tblModel = (DefaultTableModel) productDetailTable.getModel();

        for (product item : controller) {
            Object[] rowData = {
                item.furnitureId,
                item.furnitureName,
                item.type,
                item.url,
                item.rate,
                item.delivery,
                item.sale,
                item.price,};
            tblModel.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productDetailTable = new javax.swing.JTable();
        txtProductId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        productDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Furniture Name", "Type", "Url", "Rate", "delivery", "sale", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDetailTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productDetailTable);
        if (productDetailTable.getColumnModel().getColumnCount() > 0) {
            productDetailTable.getColumnModel().getColumn(0).setResizable(false);
            productDetailTable.getColumnModel().getColumn(0).setHeaderValue("Product Id");
            productDetailTable.getColumnModel().getColumn(1).setHeaderValue("Furniture Name");
            productDetailTable.getColumnModel().getColumn(2).setHeaderValue("Type");
            productDetailTable.getColumnModel().getColumn(3).setHeaderValue("Url");
            productDetailTable.getColumnModel().getColumn(4).setHeaderValue("Rate");
            productDetailTable.getColumnModel().getColumn(5).setHeaderValue("delivery");
            productDetailTable.getColumnModel().getColumn(6).setHeaderValue("sale");
            productDetailTable.getColumnModel().getColumn(7).setResizable(false);
            productDetailTable.getColumnModel().getColumn(7).setHeaderValue("Price");
        }

        txtProductId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Product Id :");

        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnSearch)
                        .addGap(0, 340, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDetailTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) productDetailTable.getModel();
        int selectedRow = productDetailTable.getSelectedRow();

        String quantity = JOptionPane.showInputDialog(this, "Enter the quantity of the product :");
        String checkEmpty = staticMethod.emptyValidation(quantity);
        if ("Pass".equals(checkEmpty)) {
            String validateQuantity = staticMethod.userProfileValidation(7, quantity);
            if ("Success".equals(validateQuantity)) {
                int result = JOptionPane.showConfirmDialog(null, "Add to sale order?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    String orderName = tblModel.getValueAt(selectedRow, 1).toString();
                    String createdDate = staticMethod.getLocalCurrentDateTime();
                    String orderType = tblModel.getValueAt(selectedRow, 2).toString();
                    String orderUrl = tblModel.getValueAt(selectedRow, 3).toString();
                    String orderRate = tblModel.getValueAt(selectedRow, 4).toString();
                    String orderDelivery = tblModel.getValueAt(selectedRow, 5).toString();
                    String orderSale = tblModel.getValueAt(selectedRow, 6).toString();
                    String orderPrice = tblModel.getValueAt(selectedRow, 7).toString();

                    salesOrder order = new salesOrder("", createdDate, orderName, orderType, orderUrl, orderRate, orderDelivery, orderSale, orderPrice, quantity, "0");
                    salesPerson addOrder = new salesPerson(userId);
                    addOrder.addSalesOrder(order);
                }
            } 
        }


    }//GEN-LAST:event_productDetailTableMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        salesScreen go = new salesScreen(userId);
        go.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String productId = txtProductId.getText();
        String[] parts = productId.split("_");
        if (parts[0].trim().matches("PID")) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) productDetailTable.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(productId, 0));
            productDetailTable.setRowSorter(sorter);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productDetailTable;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables
}
