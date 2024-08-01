
package ejercicio1;

import javax.swing.*;

public class MainUser {
    public static void main(String[] args) {
        // Obtener el input del usuario a través de cuadros de diálogo
        String inputUser = JOptionPane.showInputDialog("Enter user: ");
        String inputPass = JOptionPane.showInputDialog("Enter password: ");

        // Crear una instancia de User con los datos introducidos
        User user = new User(inputUser, inputPass);

        // Imprimir resultados en la consola
        System.out.println(user.accessValidation());
        System.out.println(user.checkStatus());
    }
}
