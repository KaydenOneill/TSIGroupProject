/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.epos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JList;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class EposUI extends javax.swing.JFrame {
    //declaring variables
    DefaultListModel productListModel = new DefaultListModel();
    ArrayList<Double> totalOrderCollection = new ArrayList<Double>();
    Double currentOrder = 0.0;
    private javax.swing.JList<String> lstOrders;
    public EposUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlOrder = new javax.swing.JPanel();
        cmboProductPrice = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrder = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        pnlReports = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEndOfDayReport = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EPOS Simple");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtOrder.setColumns(20);
        txtOrder.setRows(5);
        jScrollPane1.setViewportView(txtOrder);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblTotal.setText("Total: £");

        btnCheckout.setText("Checkout");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cmboProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addComponent(btnCheckout)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Order", pnlOrder);

        txtEndOfDayReport.setColumns(20);
        txtEndOfDayReport.setRows(5);
        jScrollPane2.setViewportView(txtEndOfDayReport);

        javax.swing.GroupLayout pnlReportsLayout = new javax.swing.GroupLayout(pnlReports);
        pnlReports.setLayout(pnlReportsLayout);
        pnlReportsLayout.setHorizontalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlReportsLayout.setVerticalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reports", pnlReports);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        login();
        //this populates the quantity combo box
        // refactored to use the quantity class
            
        jSpinner1.setValue(1);
        
        

        //this populates the product and price combo box

                try 
            {
                Connection con = DriverManager.getConnection ("jdbc:ucanaccess://Data\\Products.accdb"); 
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM ProductsPrices");
                while (rs.next()) 
                {        
                    Product product;
                    product = new Product(rs.getDouble("Price"), rs.getString("Product"));
                    cmboProductPrice.addItem(rs.getString("Product")+": £" +rs.getDouble("Price"));
                }
            }
         catch(SQLException e)
            {
                System.out.println("SQL exception occured" + e);
                
            }



    }//GEN-LAST:event_formWindowOpened

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed

        //this resets and clears the frame back to its original state
        setFrame("","",0,0);
    
    //this adds the current order to the arraylist
    totalOrderCollection.add(currentOrder);    
    
    //defining variables
    Double orderTotal = 0.0;
    Double totalSales = 0.0;
    Double atv = 0.0;
    Double min = currentOrder;
    Double max = 0.0;
    
    //this counts the number of items in the array (or customers)
    for(int i=0;i<totalOrderCollection.size();i++)
    {
    totalSales+=totalOrderCollection.get(i);
    }
    
    //this calculates the average sale value
    atv = totalSales/totalOrderCollection.size();
    
    //this compares each element in the array to find the min and max
     for(Double currentOrder : totalOrderCollection)
    {   
        orderTotal = orderTotal + currentOrder;
        
        if(currentOrder>max)
        {
            max = currentOrder;
        }
        
        if(currentOrder<min)
        {
            min = currentOrder;
        }
         
    }
    
    //this prints information to the report screen
    txtEndOfDayReport.append("Total sales takings: £" + df.format(orderTotal) +"\n");
    txtEndOfDayReport.append("Total customers: " + String.valueOf(totalOrderCollection.size())+"\n");
    txtEndOfDayReport.append("Average transaction value: £" + df.format(atv) +"\n");
    txtEndOfDayReport.append("Maximum spend: £" + df.format(max) +"\n");
    txtEndOfDayReport.append("Minimum spend: £" + df.format(min) +"\n");
    
    txtOrder.setText(null);
    JOptionPane.showMessageDialog(this, "Your total is: £" + df.format(currentOrder) + "\nThank you for your order");
    
    currentOrder=0.0;
    }//GEN-LAST:event_btnCheckoutActionPerformed


    private void setFrame(String reportText, String lblText, int productPrice, int quantity) {
        txtEndOfDayReport.setText(reportText);
        lblTotal.setText(lblText);
        cmboProductPrice.setSelectedIndex(productPrice);
        jSpinner1.setValue(1);
    }



    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    //this resets and clears the frame back to its original state
    if(evt.getSource()==btnCancel)
    {
        setFrame(null,"",0,0);
        txtOrder.setText("");
        currentOrder=0.0;
    }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    //this defines the colon postiion
    int cp = cmboProductPrice.getSelectedItem().toString().indexOf(":");
    //this pulls the quantity, product and price from the combo boxes into the text field
    txtOrder.append((String) jSpinner1.getValue().toString() + "x ");
    txtOrder.append((String) cmboProductPrice.getSelectedItem() + "\n");
    
    //this extracts prices from the product price combo box and multiplies them by their respective quantities 
    double price = Double.parseDouble(cmboProductPrice.getSelectedItem().toString().substring(cp+3));
    int productQuantity = Integer.parseInt(jSpinner1.getValue().toString());
    double productPriceCost = price*productQuantity;
    
    //this totals all the quantities*products
    currentOrder+= productPriceCost;
    //this writes the running total order cost to screen
    lblTotal.setText("Total: £" + df.format(currentOrder));
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void login() {
        JLabel label_login = new JLabel("Employee ID:");
        JTextField login = new JTextField();

        Object[] login_GUI_Elements = {label_login, login};

        int userInteraction = JOptionPane.showConfirmDialog(null, login_GUI_Elements, "Login",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);

        if (userInteraction == JOptionPane.OK_OPTION)
        {
            String user = login.getText().trim();
            Boolean entryGranted = false;
            if ((user.toUpperCase().equals ("1234")))
            {
                JOptionPane.showMessageDialog(this, "Logged in as " + user);
                entryGranted=true;
            }
            if (!entryGranted)
            {
                JOptionPane.showMessageDialog(this, "Entry denied");
                userInteraction = JOptionPane.CANCEL_OPTION;
            }
        }
        else
            {
            userInteraction = JOptionPane.CANCEL_OPTION;
            }

        if ((userInteraction == JOptionPane.CANCEL_OPTION) || (userInteraction == JOptionPane.CLOSED_OPTION))
            {
                JOptionPane.showMessageDialog(this, "You have not supplied valid credentials\nThe application will now terminate");
                System.exit(0);
            }
    }
    
    
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
            java.util.logging.Logger.getLogger(EposUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EposUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EposUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EposUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EposUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmboProductPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JPanel pnlReports;
    private javax.swing.JTextArea txtEndOfDayReport;
    private javax.swing.JTextArea txtOrder;
    // End of variables declaration//GEN-END:variables
}
