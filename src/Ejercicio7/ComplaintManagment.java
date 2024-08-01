package Ejercicio7;

import javax.swing.*;

import javax.swing.JOptionPane;

public class ComplaintManagment {

    private int complaintNumber;
    private String personName;
    private String subject;
    private String complaintDescription;
    private String complaintStatus;

    public ComplaintManagment(int complaintNumber, String personName, String subject, String complaintDescription, String complaintStatus) {
        this.complaintNumber = complaintNumber;
        this.personName = personName;
        this.subject = subject;
        this.complaintDescription = complaintDescription;
        this.complaintStatus = complaintStatus;
    }

    public int getComplaintNumber() {
        return complaintNumber;
    }

    public void setComplaintNumber(int complaintNumber) {
        this.complaintNumber = complaintNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    @Override
    public String toString() {
        return "Complaint Description:\n" +
                "Complaint Number: " + complaintNumber + "\n" +
                "Person Name: " + personName + "\n" +
                "Subject: " + subject + "\n" +
                "Description: " + complaintDescription + "\n" +
                "Status: " + complaintStatus;
    }

    public void validateComplaintStatus() {
        if ("Pending".equals(complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint is pending review.");
        } else if ("Resolved".equals(complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint has been resolved.");
        } else {
            JOptionPane.showMessageDialog(null, "Complaint status not recognized.");
        }
    }
}
