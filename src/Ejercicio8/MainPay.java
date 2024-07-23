package Ejercicio8;

import javax.swing.*;

public class MainPay {
    public static void main(String[] args) {
    Pay pay = new Pay();
        pay.setNameEmploye(JOptionPane.showInputDialog(null,"Enter your Name: "));
        pay.hoursWork = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your hours worked: "));
        pay.message();

    }
}
