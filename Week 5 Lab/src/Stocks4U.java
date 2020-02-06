
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doujones
 */
public class Stocks4U extends javax.swing.JFrame {
    DefaultListModel<Stock> stkModel = new DefaultListModel<Stock>();
    /**
     * Creates new form Stocks4U
     */
    public Stocks4U() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Stock stk1 = new Stock("Google", 20, 800, 1320);
        Stock stk2 = new Stock("Intel", 50, 35, 58);
        Stock stk3 = new Stock("Apple", 10, 120, 92);
        stkModel.addElement(stk1);
        stkModel.addElement(stk2);
        stkModel.addElement(stk3); 
        
        calculateTotalValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jtpMainTask = new javax.swing.JTabbedPane();
        pnlList = new javax.swing.JPanel();
        scrStocks = new javax.swing.JScrollPane();
        lstStocks = new javax.swing.JList<>();
        lblProfitLoss = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        lblTotalValue = new javax.swing.JLabel();
        pnlAddStock = new javax.swing.JPanel();
        lblStockName = new javax.swing.JLabel();
        txtStockName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblPurchasePrice = new javax.swing.JLabel();
        txtPurchasePrice = new javax.swing.JTextField();
        lblCurrentPrice = new javax.swing.JLabel();
        txtCurrentPrice = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        mnbMainMenu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        sepMenu1 = new javax.swing.JPopupMenu.Separator();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portfolio Management");

        jtpMainTask.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        pnlList.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        lstStocks.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lstStocks.setModel(stkModel);
        lstStocks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStocksValueChanged(evt);
            }
        });
        scrStocks.setViewportView(lstStocks);

        lblProfitLoss.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblProfitLoss.setText("Profit / Loss");

        btnRemove.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnRemove.setText("Remove Stock");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblTotalValue.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTotalValue.setText("Total Value: ");

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrStocks)
                    .addGroup(pnlListLayout.createSequentialGroup()
                        .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlListLayout.createSequentialGroup()
                                .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scrStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jtpMainTask.addTab("List", pnlList);

        lblStockName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStockName.setText("Stock Name:");

        txtStockName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        lblPurchasePrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPurchasePrice.setText("Purchase Price:");

        txtPurchasePrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        lblCurrentPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCurrentPrice.setText("Current Price:");
        lblCurrentPrice.setDoubleBuffered(true);

        txtCurrentPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        btnAddStock.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddStockLayout = new javax.swing.GroupLayout(pnlAddStock);
        pnlAddStock.setLayout(pnlAddStockLayout);
        pnlAddStockLayout.setHorizontalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddStockLayout.createSequentialGroup()
                                .addComponent(lblStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        pnlAddStockLayout.setVerticalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStockName))
                .addGap(18, 18, 18)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPurchasePrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentPrice))
                .addGap(49, 49, 49)
                .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jtpMainTask.addTab("Add Stock", pnlAddStock);

        mnuFile.setText("File");
        mnuFile.add(sepMenu1);

        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnuFile.add(mniOpen);

        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mniSave);

        jMenuItem1.setText("Exit");
        mnuFile.add(jMenuItem1);

        mnbMainMenu.add(mnuFile);

        setJMenuBar(mnbMainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpMainTask, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpMainTask, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
            int position = lstStocks.getSelectedIndex();
            
            if( position > -1 ){
                stkModel.remove(position);
            }
            else
            {
                JOptionPane.showMessageDialog(this, 
               "Mistake, select a stock to remove", "Error Message",
                JOptionPane.ERROR_MESSAGE);
                
            }
            calculateTotalValue();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void lstStocksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStocksValueChanged
        int index = lstStocks.getSelectedIndex();
        
        if( index > -1)
        {
            Stock stk = stkModel.getElementAt(index);
            
            double profitLoss = stk.profitLoss();
            DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
            if(profitLoss > 0.0)
                lblProfitLoss.setText("Profit of" + fmt.format(profitLoss));
                else if(profitLoss < 0.0)
                    lblProfitLoss.setText("Loss of" + fmt.format(profitLoss));
                else
                    lblProfitLoss.setText("BreakEven of" + fmt.format(profitLoss));
           
        }
    }//GEN-LAST:event_lstStocksValueChanged

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
       if(txtStockName.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Error, Stock Name is required.");
           txtStockName.requestFocus();
           return;
       }
        if(txtQuantity.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Error, Quantity is required.");
           txtQuantity.requestFocus();
            return;
       }
       
         if(txtPurchasePrice.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Error, Purchase Price is required.");
           txtPurchasePrice.requestFocus();
            return;
       }
        
        if(txtCurrentPrice.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Error, Current Price is required.");
           txtCurrentPrice.requestFocus();
            return;
       }
      
        
        String stkName = txtStockName.getText();
        double quantity = Double.parseDouble(txtQuantity.getText());
        double purchasePrice = Double.parseDouble(txtPurchasePrice.getText());
        double currentPrice = Double.parseDouble(txtCurrentPrice.getText());
        
        Stock stk = new Stock(stkName, quantity, purchasePrice, currentPrice);
        stkModel.addElement(stk);
        
        txtStockName.setText("");
        txtQuantity.setText("");
        txtCurrentPrice.setText("");
        txtPurchasePrice.setText("");
        txtStockName.requestFocus();
         calculateTotalValue();
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        openStocks();
        calculateTotalValue();
    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
      saveStocks();
    }//GEN-LAST:event_mniSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Stocks4U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks4U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks4U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks4U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks4U().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnRemove;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jtpMainTask;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStockName;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JList<Stock> lstStocks;
    private javax.swing.JMenuBar mnbMainMenu;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JPanel pnlAddStock;
    private javax.swing.JPanel pnlList;
    private javax.swing.JScrollPane scrStocks;
    private javax.swing.JPopupMenu.Separator sepMenu1;
    private javax.swing.JTextField txtCurrentPrice;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables

    private void saveStocks() {
       
        String fileName = JOptionPane.showInputDialog("Enter filename: ");
        if(fileName == null)
            return;
        
        
        
        ArrayList<Stock> stocks = new ArrayList<Stock>();
        
        for ( int i = 0; i <stkModel.size(); i++) {
            Stock stk = stkModel.elementAt(i);
            stocks.add(stk);
        }
        
        StockIO fileIO = new StockIO();
        fileIO.saveData(stocks, fileName);
    }

    private void openStocks() {
       stkModel.clear();
        
       String fileName = JOptionPane.showInputDialog("Enter filename: ");
        if(fileName == null)
            return;
        
        StockIO dataIO = new StockIO();
        ArrayList<Stock> stocks = dataIO.getData(fileName);
        
        for (Stock stk : stocks)
        {
            stkModel.addElement(stk);
        }
    }

    private void calculateTotalValue() {
      double total = 0.0;
      
      for( int i = 0; i < stkModel.size(); i++)
      {
          Stock stk = stkModel.elementAt(i);
          double stockValue = stk.getNumberOfShares() * stk.getCurrentPrice();
          total += stockValue;
          
      }
      DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
      lblTotalValue.setText("Total Value: " + fmt.format(total));
    }
}
