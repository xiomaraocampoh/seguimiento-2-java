package Ejercicio6;

public class MainShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        shipment.createShipment();
        shipment.showShipmentDetails();
        shipment.calculateCostPerKilo();
        shipment.verifyDeliveryStatus();
    }
}
