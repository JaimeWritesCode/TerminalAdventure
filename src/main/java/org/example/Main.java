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
        input.nextLine();

        System.out.println("My name is Pixel");
        input.nextLine();

        System.out.println("Will you explore this world with me?");
        input.nextLine();

        while(true) {
            System.out.println("Your reply (yes/no): ");
            String reply = input.nextLine();

            if (reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y")) {
                System.out.println("You wake up in the middle of a field with ragged clothes and a sword.");
                System.out.println("You are almost alone, if not for the voice that is narrating.");
                break;
            } else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n")) {
                System.out.println(reply + " is not a valid option my friend");
                continue;
            } else {
                System.out.println("You find yourself breathless, as the adventure has ended before it has even begun");
                continue;
            }
        }

    }
}