package Ejercicio3;

import javax.swing.*;

public class Loanbooks {

        private String loanCode;
        private String loanDate;
        private String bookName;
        private String userCode;
        private int loanDays;
        private boolean loanStatus;

        // Constructor para inicializar todos los campos
        public Loanbooks(String loanCode, String loanDate, String bookName, String userCode, int loanDays, boolean loanStatus) {
            this.loanCode = loanCode;
            this.loanDate = loanDate;
            this.bookName = bookName;
            this.userCode = userCode;
            this.loanDays = loanDays;
            this.loanStatus = loanStatus;
        }

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

        @Override
        public String toString() {
            return "Loan Details:\n" +
                    "Loan Code: " + loanCode + "\n" +
                    "Loan Date: " + loanDate + "\n" +
                    "Book Name: " + bookName + "\n" +
                    "User Code: " + userCode + "\n" +
                    "Loan Days: " + loanDays + "\n" +
                    "Loan Status: " + (loanStatus ? "Active" : "Completed");
        }
}
