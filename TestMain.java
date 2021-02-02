/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Domain.Doctor;
import java.sql.SQLException;


/**
 *
 * @author Natcom
 */
public class TestMain {
    public static void main(String[] args) throws SQLException {
        findAllApp();
    }
    public static void findAllApp() throws SQLException{
        
    Doctor obj = new DoctorDao().getById("Nkurikiyumukiza");
        System.out.println(obj.getDoctorId());
        System.out.println(obj.getDoctorName());
        System.out.println(obj.getDepartment());
    
    }
}
