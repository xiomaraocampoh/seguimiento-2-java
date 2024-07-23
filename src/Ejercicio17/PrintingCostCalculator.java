package Ejercicio17;

import javax.swing.*;

public class PrintingCostCalculator {
    private int numberOfCopies;

    public void requestCopiesAndCalculateCost() {
        numberOfCopies = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of copies: "));

        double costPerCopy = calculateCostPerCopy(numberOfCopies);
        double totalCost = costPerCopy * numberOfCopies;

        String message = String.format("Cost per copy: $%.2f\nTotal cost: $%.2f", costPerCopy, totalCost);
        JOptionPane.showMessageDialog(null, message);
    }

    private double calculateCostPerCopy(int copies) {
        if (copies >= 1000) {
            return 50.0;
        } else if (copies >= 750) {
            return 80.0;
        } else if (copies >= 500) {
            return 100.0;
        } else {
            return 120.0;
        }
    }
}