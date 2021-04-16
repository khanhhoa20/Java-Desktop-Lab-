/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab3.dto.Employee;
import lab3.dto.EmployeeData;

/**
 *
 * @author PC
 */
public class ManagementScreen extends javax.swing.JFrame {

    public ManagementScreen() {
        initComponents();
        viewEmp();

    }

    public void viewEmp() {
        Vector columnHeader = new Vector();
        Vector data = null;
        columnHeader.add("EmpID");
        columnHeader.add("Fullname");
        columnHeader.add("Phone");
        columnHeader.add("Email");
        columnHeader.add("Address");
        columnHeader.add("dateOfBirth");
        columnHeader.add("isDelete");

        try {
            data = EmployeeData.getAllEmp();
        } catch (Exception ex) {
            Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel model = new DefaultTableModel(data, columnHeader);
        tblEmp.setModel(model);

        tblEmp.getColumnModel().getColumn(4).setMinWidth(0);
        tblEmp.getColumnModel().getColumn(4).setMaxWidth(0);

        tblEmp.getColumnModel().getColumn(5).setMinWidth(0);
        tblEmp.getColumnModel().getColumn(5).setMaxWidth(0);

        tblEmp.getColumnModel().getColumn(6).setMinWidth(0);
        tblEmp.getColumnModel().getColumn(6).setMaxWidth(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGetAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Emp Management");

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emp's Detail:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel2.setText("EmpID:");

        jLabel3.setText("Fullname:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Address:");

        jLabel7.setText("DOB:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane4.setViewportView(txtAddress);

        btnCreate.setText("Create Emp");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Emp");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Emp");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmpID)
                                .addComponent(txtFullname)
                                .addComponent(txtPhone)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(47, 47, 47)
                        .addComponent(btnCreate)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(38, 38, 38))
        );

