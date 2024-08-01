package Ejercicio16;

import javax.swing.*;

public class TriangleValidator {
    private int angle1;
    private int angle2;
    private int angle3;

    // Constructor que inicializa los ángulos
    public TriangleValidator(int angle1, int angle2, int angle3) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    // Constructor sin argumentos, inicializa los ángulos a valores predeterminados
    public TriangleValidator() {
        this(0, 0, 0);
    }

    // Getters y Setters
    public int getAngle1() {
        return angle1;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public int getAngle3() {
        return angle3;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }

    // Método para solicitar ángulos al usuario y validar el triángulo
    public void requestAnglesAndValidate() {
        angle1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first angle: "));
        angle2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second angle: "));
        angle3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the third angle: "));

        boolean isValid = validateTriangle(angle1, angle2, angle3);
        String result = isValid ? "The triangle is valid." : "The triangle is not valid.";
        JOptionPane.showMessageDialog(null, result);
    }

    // Método para validar si los ángulos forman un triángulo válido
    private boolean validateTriangle(int a, int b, int c) {
        return (a + b + c) == 180;
    }

    @Override
    public String toString() {
        return String.format("TriangleValidator{angle1: %d, angle2: %d, angle3: %d}", angle1, angle2, angle3);
    }
}