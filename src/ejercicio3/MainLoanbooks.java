package Ejercicio3;


import javax.swing.*;

public class MainLoanbooks {
    public static void main(String[] args) {
        String loanCode = JOptionPane.showInputDialog(null, "Enter the loan code: ");
        String loanDate = JOptionPane.showInputDialog(null, "Enter the loan date: ");
        String bookName = JOptionPane.showInputDialog(null, "Enter the book name: ");
        String userCode = JOptionPane.showInputDialog(null, "Enter the user code: ");
        int loanDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of loan days: "));
        boolean loanStatus = JOptionPane.showConfirmDialog(null, "Is the loan active?", "Loan Status", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        Loanbooks loanbooks = new Loanbooks(loanCode, loanDate, bookName, userCode, loanDays, loanStatus);

        JOptionPane.showMessageDialog(null, loanbooks.toString());
    }
}
