package ejercicio5;

import javax.swing.*;

public class Rectangle {

    public int length;
    public int width;
    public int area;
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        area = length * width;
    }
    public void displayArea() {
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
}
