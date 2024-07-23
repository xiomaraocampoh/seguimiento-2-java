package Ejercicio14;

import java.util.Scanner;

public class MainHelp {
    public static void main(String[] args) {
        Help help = new Help();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (female or male): ");
        help.gender = sc.next();
        System.out.print("Enter your age: ");
        help.age = sc.nextInt();

        System.out.println(help.pay());
    }
}
