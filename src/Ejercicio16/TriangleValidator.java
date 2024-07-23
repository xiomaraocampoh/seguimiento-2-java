package Ejercicio16;

import javax.swing.*;

public class TriangleValidator {
    private int angle1;
    private int angle2;
    private int angle3;

    public void requestAnglesAndValidate() {
        angle1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first angle: "));
        angle2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second angle: "));
        angle3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the third angle: "));

        boolean isValid = validateTriangle(angle1, angle2, angle3);
        String result = isValid ? "The triangle is valid." : "The triangle is not valid.";
        JOptionPane.showMessageDialog(null, result);
    }

    private boolean validateTriangle(int a, int b, int c) {
        return (a + b + c) == 180;
    }
}