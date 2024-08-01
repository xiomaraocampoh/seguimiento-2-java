package Ejercicio20;

import javax.swing.*;

public class CeluMovilCalculator {
    private int tigoFixedCost = 45000;
    private int tigoInternationalMinuteCost = 200;
    private int tigoDataPackageCost = 12000;

    private int claroFixedCost = 30000;
    private int claroInternationalMinuteCost = 100;
    private int claroDataPackageCost = 18000;

    private int movistarFixedCost = 40000;
    private int movistarInternationalMinuteCost = 250;
    private int movistarDataPackageCost = 8000;

    private String operator;
    private int internationalMinutes;
    private double totalCost;

    public CeluMovilCalculator(String operator, int internationalMinutes) {
        this.operator = operator;
        this.internationalMinutes = internationalMinutes;
        this.totalCost = calculateTotalCost();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getInternationalMinutes() {
        return internationalMinutes;
    }

    public void setInternationalMinutes(int internationalMinutes) {
        this.internationalMinutes = internationalMinutes;
        this.totalCost = calculateTotalCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    private double calculateTotalCost() {
        return getFixedCost() + (getInternationalMinuteCost() * internationalMinutes) + getDataPackageCost();
    }

    private int getFixedCost() {
        switch (operator) {
            case "Tigo":
                return tigoFixedCost;
            case "Claro":
                return claroFixedCost;
            case "Movistar":
                return movistarFixedCost;
            default:
                return 0;
        }
    }

    private int getInternationalMinuteCost() {
        switch (operator) {
            case "Tigo":
                return tigoInternationalMinuteCost;
            case "Claro":
                return claroInternationalMinuteCost;
            case "Movistar":
                return movistarInternationalMinuteCost;
            default:
                return 0;
        }
    }

    private int getDataPackageCost() {
        switch (operator) {
            case "Tigo":
                return tigoDataPackageCost;
            case "Claro":
                return claroDataPackageCost;
            case "Movistar":
                return movistarDataPackageCost;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Total cost for %s:\nFixed cost: $%d\nInternational minute cost: $%d\nData package cost: $%d\nTotal: $%.2f",
                operator,
                getFixedCost(),
                getInternationalMinuteCost(),
                getDataPackageCost(),
                totalCost);
    }

    public void requestOperatorAndCalculateCost() {
        String[] options = {"Tigo", "Claro", "Movistar"};
        operator = (String) JOptionPane.showInputDialog(null, "Select your operator:",
                "Operator Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (operator == null) {
            JOptionPane.showMessageDialog(null, "No operator selected.");
            return;
        }

        internationalMinutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of international minutes: "));
        this.totalCost = calculateTotalCost();
        JOptionPane.showMessageDialog(null, toString());
    }
}
