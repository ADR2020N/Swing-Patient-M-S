/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Gender;
import Domain.Patient;
import Utility.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author N.Adrien
 */
public class PatientDao {
   public String create(Patient patient) {
        String msg = "";
        String query = "insert into patients(patient_name,weight,gender,address,age,phone,desease) values(?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setString(1, patient.getpName());
            pst.setDouble(2, patient.getWeight());
            pst.setString(3, patient.getGender().toString());
            pst.setString(4, patient.getAddress());
            pst.setInt(5, patient.getAge());
            pst.setString(6, patient.getPhone());
            pst.setString(7, patient.getDesease());
            pst.executeUpdate();
            msg = "Successfully Saved";
        } catch (SQLException ex) {
            msg = "Something went Wrong";
        }
        return msg;
   }
   public String update(Patient patient) {
        String msg = "";
        String query ="UPDATE patients SET patient_name=?,weight=?,gender=?,address=?,age=?,phone=?,desease=? WHERE patientId=?";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setString(1, patient.getpName());
            pst.setDouble(2, patient.getWeight());
            pst.setString(3, patient.getGender().toString());
            pst.setString(4, patient.getAddress());
            pst.setInt(5, patient.getAge());
            pst.setString(6, patient.getPhone());
            pst.setString(7, patient.getDesease());
            pst.setInt(8, patient.getpId());
            pst.executeUpdate();
            msg ="Successfully Updated";
        } catch (SQLException ex) {
            msg=ex.getMessage();
           // msg ="Something went Wrong";
        }
        return msg;
    }
   public String delete(Patient patient) {
        String msg = "";
        String query ="DELETE patients WHERE patientId=?";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setInt(1, patient.getpId());
            pst.executeUpdate();
            msg ="Successfully Deleted";
        } catch (SQLException ex) {
            msg=ex.getMessage();
           // msg ="Something went Wrong";
        }
        return msg;
    }
   public List<Patient> getAll() {
        List<Patient> patientList =new ArrayList<>();
        String sql = "select * from patients";
        try {
            PreparedStatement pst = ConnectDB.connection().prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Patient patient = new Patient();
                patient.setpId(result.getInt(1));
                patient.setpName(result.getString(2));
                patient.setWeight(result.getDouble(3));
                patient.setGender((Gender.valueOf(result.getString(4))));
                patient.setAddress(result.getString(5));
                patient.setAge(result.getInt(6));
                patient.setPhone(result.getString(7));
                patient.setDesease(result.getString(8));
                patientList.add(patient);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientList;
    }
   public Patient getById(String id) throws SQLException{
   PreparedStatement pst = ConnectDB.connection().prepareStatement("Select * from patients where patient_name = ?");
   pst.setString(1, id);
   ResultSet result = pst.executeQuery();
   Patient patient = new Patient();
   while(result.next()){
                patient.setpId(result.getInt(1));
                patient.setpName(result.getString(2));
                patient.setWeight(result.getDouble(3));
   }
   return patient;
   }

}
   

