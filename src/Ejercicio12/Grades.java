package Ejercicio12;

import javax.swing.*;

public class Grades {

    private double physicsGrade;
    private double chemistryGrade;
    private double biologyGrade;
    private double mathGrade;
    private double computerScienceGrade;
    private double average;
    private String rating;

    public Grades(double physicsGrade, double chemistryGrade, double biologyGrade, double mathGrade, double computerScienceGrade) {
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
        this.biologyGrade = biologyGrade;
        this.mathGrade = mathGrade;
        this.computerScienceGrade = computerScienceGrade;
        this.average = calculateAverage();
        this.rating = determineRating(this.average);
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
        updateAverageAndRating();
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
        updateAverageAndRating();
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
        updateAverageAndRating();
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
        updateAverageAndRating();
    }

    public double getComputerScienceGrade() {
        return computerScienceGrade;
    }

    public void setComputerScienceGrade(double computerScienceGrade) {
        this.computerScienceGrade = computerScienceGrade;
        updateAverageAndRating();
    }

    public double getAverage() {
        return average;
    }

    public String getRating() {
        return rating;
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

    private void updateAverageAndRating() {
        this.average = calculateAverage();
        this.rating = determineRating(this.average);
    }

    public void displayGradesAndAverage() {
        String message = String.format(
                "Physics grade: %.2f\nChemistry grade: %.2f\nBiology grade: %.2f\nMath grade: %.2f\nComputer Science grade: %.2f\n\nAverage grade: %.2f\nRating: %s",
                physicsGrade, chemistryGrade, biologyGrade, mathGrade, computerScienceGrade, average, rating
        );

        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String toString() {
        return String.format(
                "Grades{Physics: %.2f, Chemistry: %.2f, Biology: %.2f, Math: %.2f, Computer Science: %.2f, Average: %.2f, Rating: %s}",
                physicsGrade, chemistryGrade, biologyGrade, mathGrade, computerScienceGrade, average, rating
        );
    }
}
