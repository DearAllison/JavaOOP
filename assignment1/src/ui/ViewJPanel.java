/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Product;

import javax.swing.*;

/**
 *
 * @author Lynn Wei
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    Product product;
    private Object txtNuid_data;
    
    public ViewJPanel(Product product) {
        initComponents();

        System.out.println(product.toString());

        this.product = product;
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        lblMedi_num = new javax.swing.JLabel();
        txtGeo_data = new javax.swing.JTextField();
        lblHealth_num = new javax.swing.JLabel();
        txtNuid_num = new javax.swing.JTextField();
        lblInter_add = new javax.swing.JLabel();
        txtEmail_add = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtTele_num = new javax.swing.JTextField();
        lblVehicle_iden = new javax.swing.JLabel();
        lblBank_num = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtMedi_num = new javax.swing.JTextField();
        lblGeo_data = new javax.swing.JLabel();
        txtHealth_num = new javax.swing.JTextField();
        lblDob = new javax.swing.JLabel();
        txtBank_num = new javax.swing.JTextField();
        lblTele_num = new javax.swing.JLabel();
        txtLinkedln = new javax.swing.JTextField();
        txtFax_num = new javax.swing.JTextField();
        txtCerti_num = new javax.swing.JTextField();
        lblEmail_add = new javax.swing.JLabel();
        txtVehicle_iden = new javax.swing.JTextField();
        lblFax_num = new javax.swing.JLabel();
        txtDevice_iden = new javax.swing.JTextField();
        txtInter_add = new javax.swing.JTextField();
        lblCerti_num = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblLinkedln = new javax.swing.JLabel();
        lblNuid_num = new javax.swing.JLabel();
        lblDevice_iden = new javax.swing.JLabel();





        lblMedi_num.setText("Medical record numbers:");

        lblHealth_num.setText("Health plan beneficiary number:");

        lblInter_add.setText("Internet protocol addresses：");

        lblVehicle_iden.setText("Vehicle identifiers:");

        lblBank_num.setText("Bank account numbers:");

        lblName.setText("Name:");

        lblGeo_data.setText("Geographic data:");

        lblDob.setText("DOB(MM/DD/YYYY):");

        lblTele_num.setText("Telephone numbers:");

        txtLinkedln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedlnActionPerformed(evt);
            }
        });

        lblEmail_add.setText("Email address:");

        lblFax_num.setText("FAX number:");

        txtInter_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInter_addActionPerformed(evt);
            }
        });

        lblCerti_num.setText("Certificate/License number:");

        lblSsn.setText("SSN:");

        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Eras Medium ITC", 1, 48)); // NOI18N
        lblTitle.setText("Personal Profile");

        lblLinkedln.setText("Linkedln:");

        lblNuid_num.setText("NUID number:");

        lblDevice_iden.setText("Device identifiers:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);



        txtImageIcon=new javax.swing.JLabel();
        ImageIcon imageIcon = new ImageIcon(MainJFrame.product.getIcon_path());
        txtImageIcon.setIcon(imageIcon);
        txtImageIcon.getIcon();
        txtImageIcon.setBounds(750, 30, 150, 150);
        this.add(txtImageIcon);

        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail_add, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGeo_data, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDob)
                            .addComponent(lblTele_num)
                            .addComponent(lblFax_num, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFax_num, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTele_num, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail_add, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNuid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGeo_data, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLinkedln, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehicle_iden)
                            .addComponent(lblMedi_num, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBank_num, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerti_num, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDevice_iden, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInter_add)
                            .addComponent(lblHealth_num))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLinkedln, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInter_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedi_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHealth_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBank_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCerti_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDevice_iden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicle_iden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGeo_data, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeo_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNuid_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTele_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTele_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFax_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFax_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtHealth_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMedi_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMedi_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblHealth_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLinkedln, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinkedln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBank_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBank_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCerti_num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCerti_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVehicle_iden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicle_iden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDevice_iden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDevice_iden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInter_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInter_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLinkedlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedlnActionPerformed

    private void txtInter_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInter_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInter_addActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel txtImageIcon;
    private javax.swing.JLabel lblBank_num;
    private javax.swing.JLabel lblCerti_num;
    private javax.swing.JLabel lblDevice_iden;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail_add;
    private javax.swing.JLabel lblFax_num;
    private javax.swing.JLabel lblGeo_data;
    private javax.swing.JLabel lblHealth_num;
    private javax.swing.JLabel lblInter_add;
    private javax.swing.JLabel lblLinkedln;
    private javax.swing.JLabel lblMedi_num;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNuid_num;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTele_num;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicle_iden;
    private javax.swing.JTextField txtBank_num;
    private javax.swing.JTextField txtCerti_num;
    private javax.swing.JTextField txtDevice_iden;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail_add;
    private javax.swing.JTextField txtFax_num;
    private javax.swing.JTextField txtGeo_data;
    private javax.swing.JTextField txtHealth_num;
    private javax.swing.JTextField txtInter_add;
    private javax.swing.JTextField txtLinkedln;
    private javax.swing.JTextField txtMedi_num;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNuid_num;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtTele_num;
    private javax.swing.JTextField txtVehicle_iden;

    // End of variables declaration//GEN-END:variables

    private void displayProduct() {





       txtName.setText(product.getName());
       txtGeo_data.setText(product.getGeo_data());
       txtVehicle_iden.setText(product.getVehicle_iden());
       txtDevice_iden.setText(product.getDevice_iden());
       txtLinkedln.setText(product.getLinkedln());
       txtInter_add.setText(product.getInter_add());
       txtEmail_add.setText(product.getEmail_add());
       
       txtNuid_num.setText(product.getNuid_num());
       txtDob.setText(product.getDob());
       txtTele_num.setText(product.getTele_num());
       txtFax_num.setText(product.getFax_num());
       txtSsn.setText(product.getSsn());
       txtMedi_num.setText(product.getMedi_num());
       txtHealth_num.setText(product.getHealth_num());
       txtBank_num.setText(product.getBank_num());
       txtCerti_num.setText(product.getCerti_num());
       
       
       
       
       
 
    }
}
