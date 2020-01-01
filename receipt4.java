/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorytry;

import static inventorytry.MainInterface.fileWriter;
import static inventorytry.MainInterface.foodlist;
import static inventorytry.MainInterface.updateFile;
import java.awt.Event;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SYSTEM
 */
public class receipt4 extends javax.swing.JFrame {

    String[] menu;
    Food food;
    ArrayList<Food> foodlist = new ArrayList<Food>();
    Food[] item = new Food[foodlist.size()];
    
    DefaultListModel model1 = new DefaultListModel();
    DefaultTableModel model2 = new DefaultTableModel();
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String strDate = formatter.format(date);
    DecimalFormat frmt = new DecimalFormat("###,##0.00");

    public receipt4() {
        initComponents();
        setValues();
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cashierField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        items = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        netTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        change = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textarea.setForeground(new java.awt.Color(102, 102, 102));
        textarea.setRows(5);
        textarea.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(textarea);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ITEMS");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Item", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Cashier's Name:");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        generate.setText("Generate Receipt");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        items.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200 - GINGERSOUP", "201 - S&TSALAD", "202 - AVOCADOTOAST", "203 - FRITTAPANINI", "204 - YOGURTPARFAIT", "205 - GORMETSALAD", "206 - ROASTEDCHICKEN", "207 - SMOKEDSALMON", "208 - CRYSTALGEISER", "209 - ORANGINAJUICE" }));
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(items, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(generate)
                                .addGap(18, 18, 18)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashierField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashierField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate)
                    .addComponent(reset))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ko.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("TOTAL:");

