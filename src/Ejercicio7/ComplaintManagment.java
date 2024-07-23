package Ejercicio7;

import javax.swing.*;

import javax.swing.JOptionPane;

public class ComplaintManagment {
    public int complaintNumber;
    private String personName;
    private String subject;
    public String complaintDescription;
    private String complaintStatus;

    public void createComplaint() {
        JOptionPane.showMessageDialog(null, "Please enter the complaint details.");

        complaintNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Complaint Number: "));
        setPersonName(JOptionPane.showInputDialog(null, "Person Name: "));
        setSubject(JOptionPane.showInputDialog(null, "Subject: "));
        complaintDescription = JOptionPane.showInputDialog(null, "Complaint Description: ");
        setComplaintStatus(JOptionPane.showInputDialog(null, "Complaint Status (Pending/Resolved): "));

        JOptionPane.showMessageDialog(null, "Complaint created successfully");
    }

    public void showComplaintDescription() {
        JOptionPane.showMessageDialog(null, "Complaint Description:\n" +
                "Complaint Number: " + complaintNumber + "\n" +
                "Person Name: " + personName + "\n" +
                "Subject: " + subject + "\n" +
                "Description: " + complaintDescription + "\n" +
                "Status: " + complaintStatus);
    }

    public void validateComplaintStatus() {
        if ("Pending".equals(this.complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint is pending review.");
        } else if ("Resolved".equals(this.complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint has been resolved.");
        } else {
            JOptionPane.showMessageDialog(null, "Complaint status not recognized.");
        }
    }

    public void showReceptionMessage() {
        JOptionPane.showMessageDialog(null, "Your complaint has been received successfully.");
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public void setComplaintNumber(int complaintNumber) {
        this.complaintNumber = complaintNumber;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
