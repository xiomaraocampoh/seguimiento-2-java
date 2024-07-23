package Ejercicio13;

import javax.swing.*;

public class FindMaxim {
    private double number1;
    private double number2;
    private double number3;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public void requestNumbersAndFindMax() {
        number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number: "));
        number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number: "));
        number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third number: "));
    }

    public String determine() {
        return (number1 > number2 && number1 > number3) ?
                "The number " + number1 + " is the largest among the 3 numbers" : (number2 > number1 && number2 > number3) ?
                "The number " + number2 + " is the largest among the 3 numbers" : (number3 > number2 && number3 > number1) ?
                "The number " + number3 + " is the largest among the 3 numbers" : "The tree or two numbers are equals";
    }
}