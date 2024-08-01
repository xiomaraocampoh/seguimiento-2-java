package Ejercicio15;

import javax.swing.*;

public class GYM {

    private int days;
    private int amount;

    public GYM(int days, int amount) {
        this.days = days;
        this.amount = amount;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void menuPay() {
        int decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Gym menu \n Which monthly plan do you want to pay for? \n 1. 15 days = 18000 \n 2. 30 days = 35000 \n 3. 3 months = 86000 \n 4. Exit"));

        switch (decision) {
            case 1:
                handlePayment(15, 18000);
                break;
            case 2:
                handlePayment(30, 35000);
                break;
            case 3:
                handlePayment(90, 86000);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Exiting the system.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
        }
    }

    private void handlePayment(int days, int amount) {
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay " + amount + " for " + days + " days?");
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Your payment has been successfully processed.");
        } else {
            JOptionPane.showMessageDialog(null, "Your payment has been canceled.");
        }
    }

    @Override
    public String toString() {
        return String.format("GYM{days: %d, amount: %d}", days, amount);
    }
}

