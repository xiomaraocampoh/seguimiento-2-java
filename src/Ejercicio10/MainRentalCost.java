package Ejercicio10;

import javax.swing.*;

public class MainRentalCost {
    public static void main(String[] args){
        int washerType = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 for large washer or 2 for small washer: "));
        int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hours: "));
        int numberOfWashers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of washers: "));

        RentalCost rentalCost = new RentalCost(washerType, hours, numberOfWashers);

        JOptionPane.showMessageDialog(null, rentalCost.toString());
        rentalCost.calculateAndDisplayCost();
    }
}
