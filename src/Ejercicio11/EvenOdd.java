package Ejercicio11;

import javax.swing.*;

public class EvenOdd {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void requestNumberAndCheck() {
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        checkEvenOdd();
    }

    private void checkEvenOdd() {
        String result = (number % 2 == 0) ? "The number " + number + " is even." : "The number " + number + " is odd.";
        JOptionPane.showMessageDialog(null, result);
    }
}
