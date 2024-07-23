package Ejercicio9;

import javax.swing.*;

public class NumberCheck {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void checkNumber() {
        String message = (number >= 0) ? "The number " + number + " is positive." : "The number " + number + " is negative.";
        JOptionPane.showMessageDialog(null, message);
    }
}
