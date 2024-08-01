package Ejercicio13;

import javax.swing.*;

public class FindMaxim {
    private double number1;
    private double number2;
    private double number3;

    public FindMaxim(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

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

    public String determineMax() {
        if (number1 > number2 && number1 > number3) {
            return "The number " + number1 + " is the largest among the 3 numbers";
        } else if (number2 > number1 && number2 > number3) {
            return "The number " + number2 + " is the largest among the 3 numbers";
        } else if (number3 > number1 && number3 > number2) {
            return "The number " + number3 + " is the largest among the 3 numbers";
        } else {
            return "The three numbers or two numbers are equal";
        }
    }

    @Override
    public String toString() {
        return String.format(
                "FindMaxim{number1: %.2f, number2: %.2f, number3: %.2f}",
                number1, number2, number3
        );
    }
}
