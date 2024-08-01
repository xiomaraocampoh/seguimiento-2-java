package Ejercicio11;

import javax.swing.*;

public class EvenOdd {

    private int number;

    public EvenOdd(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void checkEvenOdd() {
        String result = (number % 2 == 0) ? "The number " + number + " is even." : "The number " + number + " is odd.";
        JOptionPane.showMessageDialog(null, result);
    }

    @Override
    public String toString() {
        return "EvenOdd{" +
                "number=" + number +
                '}';
    }
}

