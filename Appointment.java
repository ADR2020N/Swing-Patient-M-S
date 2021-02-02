/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;

/**
 *
 * @author N.Adrien
 */
public class Appointment implements Serializable {
    private int appInt;
    private Patient patient;
    private Doctor doctor;

    public int getAppInt() {
        return appInt;
    }

    public void setAppInt(int appInt) {
        this.appInt = appInt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
}
