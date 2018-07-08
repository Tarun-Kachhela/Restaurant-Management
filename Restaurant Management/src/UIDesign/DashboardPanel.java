package UIDesign;

/**
 *
 * @author Tarun
 */
public class DashboardPanel extends javax.swing.JPanel {

        /**
         * Creates new form DashboardPanel
         */
        Dashboard dashboard;

        /**
         * ************************CONSTRUCTOR*****************************
         */
        public DashboardPanel(Dashboard dashboard) {
                initComponents();
                this.setSize(1048, 595);
                this.dashboard = dashboard;
                setAllValues();
        }

        /**
         * The below method set the value in the DashBoardPanle & value like
         * TurnOver,How many items
         *
         * @param:Nothing
         * @return:Nothing
         *
         */
        public void setAllValues() {
                lblCategoryValue.setText(String.valueOf(dashboard.categoryDatabase.getCategoryCount()));
                lblReadyOrdersValue.setText(String.valueOf(dashboard.orderDatabase.getReadyOrder()));
                lblTurnOverValue.setText(String.valueOf(dashboard.itemsDatabase.getTurnOver()));
                lblItemsValue.setText(String.valueOf(dashboard.itemsDatabase.getAllItems()));
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblUpperDashboard = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTurnOverValue1 = new javax.swing.JLabel();
        lblTurnOver = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTurnOverValue = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCategoryValue1 = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCategoryValue = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTurnOverValue2 = new javax.swing.JLabel();
        lblReadyOrders = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblReadyOrdersValue = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblItemsValue1 = new javax.swing.JLabel();
        lblItems = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblItemsValue = new javax.swing.JLabel();
        lblTurnOver1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblUpperDashboard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblUpperDashboard.setText("Dashboard");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTurnOverValue1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTurnOverValue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        jPanel1.add(lblTurnOverValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 120));

        lblTurnOver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTurnOver.setText("Turn over");
        jPanel1.add(lblTurnOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 82, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green.png"))); // NOI18N
        jLabel5.setAutoscrolls(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 142));

        lblTurnOverValue.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTurnOverValue.setText("0");
        jPanel1.add(lblTurnOverValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 34, 60, 50));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoryValue1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblCategoryValue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catalogue (1).png"))); // NOI18N
        jPanel4.add(lblCategoryValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCategory.setText("Category");
        jPanel4.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 91, 109, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 172, -1));

        lblCategoryValue.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblCategoryValue.setText("0");
        jPanel4.add(lblCategoryValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 36, 34, 37));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTurnOverValue2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTurnOverValue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_1.png"))); // NOI18N
        jPanel3.add(lblTurnOverValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 140));

        lblReadyOrders.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblReadyOrders.setText("Ready Orders");
        jPanel3.add(lblReadyOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 84, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 191, 141));

        lblReadyOrdersValue.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblReadyOrdersValue.setText("0");
        jPanel3.add(lblReadyOrdersValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 25, 34, 37));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblItemsValue1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblItemsValue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        jPanel2.add(lblItemsValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 150));

        lblItems.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItems.setText("Items");
        jPanel2.add(lblItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 88, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue.png"))); // NOI18N
        jLabel8.setText("Items");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 179, -1));

        lblItemsValue.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblItemsValue.setText("0");
        jPanel2.add(lblItemsValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 22, 28, -1));

        lblTurnOver1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTurnOver1.setText("Welcome to the Tarun's Restaurant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTurnOver1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblUpperDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpperDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTurnOver1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCategoryValue;
    private javax.swing.JLabel lblCategoryValue1;
    private javax.swing.JLabel lblItems;
    private javax.swing.JLabel lblItemsValue;
    private javax.swing.JLabel lblItemsValue1;
    private javax.swing.JLabel lblReadyOrders;
    private javax.swing.JLabel lblReadyOrdersValue;
    private javax.swing.JLabel lblTurnOver;
    private javax.swing.JLabel lblTurnOver1;
    private javax.swing.JLabel lblTurnOverValue;
    private javax.swing.JLabel lblTurnOverValue1;
    private javax.swing.JLabel lblTurnOverValue2;
    private javax.swing.JLabel lblUpperDashboard;
    // End of variables declaration//GEN-END:variables
}