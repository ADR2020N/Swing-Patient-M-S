/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Appointment;
import Domain.Doctor;
import Domain.Patient;
import Utility.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author N.Adrien
 */
public class AppointmentDao {
    public String create(Appointment appointment) {
        String msg = "";
        String query = "insert into appointment(patientId,doctorId) values(?, ?)";
        try {

            PreparedStatement pst = ConnectDB.connection().prepareStatement(query);
            pst.setInt(1, appointment.getPatient().getpId());
            pst.setInt(2, appointment.getDoctor().getDoctorId());
            pst.executeUpdate();
            msg = "Appointment Successfully Saved";
        } catch (SQLException ex) {
            msg = ex.getMessage();
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
   public List<Appointment> getAll() {
        List<Appointment> aptList =new ArrayList<>();
        String sql = "select * from appointment a, patients p,doctors d where a.patientId=p.patientId and a.doctorId=d.doctorId";
        try {
            PreparedStatement pst = ConnectDB.connection().prepareStatement(sql);
            ResultSet result = pst.executeQuery();
           List<Patient> patientList = new PatientDao().getAll();
           List<Doctor> doctorList = new DoctorDao().getAll();
            while (result.next()) {
               Appointment apt =new Appointment();
               apt.setAppInt(result.getInt(1));
               for(Patient p : patientList){
               if(p.getpId()== result.getInt(2)){
               apt.setPatient(p);
               }
               }
               for(Doctor d : doctorList){
               
               if(d.getDoctorId()== result.getInt(3)){
               apt.setDoctor(d);
               }
               }
               aptList.add(apt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aptList;
    }
   
}
