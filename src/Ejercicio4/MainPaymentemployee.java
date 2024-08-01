package Ejercicio4;

import javax.swing.*;

public class MainPaymentemployee {
    public static void main(String[] args) {
        int codeEmploye = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your employee code: "));
        int basicSalary = 1300000;
        int overtimeHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your total overtime hours: "));
        int numHours = 8;
        int bonus = 15000;
        int deductions = 12000;

        Paymentemployee payment = new Paymentemployee(codeEmploye, basicSalary, overtimeHours, numHours, bonus, deductions);

        JOptionPane.showMessageDialog(null, payment.toString());
    }
}