        btnGetAll.setText("Get All Emp");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(btnGetAll)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnGetAll)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (check()) {
            String empID = txtEmpID.getText();
            String fullname = txtFullname.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();
            Date dateOfBirth = null;
            try {
                dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(txtDOB.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean isDelete = false;
            Employee emp = new Employee(empID, fullname, phone, email, address, dateOfBirth, isDelete);

            try {
                boolean result = EmployeeData.insertEmp(emp);
                if (result) {
                    viewEmp();
                    JOptionPane.showMessageDialog(this, "Insert successfully");

                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "Insert failed. EmpID must not be duplicate");

                }
            } catch (Exception ex) {
                Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        if (check()) {
            String empID = txtEmpID.getText();
            String fullname = txtFullname.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();
            Date dateOfBirth = null;

            try {
                dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(txtDOB.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean isDelete = false;
            Employee emp = new Employee(empID, fullname, phone, email, address, dateOfBirth, isDelete);
            try {
                boolean result = EmployeeData.updateEmp(emp);
                if (result) {
                    viewEmp();
                    JOptionPane.showMessageDialog(this, "Update successfully");
                    clear();

                } else {
                    JOptionPane.showMessageDialog(this, "Update failed");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        // TODO add your handling code here:

        viewEmp();


    }//GEN-LAST:event_btnGetAllActionPerformed


    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // TODO add your handling code here:
        txtEmpID.setEditable(false);
        int pos = tblEmp.getSelectedRow();
        txtAddress.setText((String) tblEmp.getValueAt(pos, 4));
        txtDOB.setText((String) tblEmp.getValueAt(pos, 5));

        txtEmail.setText((String) tblEmp.getValueAt(pos, 3));
        txtEmpID.setText((String) tblEmp.getValueAt(pos, 0));
        txtFullname.setText((String) tblEmp.getValueAt(pos, 1));
        txtPhone.setText((String) tblEmp.getValueAt(pos, 2));
    }//GEN-LAST:event_tblEmpMouseClicked

    private void clear() {
        txtAddress.setText("");
        txtDOB.setText("");
        txtEmail.setText("");
        txtEmpID.setText("");
        txtFullname.setText("");
        txtPhone.setText("");
        txtEmpID.setEditable(true);
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
        txtEmpID.requestFocus();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Ban chac chan muon xoa du lieu nay",
                "Warning", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            try {
                boolean result = EmployeeData.deleteEmp(txtEmpID.getText());
                if (result) {
                    viewEmp();
                    JOptionPane.showMessageDialog(this, "Delete successfully");

                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "Delete failed");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManagementScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Canceled Delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private boolean check() {

        String msg = "";
        if (txtEmpID.getText().length() > 10 || txtEmpID.getText().length() == 0
                || txtEmpID.getText().contains("@") || txtEmpID.getText().contains("#") || txtEmpID.getText().contains("$")) {
            if (msg == "") {
                msg = "empID:not null, max length is 10, not contains special characters (@, #, $)";
                txtEmpID.requestFocus();
            } else {
                msg += "\nempID:not null, max length is 10, not contains special characters (@, #, $)";
            }
        }

        int dem = 0;
        for (int i = 0; i < txtEmail.getText().length(); i++) {

            if (txtEmail.getText().charAt(i) == '@') {
                dem += 1;
            }
        }
        if (txtEmail.getText().length() > 30 || txtEmail.getText().length() < 0
                || txtEmail.getText().contains("!") || txtEmail.getText().contains("#")
                || txtEmail.getText().contains("$") || dem == 0 || dem > 1) {
            if (msg == "") {
                msg = "Email: max length is 30, contain only one “@” character, do not contain special characters (!, #,$)";
                txtEmail.requestFocus();
            } else {
                msg += "\nEmail: max length is 30, contain only one “@” character, do not contain special characters (!, #,$)";
            }
        }

        if (txtFullname.getText().length() > 30 || txtFullname.getText().length() == 0) {
            if (msg == "") {
                msg = "fullname:not null max length is 30";
                txtFullname.requestFocus();
            } else {
                msg += "\nfullname: max length is 30";
            }
        }

        if (txtAddress.getText().length() > 300 || txtAddress.getText().length() == 0) {
            if (msg == "") {
                msg = "address:not null max length is 300";
                txtAddress.requestFocus();
            } else {
                msg += "\naddress:not null max length is 300";
            }
        }

        if (!(txtPhone.getText().matches("^\\d{1,15}$"))) {
            if (msg == "") {
                msg = "Phone number: max length is 15, contain numeric characters only (0 – 9)";
                txtPhone.requestFocus();
            } else {
                msg += "\nPhone number: max length is 15, contain numeric characters only (0 – 9)";
            }
        }

        try {
            if (!(txtDOB.getText().matches("^\\d{2}\\/\\d{2}\\/\\d{4}$"))) {
                if (msg == "") {
                    msg = "DateOfBirth: in format MM/DD/YYYY";
                    txtDOB.requestFocus();
                } else {
                    msg += "\nDateOfBirth: in format MM/DD/YYYY";
                }
            }
            Date date = new SimpleDateFormat("MM/dd/yyyy").parse(txtDOB.getText());
            String month = txtDOB.getText().split("/")[0];
            int monthInt = Integer.parseInt(month);
            if (monthInt > 12 || monthInt == 0) {
                if (msg == "") {
                    msg = "DateOfBirth: in format MM/DD/YYYY, month is wrong";
                    txtDOB.requestFocus();
                } else {
                    msg += "\nDateOfBirth: in format MM/DD/YYYY, month is wrong";
                }
            } else {
                String day = txtDOB.getText().split("/")[1];
                int dayInt = Integer.parseInt(day);
                if (dayInt > 31 || dayInt == 0) {
                    if (msg == "") {
                        msg = "DateOfBirth: in format MM/DD/YYYY, day is wrong";
                        txtDOB.requestFocus();
                    } else {
                        msg += "\nDateOfBirth: in format MM/DD/YYYY,  day is wrong";
                    }
                }
            }

        } catch (ParseException ex) {
            if (msg == "") {
                msg = "DateOfBirth: in format MM/DD/YYYY";
                txtDOB.requestFocus();
            } else {
                msg += "\nDateOfBirth: in format MM/DD/YYYY";
            }
        }

        if (msg == "") {
            return true;
        }
        JOptionPane.showMessageDialog(this, msg);
        return false;
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
            java.util.logging.Logger.getLogger(ManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
