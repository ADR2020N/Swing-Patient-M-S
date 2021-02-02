/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Doctor;
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
public class DoctorDao {
    public String create(Doctor doctor) {
        String msg = "";
        String query = "insert into doctors(doctorName,department) values(?, ?)";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setString(1, doctor.getDoctorName());
            pst.setString(2, doctor.getDepartment());
            
            pst.executeUpdate();
            msg = "Doctor Successfully Saved";
        } catch (SQLException ex) {
            msg = "Something went Wrong";
        }
        return msg;
   }
   public String update(Doctor doctor) {
        String msg = "";
        String query ="UPDATE doctors SET doctorName=?,department=? WHERE doctorId=?";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setString(1, doctor.getDoctorName());
            pst.setString(2, doctor.getDepartment());
            pst.setInt(3, doctor.getDoctorId());
            
            pst.executeUpdate();
            msg ="Doctor Successfully Updated";
        } catch (SQLException ex) {
            msg=ex.getMessage();
           // msg ="Something went Wrong";
        }
        return msg;
    }
   public String delete(Doctor doctor) {
        String msg = "";
        String query ="DELETE from doctors WHERE doctorId=?";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setInt(1, doctor.getDoctorId());
            pst.executeUpdate();
            msg ="Doctor Successfully Deleted";
        } catch (SQLException ex) {
            msg=ex.getMessage();
           // msg ="Something went Wrong";
        }
        return msg;
    }
   public Doctor getById(String id) throws SQLException{
       String query = "select * from doctors where doctorName = ?";
       PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
       pst.setString(1, id);
       ResultSet s = pst.executeQuery();
       Doctor d = new Doctor();
       while(s.next()){
       d.setDoctorId(s.getInt(1));
       d.setDoctorName(s.getString(2));
       d.setDepartment(s.getString(3));
       }
   return d;
   
   }
   public List<Doctor> getAll() {
        List<Doctor> doctorList =new ArrayList<>();
        String sql = "select * from doctors";
        try {
            PreparedStatement pst = ConnectDB.connection().prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Doctor doctor=new Doctor();
                doctor.setDoctorId(result.getInt(1));
                doctor.setDoctorName(result.getString(2));
                doctor.setDepartment(result.getString(3));
                doctorList.add(doctor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctorList;
    }
}
