/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udacity.view;

import com.udacity.controller.newListener;
import com.udacity.model.InvoiceFrame1;
import com.udacity.model.invHeaderTableModel;
import com.udacity.model.invLineTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;


public class InvoiceFrame extends javax.swing.JFrame   {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(listener);
        createInvBtn = new javax.swing.JButton();
        createInvBtn.addActionListener(listener);
        deleteInvBtn = new javax.swing.JButton();
        deleteInvBtn.addActionListener(listener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        invTotalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invLineTable = new javax.swing.JTable();
        createLineBtn = new javax.swing.JButton();
        createLineBtn.addActionListener(listener);
        deleteLineBtn = new javax.swing.JButton();
        deleteLineBtn.addActionListener(listener);
        invNumLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(listener);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(listener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoicesTable);
        invoicesTable.getAccessibleContext().setAccessibleName("");

        createInvBtn.setText("Create New Invoice");
        createInvBtn.setActionCommand("CreateNewInvoice");
        createInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvBtnActionPerformed(evt);
            }
        });

        deleteInvBtn.setText("Delete Invoice");
        deleteInvBtn.setActionCommand("DeleteInvoice");
        deleteInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        custNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTFActionPerformed(evt);
            }
        });

        invDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invDateTFActionPerformed(evt);
            }
        });

        invLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invLineTable);

        createLineBtn.setText("Create New Line");
        createLineBtn.setActionCommand("CreateNewLine");
        createLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLineBtnActionPerformed(evt);
            }
        });

        deleteLineBtn.setActionCommand("DeleteLine");
        deleteLineBtn.setLabel("Delete Line");
        deleteLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLineBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadMenuItem.setText("Load File");
        loadMenuItem.setActionCommand("LoadFile");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save File");
        saveMenuItem.setActionCommand("SaveFile");
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(createInvBtn)
                        .addGap(68, 68, 68)
                        .addComponent(deleteInvBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(invNumLbl)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invTotalLbl)
                                    .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(createLineBtn)
                        .addGap(98, 98, 98)
                        .addComponent(deleteLineBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invNumLbl))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invTotalLbl))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLineBtn)
                            .addComponent(deleteLineBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createInvBtn)
                    .addComponent(deleteInvBtn))
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTFActionPerformed

    private void createLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createLineBtnActionPerformed

    private void deleteLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLineBtnActionPerformed

    private void invDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invDateTFActionPerformed

    private void createInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvBtnActionPerformed

    private void deleteInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvBtnActionPerformed

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }
  ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvBtn;
    private javax.swing.JButton createLineBtn;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton deleteInvBtn;
    private javax.swing.JButton deleteLineBtn;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JTable invLineTable;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
private List<InvoiceFrame1> invoicesArray = new ArrayList<>();
private invHeaderTableModel invHeaderTableModel;
private invLineTableModel invLineTableModel;
private InvoiceHeaderDialog headerDialog;
private InvoiceLineDialog lineDialog;

private newListener listener = new newListener(this);

    public newListener getListener() {
        return listener;
    }
private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    public void setInvLineTable(JTable invLineTable) {
        this.invLineTable = invLineTable;
    }

    public void setInvHeaderTableModel(invHeaderTableModel invHeaderTableModel) {
        this.invHeaderTableModel = invHeaderTableModel;
    }

    public JLabel getInvNumLbl() {
        return invNumLbl;
    }

    public JButton getCreateInvBtn() {
        return createInvBtn;
    }

    public JButton getCreateLineBtn() {
        return createLineBtn;
    }

    public JTextField getCustNameTF() {
        return custNameTF;
    }

    public JButton getDeleteInvBtn() {
        return deleteInvBtn;
    }

    public JButton getDeleteLineBtn() {
        return deleteLineBtn;
    }

    public JTextField getInvDateTF() {
        return invDateTF;
    }

    public JTable getInvLineTable() {
        return invLineTable;
    }

    public JLabel getInvTotalLbl() {
        return invTotalLbl;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public JMenuItem getLoadMenuItem() {
        return loadMenuItem;
    }

    public JMenuItem getSaveMenuItem() {
        return saveMenuItem;
    }

 

    public List<InvoiceFrame1> getInvoicesArray() {
        return invoicesArray;
    }

    public invHeaderTableModel getInvHeaderTableModel() {
        return invHeaderTableModel;
    }

    public invLineTableModel getInvLineTableModel() {
        return invLineTableModel;
    }

    public InvoiceHeaderDialog getHeaderDialog() {
        return headerDialog;
    }

    public InvoiceLineDialog getLineDialog() {
        return lineDialog;
    }

    public void setInvLineTableModel(invLineTableModel invLineTableModel) {
        this.invLineTableModel = invLineTableModel;
    }

    public void setHeaderDialog(InvoiceHeaderDialog headerDialog) {
        this.headerDialog = headerDialog;
    }

    public void setLineDialog(InvoiceLineDialog lineDialog) {
        this.lineDialog = lineDialog;
    }



}