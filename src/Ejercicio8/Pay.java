package Ejercicio8;

import javax.swing.*;

public class Pay {

    private String nameEmploye;
    private int hoursWork;

    public Pay(String nameEmploye, int hoursWork) {
        this.nameEmploye = nameEmploye;
        this.hoursWork = hoursWork;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public String getNameEmploye() {
        return nameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        this.nameEmploye = nameEmploye;
    }

    public void message() {
        JOptionPane.showMessageDialog(null, "Mr/Mrs " + getNameEmploye() + " for working " + hoursWork + " hours, your pay is: " + ((hoursWork <= 10) ? "30000 dollars" : "33000 dollars"));
    }

    @Override
    public String toString() {
        return "Employee Name: " + nameEmploye + "\n" +
                "Hours Worked: " + hoursWork;
    }
}


