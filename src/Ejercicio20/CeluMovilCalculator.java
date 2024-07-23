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

    public void requestOperatorAndCalculateCost() {
        String[] options = {"Tigo", "Claro", "Movistar"};
        String operator = (String) JOptionPane.showInputDialog(null, "Select your operator:",
                "Operator Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (operator == null) {
            JOptionPane.showMessageDialog(null, "No operator selected.");
            return;
        }

        int internationalMinutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of international minutes: "));
        double totalCost = calculateTotalCost(operator, internationalMinutes);

        String message = String.format("Total cost for %s:\nFixed cost: $%d\nInternational minute cost: $%d\nData package cost: $%d\nTotal: $%.2f",
                operator,
                getFixedCost(operator),
                getInternationalMinuteCost(operator) * internationalMinutes,
                getDataPackageCost(operator),
                totalCost);

        JOptionPane.showMessageDialog(null, message);
    }

    private double calculateTotalCost(String operator, int internationalMinutes) {
        return getFixedCost(operator) + (getInternationalMinuteCost(operator) * internationalMinutes) + getDataPackageCost(operator);
    }

    private int getFixedCost(String operator) {
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

    private int getInternationalMinuteCost(String operator) {
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

    private int getDataPackageCost(String operator) {
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
}