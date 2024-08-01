package Ejercicio9;

import javax.swing.*;

public class MainNumberCheck {
    public static void main(String[] args){
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));

        NumberCheck numberCheck = new NumberCheck(number);

        JOptionPane.showMessageDialog(null, numberCheck.toString());
        numberCheck.checkNumber();
    }
}
