/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import data.AppData;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import model.Patient;
import model.Person;
import ui.City.AddPeople;

/**
 *
 * @author Lynn Wei
 */
public class PatientCatalogJPanel extends javax.swing.JPanel {
    
    private javax.swing.JPanel userProcessContainer;
    private String cityName;
    private String communityName;
    private String houseName;
    private Object[][] obj;
    

    /**
     * Creates new form PatientDirectoryJPanel
     */
    public PatientCatalogJPanel(javax.swing.JPanel userProcessContainer) {
        this.userProcessContainer=userProcessContainer;
        initComponents();
        initDate();
    }
    
    
     public void initDate(){
        lblTitle.setText(houseName);
        
        List<Patient> appPersonList=AppData.getPatientList();
      
        
        obj = new Object[appPersonList.size()][8];  
        for(int i=0;i<appPersonList.size();i++){
            obj[i][0]= i+1;
            obj[i][1]= appPersonList.get(i).getName();
            obj[i][2]= appPersonList.get(i).getID();
            obj[i][3]= appPersonList.get(i).getGender();
            obj[i][4]= appPersonList.get(i).getAge();
            obj[i][5]= appPersonList.get(i).getHouseName();
            obj[i][6]= appPersonList.get(i).getCommunityName();
            obj[i][7]= appPersonList.get(i).getCityName();
        }
        
        tblPatientCatalog.setModel(new javax.swing.table.DefaultTableModel(
            obj,
            new String [] {
                "NO.", "Name", "ID", "Gender", "Age", "House", "Community", "City"
            }
        ));
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
        tblPatientCatalog = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 600));

        tblPatientCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "Name", "ID", "Gender", "Age", "House", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientCatalog.setRowHeight(30);
        jScrollPane1.setViewportView(tblPatientCatalog);

        btnAdd.setText("Add New Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDetail.setText("View Patient");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Patient");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblTitle.setText(" Patient Catalog");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDetail)
                    .addComponent(btnDelete))
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        //查看详情
        ViewPatientJPanel ac=new ViewPatientJPanel(userProcessContainer,
                obj[tblPatientCatalog.getSelectedRow()][7].toString(),
                obj[tblPatientCatalog.getSelectedRow()][6].toString(),
               obj[tblPatientCatalog.getSelectedRow()][5].toString(),
                obj[tblPatientCatalog.getSelectedRow()][1].toString());
        userProcessContainer.add("ViewPatientJPanel",ac);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
         AppData.delPatient(
                obj[tblPatientCatalog.getSelectedRow()][7].toString(),
                obj[tblPatientCatalog.getSelectedRow()][6].toString(),
               obj[tblPatientCatalog.getSelectedRow()][5].toString(),
                obj[tblPatientCatalog.getSelectedRow()][1].toString());
         initDate();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Add
         CreatePatientJPanel ac=new CreatePatientJPanel(userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel",ac);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatientCatalog;
    // End of variables declaration//GEN-END:variables
}
