package Ejercicio19;

import javax.swing.*;

public class CarModelChecker {
    private int carModel;

    public CarModelChecker(int carModel) {
        this.carModel = carModel;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    private boolean isDefectiveModel() {
        return carModel == 119 || carModel == 179 || (carModel >= 189 && carModel <= 195) || carModel == 221 || carModel == 780;
    }

    @Override
    public String toString() {
        return isDefectiveModel() ?
                "The car is defective, take it to warranty." : "Your car is not defective.";
    }

    public void requestModelAndCheck() {
        setCarModel(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your car model number: ")));
        JOptionPane.showMessageDialog(null, toString());
    }
}