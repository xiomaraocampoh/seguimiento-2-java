package Ejercicio14;

public class Help {

    private String gender;
    private int age;

    public Help(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String pay() {
        if ("female".equalsIgnoreCase(gender)) {
            if (age > 50) {
                return "The government will help you with a monthly payment of 120000";
            } else if (age >= 30) {
                return "The government will help you with a monthly payment of 100000";
            }
        }
        return "The government will help you with a monthly payment of 40000";
    }

    @Override
    public String toString() {
        return String.format("Help{gender: %s, age: %d}", gender, age);
    }
}

