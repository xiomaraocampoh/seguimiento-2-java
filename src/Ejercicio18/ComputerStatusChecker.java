package Ejercicio18;

import javax.swing.*;

public class ComputerStatusChecker {
    private boolean beeps;
    private boolean hardDriveSpins;

    public void requestStatusAndCheck() {
        beeps = JOptionPane.showConfirmDialog(null, "Does the computer beep at startup?") == JOptionPane.YES_OPTION;
        hardDriveSpins = JOptionPane.showConfirmDialog(null, "Does the hard drive spin?") == JOptionPane.YES_OPTION;

        String message = determineStatus(beeps, hardDriveSpins);
        JOptionPane.showMessageDialog(null, message);
    }

    private String determineStatus(boolean beeps, boolean hardDriveSpins) {
        if (beeps && hardDriveSpins) {
            return "Contact technical support.";
        } else if (beeps) {
            return "Check the unit's connections.";
        } else if (!hardDriveSpins) {
            return "Bring the computer to central repair.";
        } else {
            return "Check the speaker connections.";
        }
    }
}