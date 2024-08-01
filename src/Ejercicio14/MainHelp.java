package Ejercicio14;

import java.util.Scanner;

public class MainHelp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your gender (female or male): ");
        String gender = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Help help = new Help(gender, age);
        System.out.println(help.toString());
        System.out.println(help.pay());
    }
}
