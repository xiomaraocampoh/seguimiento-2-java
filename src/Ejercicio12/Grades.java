package Ejercicio12;

import javax.swing.*;

public class Grades {
    private double physicsGrade;
    private double chemistryGrade;
    private double biologyGrade;
    private double mathGrade;
    private double computerScienceGrade;
    double average = calculateAverage();
    String rating = determineRating(average);


    public double getBiologyGrade() {
        return biologyGrade;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public double getComputerScienceGrade() {
        return computerScienceGrade;
    }

    public void setComputerScienceGrade(double computerScienceGrade) {
        this.computerScienceGrade = computerScienceGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void requestGradesAndEvaluate() {

        physicsGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Physics (0-10): "));
        chemistryGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Chemistry (0-10): "));
        biologyGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Biology (0-10): "));
        mathGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Math (0-10): "));
        computerScienceGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the grade for Computer Science (0-10): "));
    }

    private double calculateAverage() {
        return (physicsGrade + chemistryGrade + biologyGrade + mathGrade + computerScienceGrade) / 5;
    }

    private String determineRating(double average) {
        if (average <= 5.9) {
            return "Poor";
        } else if (average <= 8) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
    private void displayGradesAndAverage(double average) {
        String message = String.format(
                "Physics grade: %.2f\nChemistry grade: %.2f\nBiology grade: %.2f\nMath grade: %.2f\nComputer Science grade: %.2f\n\nAverage grade: %.2f\nRating: %s",
                physicsGrade, chemistryGrade, biologyGrade, mathGrade, computerScienceGrade, average, determineRating(average)
        );

        JOptionPane.showMessageDialog(null, message);
    }
}
