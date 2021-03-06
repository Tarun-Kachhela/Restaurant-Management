package UIDesign;

import java.util.Vector;
import Database.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import networking.Server;

/**
 *
 * @author Tarun
 */
public class OrderDetails extends javax.swing.JPanel {

        Vector v = null;
        ItemsDatabase itemsDatabase = null;
        CategoryDatabase categoryDatabase = null;
        Notification notification = null;
        OrderDatabase orderDatabase = null;

        /**
         * Creates new form OrderDetails
         */
        Server server;

        public OrderDetails(ItemsDatabase itemsDatabase, CategoryDatabase categoryDatabase, Notification notification, Server server, OrderDatabase orderDatabase) {
                initComponents();
                this.itemsDatabase = itemsDatabase;
                this.categoryDatabase = categoryDatabase;
                this.notification = notification;
                this.orderDatabase = orderDatabase;
                this.server = server;
                setSize(1001, 507);
                addItemsInJList();
                addCategoryToJCBCategory();
                txtRate.setEditable(false);
                server.sendTableToChef(notification.getTblPendingOrder());
        }

        /**
         * The below method will add the items in the jList because when we are
         * adding the item in database so the data has to be update in
         * application.
         *
         * @param:Nothing
         * @return:Nothing
         *
         */
        public void addItemsInJList() {
                try {
                        v = itemsDatabase.getAllItems((String) JCBCategory.getSelectedItem());
                } catch (Exception e) {
                }
                jList1.removeAll();
                jList1.setListData(v);
//        DefaultListModel model = new DefaultListModel();
//        for (int i = 0; i < v.size(); i++) {
//            model.addElement(v.elementAt(i));
//        }
//         jList1.setModel(model);
//        for (int i = 0; i < v.size(); i++) {
//              jList1.setName((String)v.elementAt(i));
//        }        
        }

        /**
         * The below method will add the Category in the JComboBox because when
         * we are adding the item in database so the data has to be update in
         * application.
         *
         * @param:Nothing
         * @return:Nothing
         *
         */
        public void addCategoryToJCBCategory() {
                Vector v = categoryDatabase.getAllCategories();
                JCBCategory.removeAllItems();
                for (int i = 0; i < v.size(); i++) {
                        JCBCategory.addItem(v.elementAt(i));
                }
        }

        //getter
        public JTextField getTableNo() {
                return txtTableNo;
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOrderDetails = new javax.swing.JPanel();
        lblTableNo = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        JCBCategory = new javax.swing.JComboBox();
        txtTableNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnSend = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JSpinner();
        lblRate = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();

        pnlOrderDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrderDetails.setEnabled(false);
        pnlOrderDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTableNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTableNo.setText("Table No.");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategory.setText("Category");

        JCBCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCategoryActionPerformed(evt);
            }
        });

        txtTableNo.setEditable(false);
        txtTableNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiter (1) (1).png"))); // NOI18N

        lblItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblItem.setText("Items");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btnSend.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity");

        txtQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        txtQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantityStateChanged(evt);
            }
        });

        lblRate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRate.setText("Rate");

        txtRate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrderDetailsLayout = new javax.swing.GroupLayout(pnlOrderDetails);
        pnlOrderDetails.setLayout(pnlOrderDetailsLayout);
        pnlOrderDetailsLayout.setHorizontalGroup(
            pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                                .addComponent(lblTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                                .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JCBCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQuantity)
                                    .addComponent(txtRate)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnSend)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        pnlOrderDetailsLayout.setVerticalGroup(
            pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem))
                        .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnSend)
                        .addGap(21, 21, 21))
                    .addGroup(pnlOrderDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JCBCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCategoryActionPerformed
            addItemsInJList();
            txtRate.setText("");
    }//GEN-LAST:event_JCBCategoryActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
            //        Collection  l=jList1.getSelectedValuesList();
            //     items.addAll(l);
            updateRate();

    }//GEN-LAST:event_jList1MouseClicked
        /**
         * The below method will send the data to server & showing the which is
         * ready or not ready in our application& also add the data to database
         *
         * @param:ActionEvent
         * @return:Nothing
         *
         */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
            if ((!txtTableNo.getText().equals("")) && jList1.getSelectedIndex() != -1) {
                    orderDatabase.insert(txtTableNo.getText(), (String) jList1.getSelectedValue(), (int) txtQuantity.getValue());
                    CustomJTable.insertInJtable(notification.getTblPendingOrder(), "orderitem", "not ready");
                    CustomJTable.insertInJtable(notification.getTblReadyOrder(), "orderitem", "ready");
                    if (server.sendTableToChef(notification.getTblPendingOrder())) 
                            JOptionPane.showMessageDialog(null, "order is placed at  " + txtTableNo.getText() + ", Waiting for ready the order", "AddOrder", JOptionPane.INFORMATION_MESSAGE);
            } else 
                    JOptionPane.showMessageDialog(null, "please fill all the details ", "AddOrder", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantityStateChanged
            updateRate();
    }//GEN-LAST:event_txtQuantityStateChanged

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtRateActionPerformed
        //this is use for update the rate
       private void updateRate() {
                try {
                        txtRate.setText("" + itemsDatabase.getPrice((String) jList1.getSelectedValue()) * ((int) txtQuantity.getValue()));
                        } catch (Exception e) {
                }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCBCategory;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblTableNo;
    private javax.swing.JPanel pnlOrderDetails;
    private javax.swing.JSpinner txtQuantity;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtTableNo;
    // End of variables declaration//GEN-END:variables
}
