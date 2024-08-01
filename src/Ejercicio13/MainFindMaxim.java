package Ejercicio13;

import javax.swing.*;

public class MainFindMaxim {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number: "));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number: "));
        double number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third number: "));

        FindMaxim findMaxim = new FindMaxim(number1, number2, number3);
        JOptionPane.showMessageDialog(null, findMaxim.toString());
        JOptionPane.showMessageDialog(null, findMaxim.determineMax());
    }
}
