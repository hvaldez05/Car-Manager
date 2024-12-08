package application;
import presentation.GarageInterface;

import java.util.Scanner;


public class StartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Enter a command: ");
        System.out.println("Add: (e.g., add Toyota Corolla 2022 2500");
        System.out.println("remove: (e.g., Toyota Corolla 2022)");
        System.out.println("modify: (e.g., Toyota Corolla 2022 Tesla Model3 2023 45000)");
        System.out.println("show");


        // Read the entire input line
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase ("exit")) {
            break;
        }


        String[] command = input.split(" ");

        // Pass the command to GarageInterface
        GarageInterface.perform(command);
    }
        scanner.close();

    }
}
