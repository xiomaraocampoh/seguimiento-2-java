package Ejercicio8;

import javax.swing.*;

public class Pay {
    private String NameEmploye;
    public int hoursWork;

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public String getNameEmploye() {
        return NameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        NameEmploye = nameEmploye;
    }

    public void message(){
        JOptionPane.showMessageDialog(null, "Mr/Mrs " + getNameEmploye() + " for working " + hoursWork + " hours, your pay is: " + ((hoursWork <= 10)?" 30000 dollars":" 33000 dollars"));
    }
}

