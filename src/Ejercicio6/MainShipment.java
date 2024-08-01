package Ejercicio6;

import javax.swing.*;

public class MainShipment {
    public static void main(String[] args) {
        int trackingNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Tracking Number: "));
        String date = JOptionPane.showInputDialog(null, "Date: ");
        String packagingType = JOptionPane.showInputDialog(null, "Packaging Type: ");
        String customerID = JOptionPane.showInputDialog(null, "Customer ID: ");
        int weight = Integer.parseInt(JOptionPane.showInputDialog(null, "Weight: "));
        String originCity = JOptionPane.showInputDialog(null, "Origin City: ");
        String destinationCity = JOptionPane.showInputDialog(null, "Destination City: ");
        int cost = Integer.parseInt(JOptionPane.showInputDialog(null, "Cost: "));
        String deliveryStatus = JOptionPane.showInputDialog(null, "Delivery Status (Pending/Delivered): ");

        Shipment shipment = new Shipment(trackingNumber, date, packagingType, customerID, weight, originCity, destinationCity, cost, deliveryStatus);

        JOptionPane.showMessageDialog(null, shipment.toString());
        shipment.calculateCostPerKilo();
        shipment.verifyDeliveryStatus();
    }
}
