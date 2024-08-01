package Ejercicio22;

import javax.swing.*;
import java.util.Random;


public class BlackJack {
    private Random cards = new Random();

    private int card1Machine;
    private int card2Machine;
    private int card3Machine;

    private int card1User;
    private int card2User;
    private int card3User;

    private int totalMachine;
    private int totalUser;
    private String namePlayer;

    public BlackJack(String namePlayer) {
        this.namePlayer = namePlayer;
        card1Machine = cards.nextInt(10) + 1;
        card2Machine = cards.nextInt(10) + 1;
        card3Machine = cards.nextInt(10) + 1;

        card1User = cards.nextInt(10) + 1;
        card2User = cards.nextInt(10) + 1;
        card3User = cards.nextInt(10) + 1;

        totalMachine = card1Machine + card2Machine + card3Machine;
        totalUser = card1User + card2User;
    }

    public BlackJack() {
        this("Player"); // Default constructor
    }

    public void game() {
        int decision1 = JOptionPane.showConfirmDialog(null,
                "Your cards are: " + card1User + " and " + card2User + "\n" +
                        "Press 'Yes' to take the third card or 'No' to stay with two cards");

        if (decision1 == JOptionPane.YES_OPTION) {
            totalUser += card3User;
            displayResult();
        } else if (decision1 == JOptionPane.NO_OPTION) {
            displayResult();
        }
    }

    private void displayResult() {
        String result;
        if (totalUser > 21) {
            result = String.format("The player %s has lost.\nTotal %s cards: %d\nTotal machine cards: %d, %d, %d\nTotal = %d",
                    namePlayer, namePlayer, totalUser, card1Machine, card2Machine, card3Machine, totalMachine);
        } else if (totalMachine > 21 || totalUser > totalMachine) {
            result = String.format("The player %s has won.\nTotal %s cards: %d\nTotal machine cards: %d, %d, %d\nTotal = %d",
                    namePlayer, namePlayer, totalUser, card1Machine, card2Machine, card3Machine, totalMachine);
        } else if (totalUser == totalMachine) {
            result = String.format("Both players have the same number of cards.\nTotal %s cards: %d\nTotal machine cards: %d, %d, %d\nTotal = %d",
                    namePlayer, totalUser, card1Machine, card2Machine, card3Machine, totalMachine);
        } else {
            result = String.format("The player %s has lost.\nTotal %s cards: %d\nTotal machine cards: %d, %d, %d\nTotal = %d",
                    namePlayer, namePlayer, totalUser, card1Machine, card2Machine, card3Machine, totalMachine);
        }
        JOptionPane.showMessageDialog(null, result);
    }

    @Override
    public String toString() {
        return String.format("BlackJack Game Results:\nPlayer: %s\nPlayer's Cards: %d, %d%s\nMachine's Cards: %d, %d, %d\nPlayer Total: %d\nMachine Total: %d",
                namePlayer, card1User, card2User, card3User > 0 ? ", " + card3User : "", card1Machine, card2Machine, card3Machine, totalUser, totalMachine);
    }
}
