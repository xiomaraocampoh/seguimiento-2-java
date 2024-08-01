package Ejercicio2;

import javax.swing.*;

public class Appointment {

    private String appointmentCode;
    private String date;
    private String time;
    private String office;
    private String doctorName;
    private String patientName;
    private String medicalCenter;

    // Constructor para inicializar todos los campos
    public Appointment(String appointmentCode, String date, String time, String office,
                       String doctorName, String patientName, String medicalCenter) {
        this.appointmentCode = appointmentCode;
        this.date = date;
        this.time = time;
        this.office = office;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.medicalCenter = medicalCenter;
    }

    public void consultAppointmentDetails() {
        JOptionPane.showMessageDialog(null, "Appointment Details:\n" +
                "Appointment Code: " + appointmentCode + "\n" +
                "Date: " + date + "\n" +
                "Time: " + time + "\n" +
                "Office: " + office + "\n" +
                "Doctor's Name: " + doctorName + "\n" +
                "Patient's Name: " + patientName + "\n" +
                "Medical Center: " + medicalCenter);
    }

    public String getAppointmentCode() {
        return appointmentCode;
    }

    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(String medicalCenter) {
        this.medicalCenter = medicalCenter;
    }
}
