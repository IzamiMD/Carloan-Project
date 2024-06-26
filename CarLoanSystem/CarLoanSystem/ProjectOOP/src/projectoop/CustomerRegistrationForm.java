/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectoop;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jicoo
 */
public class CustomerRegistrationForm extends javax.swing.JFrame {

    private Customer customer;
    DBController dbCtrl;
    
    public CustomerRegistrationForm() {
        initComponents();
        createObjectCustomer();
        nextPageBtn.setEnabled(false);
    }
    
    public void createObjectCustomer(){
        customer = new Customer();
        dbCtrl = new DBController();
        dbCtrl.setConnect();
    }
    
    public void clearInputForm(){
        nameTxtFld.setText("");
        usernameTxtFld.setText("");
        passTxtFld.setText("");
        ageTxtFld.setText("");
        personalTxtFld.setText("");
        eduTxtFld.setText("");
        otherCarTxtFld.setText("");
        cardTxtFld.setText("");
        incomeTxtFld1.setText("");
        askLoanTxtFld.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        signInLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        personalLbl = new javax.swing.JLabel();
        eduLbl = new javax.swing.JLabel();
        otherCarLbl = new javax.swing.JLabel();
        cardLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        usernameTxtFld = new javax.swing.JTextField();
        passTxtFld = new javax.swing.JTextField();
        ageTxtFld = new javax.swing.JTextField();
        personalTxtFld = new javax.swing.JTextField();
        eduTxtFld = new javax.swing.JTextField();
        otherCarTxtFld = new javax.swing.JTextField();
        cardTxtFld = new javax.swing.JTextField();
        submitRecBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        incomeLbl1 = new javax.swing.JLabel();
        incomeTxtFld1 = new javax.swing.JTextField();
        askLoanLbl = new javax.swing.JLabel();
        askLoanTxtFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setText("Customer Registration Form");

        welcomeLbl.setText("Hi and welcome to car loan shop!");

        signInLbl.setText("Please sign in or register:");

        nameLbl.setText("Full name:");

        usernameLbl.setText("Username:");

        passLbl.setText("Password:");

        ageLbl.setText("Age:");

        personalLbl.setText("Personal loan: ");

        eduLbl.setText("Education loan:");

        otherCarLbl.setText("Other car loan:");

        cardLbl.setText("Credit card loan:");

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });

        usernameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtFldActionPerformed(evt);
            }
        });

        passTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtFldActionPerformed(evt);
            }
        });

        ageTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFldActionPerformed(evt);
            }
        });

        personalTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalTxtFldActionPerformed(evt);
            }
        });

        eduTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduTxtFldActionPerformed(evt);
            }
        });

        otherCarTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherCarTxtFldActionPerformed(evt);
            }
        });

        cardTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTxtFldActionPerformed(evt);
            }
        });

        submitRecBtn.setText("SUBMIT");
        submitRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRecBtnActionPerformed(evt);
            }
        });

        nextPageBtn.setText("NEXT");
        nextPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBtnActionPerformed(evt);
            }
        });

        incomeLbl1.setText("Your income: ");

        incomeTxtFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeTxtFld1ActionPerformed(evt);
            }
        });

        askLoanLbl.setText("How many cars do you want to loan?");

        askLoanTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askLoanTxtFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(incomeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cardLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cardTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(welcomeLbl)
                                        .addComponent(signInLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(personalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(personalTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(eduLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eduTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(otherCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(otherCarTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(askLoanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(askLoanTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitRecBtn)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nextPageBtn)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInLbl)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(askLoanLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(askLoanTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLbl)
                    .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalLbl)
                    .addComponent(personalTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitRecBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eduLbl)
                    .addComponent(eduTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherCarLbl)
                    .addComponent(otherCarTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(incomeTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incomeLbl1))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPageBtn)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFldActionPerformed

    private void usernameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFldActionPerformed

    private void passTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtFldActionPerformed

    private void ageTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFldActionPerformed

    private void personalTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalTxtFldActionPerformed

    private void eduTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eduTxtFldActionPerformed

    private void otherCarTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherCarTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherCarTxtFldActionPerformed

    private void cardTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTxtFldActionPerformed

    private void submitRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRecBtnActionPerformed
            
        String insertQuery = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try{
            dbCtrl.pstmt = dbCtrl.myConn.prepareStatement(insertQuery);
            dbCtrl.pstmt.setInt(1, 0);
            dbCtrl.pstmt.setString(2, nameTxtFld.getText());
            dbCtrl.pstmt.setString(3, usernameTxtFld.getText());
            dbCtrl.pstmt.setString(4, passTxtFld.getText());
            dbCtrl.pstmt.setInt(5, Integer.parseInt(ageTxtFld.getText()));
            dbCtrl.pstmt.setDouble(6, Double.parseDouble(personalTxtFld.getText()));
            dbCtrl.pstmt.setDouble(7, Double.parseDouble(eduTxtFld.getText()));
            dbCtrl.pstmt.setDouble(8, Double.parseDouble(otherCarTxtFld.getText()));
            dbCtrl.pstmt.setDouble(9, Double.parseDouble(cardTxtFld.getText()));
            dbCtrl.pstmt.setDouble(10, Double.parseDouble(incomeTxtFld1.getText()));
             
            customer.setCount(Integer.parseInt(askLoanTxtFld.getText()));

            dbCtrl.pstmt.executeUpdate();
            clearInputForm();
             
            JOptionPane.showMessageDialog(new JFrame(), "Data is successfully stored in database!");
            
             
            }
        
        catch(NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
//            speedTxtFld.setText("");
//            speedTxtFld.requestFocus();
        
        }
        
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        nextPageBtn.setEnabled(true);
        submitRecBtn.setEnabled(false);
        
        
//        customer.setName(nameTxtFld.getText());
//        customer.setUsername(usernameTxtFld.getText());
//        customer.setPassword(passTxtFld.getText());
//        customer.setAge(Integer.parseInt(ageTxtFld.getText()));
//        customer.setPersonalLoan(Integer.parseInt(personalTxtFld.getText()));
//        customer.setEduLoan(Integer.parseInt(eduTxtFld.getText()));
//        customer.setCarLoan(Integer.parseInt(otherCarTxtFld.getText()));
//        customer.setCreditCardLoan(Integer.parseInt(cardTxtFld.getText()));
//        customer.setIncome(Integer.parseInt(incomeTxtFld1.getText()));
//        customer.setCount(Integer.parseInt(askLoanTxtFld.getText()));
//        
//        JOptionPane.showMessageDialog(null, "Your info is successfully submitted");
//        
//        clearInputForm();
//        
        

        
    }//GEN-LAST:event_submitRecBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed
        CustomerDisplayForm display = new CustomerDisplayForm(customer);
        display.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void incomeTxtFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeTxtFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeTxtFld1ActionPerformed

    private void askLoanTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askLoanTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_askLoanTxtFldActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtFld;
    private javax.swing.JLabel askLoanLbl;
    private javax.swing.JTextField askLoanTxtFld;
    private javax.swing.JLabel cardLbl;
    private javax.swing.JTextField cardTxtFld;
    private javax.swing.JLabel eduLbl;
    private javax.swing.JTextField eduTxtFld;
    private javax.swing.JLabel incomeLbl1;
    private javax.swing.JTextField incomeTxtFld1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel otherCarLbl;
    private javax.swing.JTextField otherCarTxtFld;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTxtFld;
    private javax.swing.JLabel personalLbl;
    private javax.swing.JTextField personalTxtFld;
    private javax.swing.JLabel signInLbl;
    private javax.swing.JButton submitRecBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxtFld;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
