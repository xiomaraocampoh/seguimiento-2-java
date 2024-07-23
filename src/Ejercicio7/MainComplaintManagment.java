package Ejercicio7;

public class MainComplaintManagment {
    public static void main(String[] args) {
        ComplaintManagment complaintManagment = new ComplaintManagment();
        complaintManagment.createComplaint();
        complaintManagment.showComplaintDescription();
        complaintManagment.showReceptionMessage();
        complaintManagment.validateComplaintStatus();
    }
}
