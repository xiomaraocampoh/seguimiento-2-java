package ejercicio5;

import javax.swing.*;

public class MainRecatngle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the rectangle: ")),Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the width of the rectangle: ")) );
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}
