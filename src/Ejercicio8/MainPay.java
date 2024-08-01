package Ejercicio8;

import javax.swing.*;

public class MainPay {
    public static void main(String[] args) {
        String nameEmploye = JOptionPane.showInputDialog(null, "Enter your Name: ");
        int hoursWork = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your hours worked: "));

        Pay pay = new Pay(nameEmploye, hoursWork);

        JOptionPane.showMessageDialog(null, pay.toString());
        pay.message();
    }
}
