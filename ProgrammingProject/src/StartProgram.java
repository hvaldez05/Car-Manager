import java.util.Scanner;


public class StartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command: (e.g., add Toyota Corolla 2022 25000 or show)");

        // Read the entire input line
        String input = scanner.nextLine();
        String[] command = input.split(" ");

        // Pass the command to GarageInterface
        GarageInterface.perform(command);

        scanner.close();
    }
}