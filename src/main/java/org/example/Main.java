package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Terminal Adventure");
        System.out.println("-----------------------------");

        System.out.println("Greetings Adventurer!");
        System.out.print("What is your name?: ");
        String userName = input.nextLine();
        System.out.println("-----------------------------");

        System.out.println("Welcome " + userName + "!");
        System.out.println("Press enter to continue");
        input.nextLine();

        System.out.println("-----------------------------");
        System.out.println("Hello");

    }
}