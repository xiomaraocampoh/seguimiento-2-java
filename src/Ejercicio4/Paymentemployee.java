package Ejercicio4;

import javax.swing.*;

public class Paymentemployee {
    public int codeEmploye;
    private int basicSalary =1300000;
    public int overtimeHours;
    private int numHours = 8 ;
    private int bonus;
    private int net;




    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }


    public int getNumHours() {
        return numHours;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }




    public void employeInformation(){
        codeEmploye = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your employe code: "));
    }

    public void extraHours(){
        overtimeHours = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your total overtime hours: "));
        JOptionPane.showMessageDialog(null,"Your payment for working "+ overtimeHours +" overtime hours is "+ getBasicSalary()*overtimeHours + " bucks  ");

    }

    public void earn(){
        setBasicSalary(getBasicSalary()+15000);
        JOptionPane.showMessageDialog(null,"Your earn for your service on weekends is: " + 15000);
    }

    public void deductions(){
        setBasicSalary(getBasicSalary()-12000);
        JOptionPane.showMessageDialog(null,"Your deductions for taxes is: 1200 dollars ");
    }


    public void net(){
        JOptionPane.showMessageDialog(null,"Your net payment is: "+ (getBasicSalary()+overtimeHours*getBasicSalary()));
    }

}