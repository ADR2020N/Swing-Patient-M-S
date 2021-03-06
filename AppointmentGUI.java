/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dao.AppointmentDao;
import Dao.DoctorDao;
import Dao.PatientDao;
import Domain.Appointment;
import Domain.Doctor;
import Domain.Patient;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author N.Adrien
 */
public final class AppointmentGUI extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentGUI
     */
    public AppointmentGUI() {
        initComponents();
        patientsFillCombo();
        doctorsFillCombo();
        doctorsList();
        populatePatTable();
        appointmentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void patientsFillCombo() {
        List<Patient> listPat = getAll();
        for (Patient patient : listPat) {
            String id = patient.getpName();
            patient_combo.addItem(id);
        }

    }

    public void doctorsFillCombo() {
        List<Doctor> list = getDocts();
        for (Doctor doc : list) {
            String id = doc.getDoctorName();
            doctor_combo.addItem(id);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        patient_combo = new javax.swing.JComboBox<>();
        doctor_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        patTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        docNameTxt = new javax.swing.JTextField();
        patNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("            Appointment Form ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("AppointmentId");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Doctor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Patient");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        patient_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patient_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_comboActionPerformed(evt);
            }
        });

        doctor_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        doctor_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_comboActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Update");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Delete");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        appointTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pateint ID", "Doctor ID"
            }
        ));
        appointTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appointTable);

        patTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "weight"
            }
        ));
        patTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(patTable);

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Dapartmet"
            }
        ));
        docTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(docTable);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        docNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameTxtActionPerformed(evt);
            }
        });

        patNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patNameTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Doctor Name :");

        jLabel6.setText("Patient Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patient_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctor_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctor_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    private void patient_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_comboActionPerformed
    public List<Patient> getAll() {
        List<Patient> patientList = new PatientDao().getAll();
        return patientList;
    }

    public List<Doctor> getDocts() {
        List<Doctor> doctorsList = new DoctorDao().getAll();
        return doctorsList;
    }

    public void populatePatTable() {
        List<Patient> list = getAll();
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        Object[] rows = new Object[3];
        model.setRowCount(0);
        for (Patient p : list) {
            rows[0] = p.getpId();
            rows[1] = p.getpName();
            rows[2] = p.getWeight();
            model.addRow(rows);

        }
    }

    public void doctorsList() {
        List<Doctor> list = getDocts();
        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
        Object[] rows = new Object[3];
        model.setRowCount(0);
        for (Doctor d : list) {
            rows[0] = d.getDoctorId();
            rows[1] = d.getDoctorName();
            rows[2] = d.getDepartment();
            model.addRow(rows);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        doctor_combo.removeAllItems();
        patient_combo.removeAllItems();

        Patient p = new Patient();
        p.setpId(patientId);
        p.setpName(patientName);
        p.setWeight(weight);

        Doctor doc = new Doctor();
        doc.setDoctorId(id);
        doc.setDoctorName(name);
        doc.setDepartment(dept);

        Appointment appointment = new Appointment();
        appointment.setPatient(p);
        appointment.setDoctor(doc);

//        doctorsFillCombo();
//        patientsFillCombo();
//        List<Patient> patientList = getAll();
//        List<Doctor> docList = getDocts();
//        for(Patient p : patientList){
//        if(p.getpName().equalsIgnoreCase(patient_combo.getSelectedItem().toString())){
//        appointment.setPatient(p);
//        }}
//        for(Doctor d : docList){
//        if(d.getDoctorName().equalsIgnoreCase(doctor_combo.getSelectedItem().toString())){
//        appointment.setDoctor(d);
//        }}
        String msg = new AppointmentDao().create(appointment);
        JOptionPane.showMessageDialog(null, msg);
        appointmentTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void doctor_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_comboActionPerformed
    public void appointmentTable(){
     DefaultTableModel mod = (DefaultTableModel)appointTable.getModel();
        List<Appointment> aptList = new AppointmentDao().getAll();
        Object[] obj = new Object[3];
        mod.setRowCount(0);
        for(Appointment apt : aptList){
        obj[0] = apt.getAppInt();
        obj[1] = apt.getPatient().getpName();
        obj[2] = apt.getDoctor().getDoctorName();
        mod.addRow(obj);
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       appointmentTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void appointTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTableMouseClicked
    
    }//GEN-LAST:event_appointTableMouseClicked
    int patientId;
    String patientName;
    double weight;
    private void patTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patTableMouseClicked
        // TODO add your handling code here:
        int i = patTable.getSelectedRow();
        TableModel model = patTable.getModel();
        patientId = (int) model.getValueAt(i, 0);
        patientName = (String) model.getValueAt(i, 1);
        weight = (double) model.getValueAt(i, 2);
    }//GEN-LAST:event_patTableMouseClicked
    int id;
    String name;
    String dept;
    private void docTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docTableMouseClicked
        // TODO add your handling code here:
        int i = docTable.getSelectedRow();
        TableModel modelDoc = docTable.getModel();
        id = (int) modelDoc.getValueAt(i, 0);
        name = (String) modelDoc.getValueAt(i, 1);
        dept = modelDoc.getValueAt(i, 2).toString();

    }//GEN-LAST:event_docTableMouseClicked
    public void findDoctorById(){
    try {
            // TODO add your handling code here:
            Doctor obj = new DoctorDao().getById(docNameTxt.getText());
            DefaultTableModel model = (DefaultTableModel)docTable.getModel();
            model.setRowCount(0);
            Object [] row = new Object[3];
            row[0] = obj.getDoctorId();
            row[1]=obj.getDoctorName();
            row[2]=obj.getDepartment();
            model.addRow(row);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void findPatientById(){
    try {
            // TODO add your handling code here:
            Patient obj = new PatientDao().getById(patNameTxt.getText());
            DefaultTableModel model = (DefaultTableModel)patTable.getModel();
            model.setRowCount(0);
            Object [] row = new Object[3];
            row[0] = obj.getpId();
            row[1]=obj.getpName();
            row[2]=obj.getWeight();
            model.addRow(row);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
    private void docNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        findDoctorById();
        findPatientById();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void patNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patNameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointTable;
    private javax.swing.JTextField docNameTxt;
    private javax.swing.JTable docTable;
    private javax.swing.JComboBox<String> doctor_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField patNameTxt;
    private javax.swing.JTable patTable;
    private javax.swing.JComboBox<String> patient_combo;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
