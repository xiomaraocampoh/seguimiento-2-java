package Ejercicio9;

import javax.swing.*;

public class MainNumberCheck {
    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        numberCheck.setNumber(number);
        numberCheck.checkNumber();
    }
}
