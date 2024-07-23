package ejercicio1;
import javax.swing.*;

public class User {
    public String inputUser;
    public String inputPass;
    public String userSystem = "Guesst123";
    public String passSystem = "password321";
    public String Systemstatus = "Available";

    public String checkStatus(){
        return Systemstatus;
    };

    public String accessValidation(){
        return  (inputUser == userSystem) ? "Authorization Access" : "Authorization delegate";
    }
}
