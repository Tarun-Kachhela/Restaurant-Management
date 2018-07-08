package UIDesign;

import Database.*;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Tarun
 */
public class Notification extends javax.swing.JPanel {

        CustomJTable customJTable = null;

        /**
         * Creates new form Notification
         */
        public Notification(CustomJTable customJTable) {
                initComponents();
                setSize(1001, 507);
                this.customJTable = customJTable;
                customJTable.insertInJtable(tblPendingOrder, "orderitem", "not ready");
                customJTable.insertInJtable(tblReadyOrder, "orderitem", "ready");
//       this.customJTable.insertInJtable(jTable1, "orderitem");
//        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//        model.setRowCount(0);
        }
        //getter
        public JPanel getPnlReadyOrder() {
                return pnlReadyOrder;
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPendingOrder = new javax.swing.JTable();
        pnlReadyOrder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReadyOrder = new javax.swing.JTable();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblPendingOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblPendingOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPendingOrder.setRowHeight(30);
        jScrollPane1.setViewportView(tblPendingOrder);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 996, 400);

        jTabbedPane1.addTab("Pending Order", jPanel1);

        pnlReadyOrder.setBackground(new java.awt.Color(255, 255, 255));
        pnlReadyOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        pnlReadyOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblReadyOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblReadyOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblReadyOrder.setRowHeight(30);
        jScrollPane2.setViewportView(tblReadyOrder);

        javax.swing.GroupLayout pnlReadyOrderLayout = new javax.swing.GroupLayout(pnlReadyOrder);
        pnlReadyOrder.setLayout(pnlReadyOrderLayout);
        pnlReadyOrderLayout.setHorizontalGroup(
            pnlReadyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        pnlReadyOrderLayout.setVerticalGroup(
            pnlReadyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ready orders", pnlReadyOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents
        //getters 
        public JTable getTblPendingOrder() {
                return tblPendingOrder;
        }

        public JTable getTblReadyOrder() {
                return tblReadyOrder;
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlReadyOrder;
    private javax.swing.JTable tblPendingOrder;
    private javax.swing.JTable tblReadyOrder;
    // End of variables declaration//GEN-END:variables
}