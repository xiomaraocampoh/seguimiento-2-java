package Ejercicio19;

import javax.swing.*;

public class CarModelChecker {
    private int carModel;

    public void requestModelAndCheck() {
        carModel = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your car model number: "));

        String message = isDefectiveModel(carModel) ?
                "The car is defective, take it to warranty." :  "Your car is not defective.";
        JOptionPane.showMessageDialog(null, message);
    }

    private boolean isDefectiveModel(int model) {
        return model == 119 || model == 179 || (model >= 189 && model <= 195) || model == 221 || model == 780;
    }
}