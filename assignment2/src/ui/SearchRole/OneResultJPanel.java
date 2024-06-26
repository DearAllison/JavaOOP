/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SearchRole;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Product;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Lynn Wei
 */
public class OneResultJPanel extends javax.swing.JPanel {
	JPanel userProcessContainer;
	Product p;
    /**
     * Creates new form SearchResultJPanel
     */
    public OneResultJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        this.p = p;
        lblTitle.setText(p.getSerialNumber()+"");
        txtSeri_num.setText(p.getSerialNumber()+"");
    	txtModel_num.setText(p.getModelNumber());
    	txtAvai.setText(p.getAvail());
    	txtCity.setText(p.getCity());
    	txtManu.setText(p.getManu());
    	txtName.setText(p.getCarName());
    	txtSeat.setText(p.getSeat()+"");
    	txtYear.setText(p.getYear()+"");
    	txtExp.setText(p.getCertificate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSeat = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtSeri_num = new javax.swing.JTextField();
        txtAvai = new javax.swing.JTextField();
        lblAvai = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblModel_num = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCerti = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        lblManu = new javax.swing.JLabel();
        txtManu = new javax.swing.JTextField();
        lblMain = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblSeri_num = new javax.swing.JLabel();
        txtModel_num = new javax.swing.JTextField();
        txtSeat = new javax.swing.JTextField();

        btnBack.setText("<<BACK");

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblTitle.setText("Search Details");

        lblName.setText("Manufacturer:");

        lblSeat.setText("Availavility:");

        lblCity.setText("City:");

        txtSeri_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeri_numActionPerformed(evt);
            }
        });

        txtAvai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvaiActionPerformed(evt);
            }
        });

        lblAvai.setText("Seat:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblModel_num.setText("Model Number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblCerti.setText("certificate exp:");

        txtExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpActionPerformed(evt);
            }
        });

        lblManu.setText("Name:");

        txtManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManuActionPerformed(evt);
            }
        });

        lblMain.setText("maintenance ");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        lblYear.setText("Year:");

        lblSeri_num.setText("Serial Number:");

        txtModel_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModel_numActionPerformed(evt);
            }
        });

        txtSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(64)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(lblYear, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblAvai, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblSeat, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblManu, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        					.addGap(42)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtManu, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(26)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtSeat, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtAvai, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
        					.addGap(87)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        										.addComponent(lblMain, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        									.addGap(26))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblCerti, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        										.addComponent(lblModel_num, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)))
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(txtCity, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtModel_num, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtExp, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblSeri_num, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGap(18)
        							.addComponent(txtSeri_num, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        					.addGap(119)
        					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(19)
        							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(lblManu, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(10)
        							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        							.addGap(30)
        							.addComponent(txtManu, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
        					.addGap(33)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblYear, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(40)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblAvai, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtSeat, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblSeat, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtAvai, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblSeri_num, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtSeri_num, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblModel_num, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtModel_num, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtCity, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(40)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtExp, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblMain)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(lblCerti)))))
        			.addGap(43))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeri_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeri_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeri_numActionPerformed

    private void txtAvaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvaiActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpActionPerformed

    private void txtManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManuActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtModel_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModel_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModel_numActionPerformed

    private void txtSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAvai;
    private javax.swing.JLabel lblCerti;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblManu;
    private javax.swing.JLabel lblModel_num;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblSeri_num;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAvai;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtManu;
    private javax.swing.JTextField txtModel_num;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtSeri_num;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
