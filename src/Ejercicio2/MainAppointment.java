package Ejercicio2;

import javax.swing.*;

public class MainAppointment {
    public static void main(String[] args) {
        String appointmentCode = JOptionPane.showInputDialog(null, "Enter the appointment code: ");
        String date = JOptionPane.showInputDialog(null, "Enter the date of the appointment: ");
        String time = JOptionPane.showInputDialog(null, "Enter the time of the appointment: ");
        String office = JOptionPane.showInputDialog(null, "Enter the office: ");
        String doctorName = JOptionPane.showInputDialog(null, "Enter the doctor's name: ");
        String patientName = JOptionPane.showInputDialog(null, "Enter the patient's name: ");
        String medicalCenter = JOptionPane.showInputDialog(null, "Enter the medical center: ");

        Appointment appointment = new Appointment(appointmentCode, date, time, office, doctorName, patientName, medicalCenter);

        appointment.consultAppointmentDetails();
    }
}
