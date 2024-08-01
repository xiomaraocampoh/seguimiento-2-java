package Ejercicio4;

import javax.swing.*;

public class Paymentemployee {
        private int codeEmploye;
        private int basicSalary;
        private int overtimeHours;
        private int numHours;
        private int bonus;
        private int deductions;
        private int net;

        public Paymentemployee(int codeEmploye, int basicSalary, int overtimeHours, int numHours, int bonus, int deductions) {
            this.codeEmploye = codeEmploye;
            this.basicSalary = basicSalary;
            this.overtimeHours = overtimeHours;
            this.numHours = numHours;
            this.bonus = bonus;
            this.deductions = deductions;
            calculateNetSalary();
        }

        public int getCodeEmploye() {
            return codeEmploye;
        }

        public void setCodeEmploye(int codeEmploye) {
            this.codeEmploye = codeEmploye;
        }

        public int getBasicSalary() {
            return basicSalary;
        }

        public void setBasicSalary(int basicSalary) {
            this.basicSalary = basicSalary;
        }

        public int getOvertimeHours() {
            return overtimeHours;
        }

        public void setOvertimeHours(int overtimeHours) {
            this.overtimeHours = overtimeHours;
        }

        public int getNumHours() {
            return numHours;
        }

        public void setNumHours(int numHours) {
            this.numHours = numHours;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int getDeductions() {
            return deductions;
        }

        public void setDeductions(int deductions) {
            this.deductions = deductions;
        }

        public int getNet() {
            return net;
        }

        private void calculateNetSalary() {
            int overtimePayment = overtimeHours * (basicSalary / numHours);
            this.net = basicSalary + bonus + overtimePayment - deductions;
        }

        @Override
        public String toString() {
            return "Employee Payment Details:\n" +
                    "Employee Code: " + codeEmploye + "\n" +
                    "Basic Salary: $" + basicSalary + "\n" +
                    "Overtime Hours: " + overtimeHours + "\n" +
                    "Bonus: $" + bonus + "\n" +
                    "Deductions: $" + deductions + "\n" +
                    "Net Salary: $" + net;
        }
}