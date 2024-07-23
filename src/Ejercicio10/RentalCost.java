package Ejercicio10;

import javax.swing.*;

public class RentalCost {
        private int washerType; // 1 for large, 2 for small
        private int hours;
        private int numberOfWashers;
        int largeWasherRate = 4000;
        int smallWasherRate = 3000;
        int discountThreshold = 3;
        double discountRate = 0.03 ;

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountThreshold() {
        return discountThreshold;
    }

    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getLargeWasherRate() {
        return largeWasherRate;
    }

    public void setLargeWasherRate(int largeWasherRate) {
        this.largeWasherRate = largeWasherRate;
    }

    public int getNumberOfWashers() {
        return numberOfWashers;
    }

    public void setNumberOfWashers(int numberOfWashers) {
        this.numberOfWashers = numberOfWashers;
    }

    public int getSmallWasherRate() {
        return smallWasherRate;
    }

    public void setSmallWasherRate(int smallWasherRate) {
        this.smallWasherRate = smallWasherRate;
    }

    public int getWasherType() {
        return washerType;
    }

    public void setWasherType(int washerType) {
        this.washerType = washerType;
    }
    public void calculateAndDisplayCost(){
        int rate = (washerType == 1) ? largeWasherRate : smallWasherRate;
        double totalCost = rate * hours * numberOfWashers;
        if (numberOfWashers > discountThreshold) {
            totalCost -= totalCost * discountRate;
        }

        JOptionPane.showMessageDialog(null, "The total cost is: " + totalCost + " dollars.");
    }

}
