package Ejercicio6;

import javax.swing.JOptionPane;

public class Shipment {
    public int trackingNumber;
    private String date;
    private String packagingType;
    public String customerID;
    public int weight;
    public String originCity;
    public String destinationCity;
    public int cost;
    private String deliveryStatus;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void createShipment() {
        JOptionPane.showMessageDialog(null, "Please enter the shipment details.");

        trackingNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Tracking Number: "));
        setDate(JOptionPane.showInputDialog(null, "Date: "));
        setPackagingType(JOptionPane.showInputDialog(null, "Packaging Type: "));
        customerID = JOptionPane.showInputDialog(null, "Customer ID: ");
        weight = Integer.parseInt(JOptionPane.showInputDialog(null, "Weight: "));
        originCity = JOptionPane.showInputDialog(null, "Origin City: ");
        destinationCity = JOptionPane.showInputDialog(null, "Destination City: ");
        cost = Integer.parseInt(JOptionPane.showInputDialog(null, "Cost: "));
        setDeliveryStatus(JOptionPane.showInputDialog(null, "Delivery Status (Pending/Delivered): "));

        JOptionPane.showMessageDialog(null, "Shipment created successfully");
    }

    public void showShipmentDetails() {
        JOptionPane.showMessageDialog(null, "Shipment Details:\n" +
                "Tracking Number: " + trackingNumber + "\n" +
                "Date: " + getDate() + "\n" +
                "Packaging Type: " + getPackagingType() + "\n" +
                "Customer ID: " + customerID + "\n" +
                "Weight: " + weight + "\n" +
                "Origin City: " + originCity + "\n" +
                "Destination City: " + destinationCity + "\n" +
                "Cost: " + cost + "\n" +
                "Delivery Status: " + getDeliveryStatus());
    }

    public void calculateCostPerKilo() {
        int costPerKilo = cost / weight;
        JOptionPane.showMessageDialog(null, "Cost per kilo is: " + costPerKilo);
    }

    public void verifyDeliveryStatus() {
        if ("Pending".equals(getDeliveryStatus())) {
            JOptionPane.showMessageDialog(null, "The shipment is pending delivery.");
        } else if ("Delivered".equals(getDeliveryStatus())) {
            JOptionPane.showMessageDialog(null, "The shipment has been delivered.");
        } else {
            JOptionPane.showMessageDialog(null, "Delivery status not recognized.");
        }
    }

    public void showReceptionMessage() {
        JOptionPane.showMessageDialog(null, "Your shipment has been received successfully.");
    }
}
