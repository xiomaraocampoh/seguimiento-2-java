package Ejercicio21;

import javax.swing.*;

public class Sandwich {
    private int smallSandwich = 6000;
    private int bigSandwich = 12000;
    private int beacon = 3000;
    private int turkey = 3000;
    private int cheese = 2500;

    private int sandwichType;
    private int extraChili;
    private int extraBeacon;
    private int extraTurkey;
    private int extraCheese;
    private int totalCost;

    public Sandwich(int sandwichType, int extraChili, int extraBeacon, int extraTurkey, int extraCheese) {
        this.sandwichType = sandwichType;
        this.extraChili = extraChili;
        this.extraBeacon = extraBeacon;
        this.extraTurkey = extraTurkey;
        this.extraCheese = extraCheese;
        this.totalCost = calculateTotalCost();
    }

    public Sandwich() {
        this(0, 0, 0, 0, 0); // Default constructor
    }

    public int getSandwichType() {
        return sandwichType;
    }

    public void setSandwichType(int sandwichType) {
        this.sandwichType = sandwichType;
    }

    public int getExtraChili() {
        return extraChili;
    }

    public void setExtraChili(int extraChili) {
        this.extraChili = extraChili;
        updateTotalCost();
    }

    public int getExtraBeacon() {
        return extraBeacon;
    }

    public void setExtraBeacon(int extraBeacon) {
        this.extraBeacon = extraBeacon;
        updateTotalCost();
    }

    public int getExtraTurkey() {
        return extraTurkey;
    }

    public void setExtraTurkey(int extraTurkey) {
        this.extraTurkey = extraTurkey;
        updateTotalCost();
    }

    public int getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(int extraCheese) {
        this.extraCheese = extraCheese;
        updateTotalCost();
    }

    public int getTotalCost() {
        return totalCost;
    }

    private void updateTotalCost() {
        this.totalCost = calculateTotalCost();
    }

    private int calculateTotalCost() {
        int baseCost = (sandwichType == 1) ? bigSandwich : smallSandwich;
        return baseCost + (extraBeacon * beacon) + (extraTurkey * turkey) + (extraCheese * cheese);
    }

    @Override
    public String toString() {
        String type = (sandwichType == 1) ? "Big sandwich" : "Small sandwich";
        return String.format("Order Summary:\nType: %s\nChili: %d\nBeacon: %d\nTurkey: %d\nCheese: %d\nTotal Cost: $%d",
                type, extraChili, extraBeacon, extraTurkey, extraCheese, totalCost);
    }

    public void requestSandwichOrder() {
        sandwichType = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to the Sandwich Order\n" +
                "Choose one type of sandwich:\n1. Big\n2. Small"));

        int decisionCase = JOptionPane.showConfirmDialog(null, "Would you like any extra additions to your sandwich?");
        if (decisionCase == JOptionPane.YES_OPTION) {
            int extraChili = 0;
            int extraBeacon = 0;
            int extraTurkey = 0;
            int extraCheese = 0;
            boolean check = true;

            while (check) {
                int decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose the options you want to add and enter 5 to finish your order:\n" +
                        "1. Chili\n2. Beacon\n3. Turkey\n4. Cheese\n5. Continue"));

                switch (decision) {
                    case 1:
                        extraChili++;
                        break;
                    case 2:
                        extraBeacon++;
                        break;
                    case 3:
                        extraTurkey++;
                        break;
                    case 4:
                        extraCheese++;
                        break;
                    case 5:
                        this.extraChili = extraChili;
                        this.extraBeacon = extraBeacon;
                        this.extraTurkey = extraTurkey;
                        this.extraCheese = extraCheese;
                        updateTotalCost();
                        JOptionPane.showMessageDialog(null, toString());
                        check = false;
                        break;
                }
            }
        } else if (decisionCase == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "The total for a " + ((sandwichType == 1) ? "Big" : "Small") + " sandwich is $" + (sandwichType == 1 ? bigSandwich : smallSandwich) + " dollars");
        }
    }
}
