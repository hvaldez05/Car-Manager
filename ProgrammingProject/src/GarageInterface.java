import java.util.Scanner;
import java.util.ArrayList;

public class GarageInterface {

    public static void perform(String[] instruction) {
        GarageRegistry list = new GarageRegistry();

        // Debugging: Print received instructions
        System.out.println("Received instruction: " + String.join(" ", instruction));

        if (instruction.length == 1 && instruction[0].equalsIgnoreCase("show")) {
            // Show all cars
            showGarageRegistry(list);
        } else if (instruction.length == 5 && instruction[0].equalsIgnoreCase("add")) {
            try {
                // Parse year and price
                int year = Integer.parseInt(instruction[3]);
                double price = Double.parseDouble(instruction[4]);

                // Add the car to the list
                list.addCar(new Car(instruction[1], instruction[2], year, price));
                System.out.println("Car successfully added to the garage");
            } catch (NumberFormatException e) {
                System.out.println("Error: Year and price must be numbers.");
            }
        } else {
            System.out.println("Error in instruction format.");
        }
    }

    private static void showGarageRegistry(GarageRegistry list) {
        ArrayList<Car> cars = list.getCarsList();
        for (Car car : cars) {
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice());
        }
        System.out.println("The total number of cars in the garage is " + list.calculateTotalCars());
    }
}

