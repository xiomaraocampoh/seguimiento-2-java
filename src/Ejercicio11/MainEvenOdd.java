package Ejercicio11;

import javax.swing.*;

public class MainEvenOdd {
    public static void main (String [] args){
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: "));
        EvenOdd evenOdd = new EvenOdd (number);
        JOptionPane.showMessageDialog(null, evenOdd.toString());
        evenOdd.checkEvenOdd();
    }
}
