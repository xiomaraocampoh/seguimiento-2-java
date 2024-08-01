package Ejercicio18;

import javax.swing.*;

public class ComputerStatusChecker {
    private boolean beeps;
    private boolean hardDriveSpins;

    public ComputerStatusChecker(boolean beeps, boolean hardDriveSpins) {
        this.beeps = beeps;
        this.hardDriveSpins = hardDriveSpins;
    }

    public boolean isBeeps() {
        return beeps;
    }

    public void setBeeps(boolean beeps) {
        this.beeps = beeps;
    }

    public boolean isHardDriveSpins() {
        return hardDriveSpins;
    }

    public void setHardDriveSpins(boolean hardDriveSpins) {
        this.hardDriveSpins = hardDriveSpins;
    }

    public String determineStatus() {
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

    @Override
    public String toString() {
        return determineStatus();
    }

    public void requestStatusAndCheck() {
        setBeeps(JOptionPane.showConfirmDialog(null, "Does the computer beep at startup?") == JOptionPane.YES_OPTION);
        setHardDriveSpins(JOptionPane.showConfirmDialog(null, "Does the hard drive spin?") == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, toString());
    }
}