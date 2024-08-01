package Ejercicio7;

import javax.swing.*;

public class MainComplaintManagment {
    public static void main(String[] args) {
        int complaintNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Complaint Number: "));
        String personName = JOptionPane.showInputDialog(null, "Person Name: ");
        String subject = JOptionPane.showInputDialog(null, "Subject: ");
        String complaintDescription = JOptionPane.showInputDialog(null, "Complaint Description: ");
        String complaintStatus = JOptionPane.showInputDialog(null, "Complaint Status (Pending/Resolved): ");

        ComplaintManagment complaintManagment = new ComplaintManagment(complaintNumber, personName, subject, complaintDescription, complaintStatus);

        JOptionPane.showMessageDialog(null, complaintManagment.toString());
        complaintManagment.validateComplaintStatus();
        JOptionPane.showMessageDialog(null, "Your complaint has been received successfully.");
    }
}
