/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bermudatechsystem;

/**
 *
 * @author Nathan Cabral
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
        this.setTitle("Add Customer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblNewCustomerName = new javax.swing.JLabel();
        lblCustomerTitle = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        lblNewCustomerEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNewCustomerPhoneNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        newCustomerName = new javax.swing.JTextField();
        newCustomerTitle = new javax.swing.JTextField();
        newCustomerID = new javax.swing.JTextField();
        newCustomerEmail = new javax.swing.JTextField();
        newCustomerAddress = new javax.swing.JTextField();
        newCustomerPhoneNumber = new javax.swing.JTextField();
        newCustomerPostalCode = new javax.swing.JTextField();
        btnAddNewCustomer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnuLogOut = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuBarView = new javax.swing.JMenu();
        menuBarCheckoutInterface = new javax.swing.JMenuItem();
        menuBarSearchProducts = new javax.swing.JMenuItem();
        menuBarAdminInterface = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNewCustomerName.setText("New Customer Name: ");

        lblCustomerTitle.setText("New Customer Title:");

        lblCustomerID.setText("New Customer ID:");

        lblNewCustomerEmail.setText("New Customer Email:");

        jLabel2.setText("New Customer Address: ");

        lblNewCustomerPhoneNumber.setText("New Customer Phone Number:");

        jLabel1.setText("New Customer Postal Code:");

        newCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerNameActionPerformed(evt);
            }
        });

        newCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerIDActionPerformed(evt);
            }
        });

        newCustomerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerEmailActionPerformed(evt);
            }
        });

        btnAddNewCustomer.setText("Add New Customer");
        btnAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCustomerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Customer");

        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jmnuLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmnuLogOut.setText("Log Out");
        jmnuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuLogOut);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit System");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        menuBarView.setText("View");

        menuBarCheckoutInterface.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuBarCheckoutInterface.setText("Checkout Interface");
        menuBarCheckoutInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarCheckoutInterfaceActionPerformed(evt);
            }
        });
        menuBarView.add(menuBarCheckoutInterface);

        menuBarSearchProducts.setText("Search Products");
        menuBarSearchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarSearchProductsActionPerformed(evt);
            }
        });
        menuBarView.add(menuBarSearchProducts);

        menuBarAdminInterface.setText("Admin Interace");
        menuBarAdminInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarAdminInterfaceActionPerformed(evt);
            }
        });
        menuBarView.add(menuBarAdminInterface);

        jMenuBar1.add(menuBarView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newCustomerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(newCustomerName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNewCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNewCustomerPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newCustomerPostalCode)
                            .addComponent(newCustomerID)
                            .addComponent(newCustomerEmail)
                            .addComponent(newCustomerAddress)
                            .addComponent(newCustomerPhoneNumber)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerTitle)
                    .addComponent(newCustomerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewCustomerPhoneNumber)
                    .addComponent(newCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newCustomerPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCustomerNameActionPerformed

    private void newCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCustomerIDActionPerformed

    private void newCustomerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCustomerEmailActionPerformed

    private void btnAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCustomerActionPerformed
        String custAddress = newCustomerAddress.getText();
        String custEmail = newCustomerEmail.getText();
        Database.companyDatabase.generateNewCustomerID();
        String custID =  Database.companyDatabase.getNewCustomerID();
        newCustomerID.setText(custID);
        String custName = newCustomerName.getText();
        String custPhoneNumber = newCustomerPhoneNumber.getText();
        String custPostalCode = newCustomerPostalCode.getText();
        String custTitle = newCustomerTitle.getText();
        
        Database.companyDatabase.customers.add(new Customer(custID, custTitle, custName, custEmail, custAddress, custPhoneNumber, custPostalCode));
        
        newCustomerAddress.setText("");
        newCustomerEmail.setText("");
        newCustomerID.setText("");
        newCustomerName.setText("");
        newCustomerPhoneNumber.setText("");
        newCustomerPostalCode.setText("");
        newCustomerTitle.setText("");
    }//GEN-LAST:event_btnAddNewCustomerActionPerformed

    private void menuBarCheckoutInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarCheckoutInterfaceActionPerformed
        this.setVisible(false);
        new CheckOutInterface().setVisible(true);
    }//GEN-LAST:event_menuBarCheckoutInterfaceActionPerformed

    private void menuBarSearchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarSearchProductsActionPerformed
        this.setVisible(false);
        new SeachProducts().setVisible(true);
    }//GEN-LAST:event_menuBarSearchProductsActionPerformed

    private void menuBarAdminInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarAdminInterfaceActionPerformed
       int userRights = Database.companyDatabase.getCurrentUserRights();
       if(userRights == 2)
       {
           this.setVisible(false);
           new AdminInterface().setVisible(true);
       }
       else
       {
           errorMessage = "You do not have access to this interface.";
           new ErrorMessage(errorMessage).setVisible(true);
       }
       
    }//GEN-LAST:event_menuBarAdminInterfaceActionPerformed

    private void jmnuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuLogOutActionPerformed
        this.setVisible(false);
        new LoginInterface().setVisible(true);
    }//GEN-LAST:event_jmnuLogOutActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Database.companyDatabase.saveSystem();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        newCustomerAddress.setText("");
        newCustomerEmail.setText("");
        newCustomerID.setText("");
        newCustomerName.setText("");
        newCustomerPhoneNumber.setText("");
        newCustomerPostalCode.setText("");
        newCustomerTitle.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }
    String errorMessage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewCustomer;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmnuLogOut;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblCustomerTitle;
    private javax.swing.JLabel lblNewCustomerEmail;
    private javax.swing.JLabel lblNewCustomerName;
    private javax.swing.JLabel lblNewCustomerPhoneNumber;
    private javax.swing.JMenuItem menuBarAdminInterface;
    private javax.swing.JMenuItem menuBarCheckoutInterface;
    private javax.swing.JMenuItem menuBarSearchProducts;
    private javax.swing.JMenu menuBarView;
    private javax.swing.JTextField newCustomerAddress;
    private javax.swing.JTextField newCustomerEmail;
    private javax.swing.JTextField newCustomerID;
    private javax.swing.JTextField newCustomerName;
    private javax.swing.JTextField newCustomerPhoneNumber;
    private javax.swing.JTextField newCustomerPostalCode;
    private javax.swing.JTextField newCustomerTitle;
    // End of variables declaration//GEN-END:variables
}
