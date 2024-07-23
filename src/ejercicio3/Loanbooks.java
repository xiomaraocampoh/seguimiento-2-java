package Ejercicio3;

import javax.swing.*;

public class Loanbooks {
    private String loanCode;
    private String loanDate;
    private String bookName;
    private String userCode;
    private int loanDays;
    private boolean loanStatus = true;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public boolean isLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(boolean loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void createLoan() {
        loanCode = JOptionPane.showInputDialog(null, "Enter the loan code: ");
        loanDate = JOptionPane.showInputDialog(null, "Enter the loan date: ");
        bookName = JOptionPane.showInputDialog(null, "Enter the name of the book: ");
        userCode = JOptionPane.showInputDialog(null, "Enter the user code: ");
        loanDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of loan days: "));
        String message = loanStatus ? "Loan Confirmed" : "Loan Denied";
        JOptionPane.showMessageDialog(null, message);
    }

    public void consultLoanStatus() {
        JOptionPane.showMessageDialog(null, "Loan Status: " + loanStatus);
    }

    public void consultLoanDetails() {
        JOptionPane.showMessageDialog(null, "Loan Details:\n" +
                "Loan Code: " + loanCode + "\n" +
                "Loan Date: " + loanDate + "\n" +
                "Book Name: " + bookName + "\n" +
                "User Code: " + userCode + "\n" +
                "Loan Days: " + loanDays + "\n" +
                "Loan Status: " + loanStatus);
    }

    @Override
    public String toString() {
        return "Loanbooks{" +
                "bookName='" + bookName + '\'' +
                ", loanCode='" + loanCode + '\'' +
                ", loanDate='" + loanDate + '\'' +
                ", userCode='" + userCode + '\'' +
                ", loanDays=" + loanDays +
                ", loanStatus=" + loanStatus +
                '}';
    }
}