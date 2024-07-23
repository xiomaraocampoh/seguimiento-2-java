package Ejercicio10;

import javax.swing.*;

public class MainRentalCost {
    public static void main(String[] args) {
        RentalCost rentalCost = new RentalCost();
        int washerType = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for large washer or 2 for small washer: "));
        rentalCost.setWasherType(washerType);

        int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hours: "));
        rentalCost.setHours(hours);

        int numberOfWashers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of washers: "));
        rentalCost.setNumberOfWashers(numberOfWashers);
        rentalCost.calculateAndDisplayCost();
    }
}
