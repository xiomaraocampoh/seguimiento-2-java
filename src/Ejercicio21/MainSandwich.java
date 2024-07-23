package Ejercicio21;

import javax.swing.*;

public class MainSandwich {
    public int smallSandwich = 6000;
    public int bigSandwich = 12000;
    public int beacon = 3000;
    public int turkey = 3000;
    public int cheese = 2500;

    public void sandwichOrder() {
        int decision1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to the SandwichOrder \n " +
                "Choose one type of sandwich: \n 1. Big \n 2. Small"));
        switch (decision1) {
            case 1:
                int decisionCase1 = JOptionPane.showConfirmDialog(null, "Would you like any extra additions to your sandwich?");
                if (decisionCase1 == JOptionPane.YES_OPTION) {

                    int extra1 = 0;
                    int extra2 = 0;
                    int extra3 = 0;
                    int extra4 = 0;

                    boolean check = true;

                    while (check) {
                        int decisionYesw = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose the opcionts do you want to add and enter 4 for finish your order. (you can add as many as you want) \n 1. Chili \n 2. Beacon \n 3. Turkey \n 4. Chesee \n 5. Continue"));

                        switch (decisionYesw) {
                            case 1:
                                extra1++;
                                break;
                            case 2:
                                extra2++;
                                break;
                            case 3:
                                extra3++;
                                break;
                            case 4:
                                extra4++;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "The total for an order of: \n Big sandwich \n" + extra1 + " extra Chili \n" + extra2 + " extra beacon \n" + extra3 + " extra Turkey \n" + extra4 +" cheese" +"\n Total is " + (bigSandwich +((extra2 * beacon) + (extra3 * turkey) + (extra4*cheese))));
                                check = false;
                                break;
                        }


                    }
                }
                else if (decisionCase1 == JOptionPane.NO_OPTION) JOptionPane.showMessageDialog(null,"The total for an order of: Big sandwich is " + bigSandwich + " dollars");
                break;
            case 2:
                int decisionCase2 = JOptionPane.showConfirmDialog(null, "Would you like any extra additions to your sandwich?");
                if (decisionCase2 == JOptionPane.YES_OPTION) {
                    int extra1 = 0;
                    int extra2 = 0;
                    int extra3 = 0;
                    int extra4 = 0;
                    boolean check = true;

                    while (check) {
                        int decisionYesw = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose the opcionts do you want to add and enter 4 for finish your order. (you can add as many as you want) \n 1. Chili \n 2. Beacon \n 3. Turkey \n 4. Chesee \n 5. Continue"));

                        switch (decisionYesw) {
                            case 1:
                                extra1++;
                                break;
                            case 2:
                                extra2++;
                                break;
                            case 3:
                                extra3++;
                                break;
                            case 4:
                                extra4++;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "The total for an order of: \n Small sandwich \n" + extra1 + " extra Chili \n" + extra2 + " extra beacon \n" + extra3 + " extra Turkey \n" + extra4 +" cheese" +"\n Total is " + (bigSandwich +((extra2 * beacon) + (extra3 * turkey) + (extra4*cheese))));
                                check = false;
                                break;
                        }


                    }
                }
                else if (decisionCase2 == JOptionPane.NO_OPTION) JOptionPane.showMessageDialog(null,"The total for an order of: Small sandwich is " + smallSandwich + " dollars");


        }
    }
}
