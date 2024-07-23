package ejercicio5;

import javax.swing.*;

public class Rectangle {

    public int length;
    public int width;
    public int area;
    public void inputDimensions() {
        length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the rectangle: "));
        width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the width of the rectangle: "));
    }

    public void calculateArea() {
        area = length * width;
    }

    public void displayArea() {
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
}
