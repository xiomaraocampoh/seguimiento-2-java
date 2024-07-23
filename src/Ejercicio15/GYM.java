package Ejercicio15;

import javax.swing.*;

public class GYM {
    public void menuPay() {
        int decision = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Gymenu \n Witch mensuality do you want to pay? \n 1. 15 days = 18000 \n 2. 30 days = 35000 \n 3. 3 months = 86000 \n 4. Exit"));
        switch (decision) {
            case 1:
                int decision2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay 15000 for 15 days?");
                if (decision2 == JOptionPane.YES_OPTION)
                    JOptionPane.showMessageDialog(null, "Your payment has been successfully porcessed");
                else JOptionPane.showMessageDialog(null, "Your payment has been canceled successfully");
                break;
            case 2:
                int decision3 = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay 30000 for 30 days?");
                if (decision3 == JOptionPane.YES_OPTION)
                    JOptionPane.showMessageDialog(null, "Your payment has been successfully porcessed");
                else JOptionPane.showMessageDialog(null, "Your payment has been canceled successfully");
                break;
            case 3:
                int decision4 = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay 86000 for 3 months?");
                if (decision4 == JOptionPane.YES_OPTION)
                    JOptionPane.showMessageDialog(null, "Your payment has been successfully porcessed");
                else JOptionPane.showMessageDialog(null, "Your payment has been canceled successfully");
                break;
            case 4:
                break;

        }
    }
}
