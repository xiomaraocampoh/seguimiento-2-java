package Ejercicio18;

public class MainComputerStatus {
    public static void main(String[] args) {
        ComputerStatusChecker statusChecker = new ComputerStatusChecker(false, false);
        statusChecker.requestStatusAndCheck();
    }
}