        netTotal.setBackground(new java.awt.Color(0, 0, 0));
        netTotal.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        netTotal.setForeground(new java.awt.Color(255, 255, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Tendered Cash:");

        cash.setBackground(new java.awt.Color(0, 0, 0));
        cash.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        cash.setForeground(new java.awt.Color(255, 255, 0));
        cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cashKeyPressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Change");

        change.setBackground(new java.awt.Color(0, 0, 0));
        change.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        change.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cash)
                    .addComponent(netTotal)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(change))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(netTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(347, 347, 347))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setValues() {
        foodlist = new ArrayList<Food>();
        try {
            Scanner inFile = new Scanner(new File("C:\\Users\\TEMP\\Documents\\Music\\Music\\Documents\\NetBeansProjects\\inventorytry\\src\\inventorytry\\inventory.txt"));
            int i = 0;
            while (inFile.hasNextLine()) {
                String parts[] = inFile.nextLine().split(" ");
                   
                foodlist.add(i, new Food(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
                i++;

            }
            inFile.close();
            inFile.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("Error");
        }

    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        textarea.setText("");
        cashierField.setText("");
        netTotal.setText("");
        cash.setText("");
        change.setText("");
        jTable2.setModel(new DefaultTableModel(null, new String[]{"Item", "Quantity", "Total"}));
    }//GEN-LAST:event_resetActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        textarea.setText("               AROMA CAFE\n"
                + "           1211 GREEN STREET\n"
                + "              New York, NY\n"
                + "Clerk: " + cashierField.getText() + "\t" + strDate
                + "\nQTY         DESC        AMT\n"
                + "==================================\n");

        int nRow = model2.getRowCount(), nCol = model2.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = model2.getValueAt(i, j);
                textarea.append(tableData[i][j].toString() + "\t");

            }
            textarea.append("\n");
        }
        int dischange, disamount, discash;
        disamount = Integer.parseInt(netTotal.getText());
        discash = Integer.parseInt(cash.getText());
        dischange = Integer.parseInt(change.getText());

        textarea.append("\n\n\t\tTotal: P " + frmt.format(disamount)
                + "\n\t\tCash:   P " + frmt.format(discash)
                + "\n\t\tCHANGE: P " + frmt.format(dischange)
                + "\n\n    THANK YOU FOR DINING WITH US!\n"
                + " This serves as your official receipt");
    }//GEN-LAST:event_generateActionPerformed

    private void cashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(Integer.parseInt(cash.getText()) < Integer.parseInt(netTotal.getText()))
            {
                  JOptionPane.showMessageDialog(null, "Error! Insufficient cash.");
            }
            else{
                int dischange = 0;
            int sum = 0;
            for (int row = 0; row < jTable2.getRowCount(); row++) {
                sum = sum + Integer.parseInt(jTable2.getValueAt(row, 2).toString());
            }
            dischange = Integer.parseInt(cash.getText()) - sum;
            change.setText(String.valueOf(dischange));
            }
            
        }
    }//GEN-LAST:event_cashKeyPressed
    public void rewrite(){
                try {
                    fileWriter = new FileWriter("C:\\Users\\TEMP\\Documents\\Music\\Music\\Documents\\NetBeansProjects\\inventorytry\\src\\inventorytry\\inventory.txt", false);
                    String write = "";
                    for (int i = 0; i < foodlist.size(); i++) {
                        write += foodlist.get(i).foodCode + " " + foodlist.get(i).foodName + " " + foodlist.get(i).foodPrice + " " + foodlist.get(i).foodQuantity + "\n";
                    }
                    fileWriter.write(write);
                    fileWriter.close();

                } catch (IOException e) {
                    System.out.println("" + e);
                    JOptionPane.sQhowMessageDialog(null, "Error saving.");
                }
    }
    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        // TODO add your handling code here:
        setValues();
        int dischange = 0;
        int sum = 0;
        int total = 0;
        int item = items.getSelectedIndex();
        int qty;

        try {
            if (item == 0) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(0).foodPrice * qty;

                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(0).foodName,
                        total
                    }
                    );

                    foodlist.get(0).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 1) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(1).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
               
                
                else{
                     model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(1).foodPrice * qty;
                    model2.addRow(new Object[]{
                    qty,
                    foodlist.get(1).foodName,
                    total
                    }
                    );
                    foodlist.get(1).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 2) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(2).foodPrice * qty;
                
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(2).foodName,
                        total
                    }
                );
                foodlist.get(2).foodQuantity -= qty;
                rewrite();
                }
                
            } else if (item == 3) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(3).foodPrice * qty;
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(3).foodName,
                        total
                    }
                    );
                    foodlist.get(3).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 4) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(4).foodPrice * qty;
                     if(foodlist.get(0).foodQuantity < qty)
                    {
                        JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                    }
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(4).foodName,
                        total
                    }
                    );
                    foodlist.get(2).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 5) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(5).foodPrice * qty;
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(5).foodName,
                        total
                    }
                    );
                    foodlist.get(5).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 6) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error! Insufficient stocks.");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(6).foodPrice * qty;

                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(6).foodName,
                        total
                    }
                    );
                    foodlist.get(6).foodQuantity -= qty;
                    rewrite();
                }
               
            } else if (item == 7) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                else{
                     model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(7).foodPrice * qty;
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(7).foodName,
                        total
                    }
                    );
                    foodlist.get(7).foodQuantity -= qty;
                    rewrite();
                }
               
            } else if (item == 8) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                else{
                    model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(8).foodPrice * qty;
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(8).foodName,
                        total
                    }
                    );
                    foodlist.get(8).foodQuantity -= qty;
                    rewrite();
                }
                
            } else if (item == 9) {
                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                if(foodlist.get(0).foodQuantity < qty)
                {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                else{
                     model2 = (DefaultTableModel) jTable2.getModel();
                    total = foodlist.get(9).foodPrice * qty;
                    model2.addRow(new Object[]{
                        qty,
                        foodlist.get(9).foodName,
                        total
                    }
                    );
                    foodlist.get(9).foodQuantity -= qty;
                    rewrite();
                }
               
            } 
        }catch (NullPointerException e) {
            System.out.println("NULL");
        }

        for (int row = 0; row < jTable2.getRowCount(); row++) {
            sum = sum + Integer.parseInt(jTable2.getValueAt(row, 2).toString());

        }
        netTotal.setText(String.valueOf(sum));
    }//GEN-LAST:event_itemsActionPerformed

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
            java.util.logging.Logger.getLogger(receipt4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cash;
    private javax.swing.JTextField cashierField;
    private javax.swing.JTextField change;
    private javax.swing.JButton generate;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField netTotal;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables

    
}
