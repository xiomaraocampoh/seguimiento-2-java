package Ejercicio6;

import javax.swing.JOptionPane;

public class Shipment {

    private int trackingNumber;
    private String date;
    private String packagingType;
    private String customerID;
    private int weight;
    private String originCity;
    private String destinationCity;
    private int cost;
    private String deliveryStatus;

    public Shipment(int trackingNumber, String date, String packagingType, String customerID, int weight, String originCity, String destinationCity, int cost, String deliveryStatus) {
        this.trackingNumber = trackingNumber;
        this.date = date;
        this.packagingType = packagingType;
        this.customerID = customerID;
        this.weight = weight;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.cost = cost;
        this.deliveryStatus = deliveryStatus;
    }

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

    @Override
    public String toString() {
        return "Shipment Details:\n" +
                "Tracking Number: " + trackingNumber + "\n" +
                "Date: " + date + "\n" +
                "Packaging Type: " + packagingType + "\n" +
                "Customer ID: " + customerID + "\n" +
                "Weight: " + weight + "\n" +
                "Origin City: " + originCity + "\n" +
                "Destination City: " + destinationCity + "\n" +
                "Cost: " + cost + "\n" +
                "Delivery Status: " + deliveryStatus;
    }

    public void calculateCostPerKilo() {
        int costPerKilo = cost / weight;
        JOptionPane.showMessageDialog(null, "Cost per kilo is: " + costPerKilo);
    }

    public void verifyDeliveryStatus() {
        if ("Pending".equals(deliveryStatus)) {
            JOptionPane.showMessageDialog(null, "The shipment is pending delivery.");
        } else if ("Delivered".equals(deliveryStatus)) {
            JOptionPane.showMessageDialog(null, "The shipment has been delivered.");
        } else {
            JOptionPane.showMessageDialog(null, "Delivery status not recognized.");
        }
    }
}