package Ejercicio2;

import javax.swing.*   ;

public class Appoiment {

    private String appointmentCode;
    private String date;
    private String time;
    private String office;
    private String doctorName;
    private String patientName;
    private String medicalCenter;

    public void createAppointment() {
        appointmentCode = JOptionPane.showInputDialog(null, "Enter the appointment code: ");
        date = JOptionPane.showInputDialog(null, "Enter the date of the appointment: ");
        time = JOptionPane.showInputDialog(null, "Enter the time of the appointment: ");
        office = JOptionPane.showInputDialog(null, "Enter the office: ");
        doctorName = JOptionPane.showInputDialog(null, "Enter the doctor's name: ");
        patientName = JOptionPane.showInputDialog(null, "Enter the patient's name: ");
        medicalCenter = JOptionPane.showInputDialog(null, "Enter the medical center: ");
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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(String medicalCenter) {
        this.medicalCenter = medicalCenter;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}