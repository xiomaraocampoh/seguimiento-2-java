package Ejercicio14;

public class Help {
    public String gender;
    public int age;

    public String pay(){
        return (gender == "female" && age > 50) ?
                "The government will help you with a monthly payment of 120000" :  (gender == "female" && age >= 30 && age < 50) ?
                "The government will help you with a monthly payment of 100000" :  "The government will help you with a monthly payment of 40000";
    }
}
