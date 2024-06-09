
package projectoop;

import java.sql.*;


public class CustomerDisplayForm extends javax.swing.JFrame {

    private Customer customer;
    DBController dbCtrl;
    
    public CustomerDisplayForm(Customer customer) {
        initComponents();
        this.customer = customer;
        dbCtrl = new DBController();
        dbCtrl.setConnect();
        dbCtrl.viewDataCustomer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incomeLbl1 = new javax.swing.JLabel();
        askLoanLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        usernameTxtFld = new javax.swing.JTextField();
        passTxtFld = new javax.swing.JTextField();
        ageTxtFld = new javax.swing.JTextField();
        personalTxtFld = new javax.swing.JTextField();
        eduTxtFld = new javax.swing.JTextField();
        otherCarTxtFld = new javax.swing.JTextField();
        cardTxtFld = new javax.swing.JTextField();
        incomeTxtFld = new javax.swing.JTextField();
        displayOutBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        askLoanTxtFld = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        personalLbl = new javax.swing.JLabel();
        eduLbl = new javax.swing.JLabel();
        otherCarLbl = new javax.swing.JLabel();
        cardLbl = new javax.swing.JLabel();
        incomeLbl2 = new javax.swing.JLabel();
        askLoanLbl1 = new javax.swing.JLabel();

        incomeLbl1.setText("Your income: ");

        askLoanLbl.setText("How many cars do you want to loan?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Your information.");

        nameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFldActionPerformed(evt);
            }
        });

        displayOutBtn.setText("DISPLAY");
        displayOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayOutBtnActionPerformed(evt);
            }
        });

        nextPageBtn.setText("NEXT");
        nextPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBtnActionPerformed(evt);
            }
        });

        nameLbl.setText("Your full name:");

        usernameLbl.setText("Your username:");

        passLbl.setText("Your password:");

        ageLbl.setText("Your age:");

        personalLbl.setText("Amount personal loan: ");

        eduLbl.setText("Amount education loan:");

        otherCarLbl.setText("Amount other car loan:");

        cardLbl.setText("Credit card loan:");

        incomeLbl2.setText("Your income: ");

        askLoanLbl1.setText("Amount of cars:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eduLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(otherCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cardLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(incomeLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(askLoanLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otherCarTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eduTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personalTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(displayOutBtn))
                            .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(askLoanTxtFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incomeTxtFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPageBtn)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayOutBtn)
                    .addComponent(passLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eduTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eduLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherCarTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherCarLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPageBtn)
                    .addComponent(incomeLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(askLoanTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(askLoanLbl1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void displayOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayOutBtnActionPerformed
        
        try{
  
           nameTxtFld.setText(dbCtrl.myRs.getString("fullname"));
           usernameTxtFld.setText(dbCtrl.myRs.getString("username"));
           passTxtFld.setText(dbCtrl.myRs.getString("password"));
           ageTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("age")));
           personalTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("personalLoan")));
           eduTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("eduLoan")));
           otherCarTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("otherCarLoan")));
           cardTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("cardLoan")));
           incomeTxtFld.setText(String.valueOf(dbCtrl.myRs.getString("income")));
           

        }
        
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        askLoanTxtFld.setText(String.valueOf(customer.getCount()));
        

//    nameTxtFld.setText(customer.getName());
//    usernameTxtFld.setText(customer.getUsername());
//    passTxtFld.setText(customer.getPassword());
//    ageTxtFld.setText(String.valueOf(customer.getAge()));
//    personalTxtFld.setText(String.valueOf(customer.getPersonalLoan()));
//    eduTxtFld.setText(String.valueOf(customer.getEduLoan()));
//    otherCarTxtFld.setText(String.valueOf(customer.getCarLoan()));
//    cardTxtFld.setText(String.valueOf(customer.getCreditCardLoan()));
//    incomeTxtFld.setText(String.valueOf(customer.getIncome()));
//    askLoanTxtFld.setText(String.valueOf(customer.getCount()));
        
        
    }//GEN-LAST:event_displayOutBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed
            
        CarRegistrationForm display = new CarRegistrationForm( customer.getCount());
        display.setVisible(true);
        this.setVisible(false);

       
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void nameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFldActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtFld;
    private javax.swing.JLabel askLoanLbl;
    private javax.swing.JLabel askLoanLbl1;
    private javax.swing.JTextField askLoanTxtFld;
    private javax.swing.JLabel cardLbl;
    private javax.swing.JTextField cardTxtFld;
    private javax.swing.JButton displayOutBtn;
    private javax.swing.JLabel eduLbl;
    private javax.swing.JTextField eduTxtFld;
    private javax.swing.JLabel incomeLbl1;
    private javax.swing.JLabel incomeLbl2;
    private javax.swing.JTextField incomeTxtFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel otherCarLbl;
    private javax.swing.JTextField otherCarTxtFld;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTxtFld;
    private javax.swing.JLabel personalLbl;
    private javax.swing.JTextField personalTxtFld;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxtFld;
    // End of variables declaration//GEN-END:variables
}
