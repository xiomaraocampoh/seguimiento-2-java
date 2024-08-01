package ejercicio1;

import javax.swing.*;

public class User {
    private String inputUser;
    private String inputPass;
    private String userSystem = "Guesst123";
    private String passSystem = "password321";
    private String systemStatus = "Available";

    // Constructor que inicializa inputUser e inputPass
    public User(String inputUser, String inputPass) {
        this.inputUser = inputUser;
        this.inputPass = inputPass;
    }

    public String checkStatus() {
        return systemStatus;
    }

    public String accessValidation() {
        // Validar el usuario y la contraseña
        boolean isUserValid = inputUser.equals(userSystem);
        boolean isPassValid = inputPass.equals(passSystem);

        if (isUserValid && isPassValid) {
            return "Authorization Access";
        } else {
            return "Authorization Denied";
        }
    }
}
