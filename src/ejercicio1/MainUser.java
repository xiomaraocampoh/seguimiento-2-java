
package ejercicio1;

import javax.swing.*;

public class MainUser {
    public static void main(String[] args) {
        String inputUser = JOptionPane.showInputDialog("Enter user: ");
        String inputPass = JOptionPane.showInputDialog("Enter password: ");

        User user = new User(inputUser, inputPass);


        System.out.println(user.accessValidation());
        System.out.println(user.checkStatus());
    }
}
