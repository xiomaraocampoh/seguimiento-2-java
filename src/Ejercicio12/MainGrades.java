package Ejercicio12;

import javax.swing.*;

public class MainGrades {
    public static void main(String[] args) {
        double physicsGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Physics (0-10): "));
        double chemistryGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Chemistry (0-10): "));
        double biologyGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Biology (0-10): "));
        double mathGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Math (0-10): "));
        double computerScienceGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Computer Science (0-10): "));

        Grades grades = new Grades(physicsGrade, chemistryGrade, biologyGrade, mathGrade, computerScienceGrade);
        JOptionPane.showMessageDialog(null, grades.toString());
        grades.displayGradesAndAverage();
    }
}
