package presentation;
import domain.*;

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

                if (list.isDuplicate (new Car( instruction[1], instruction[2], year, price))) {
                    System.out.println("Error: Car already exists in the garage.");
                } else {
                    list.addCar (new Car(instruction [1], instruction[2], year, price));
                System.out.println("Car successfully added to the garage");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Year and price must be numbers.");
            }
        } else if (instruction.length == 4 && instruction [0].equalsIgnoreCase ("remove")) {
            try { String make = instruction [1];
                String model = instruction [2];
                int year = Integer.parseInt(instruction [3]);

                if (list.removeCar(make, model, year)) {
                    System.out.println ("Car succesfully removed from the garage");
                } else {
                    System.out.println ("car not found in the garage");
                }
            } catch (NumberFormatException e) {
                System.out.println ("Error.");
            }
                } else if (instruction.length == 8 && instruction[0].equalsIgnoreCase("modify")) {
                try {
                    String make = instruction[1];
                    String model = instruction[2];
                    int year = Integer.parseInt(instruction[3]);

                    String newMake = instruction[4];
                    String newModel = instruction[5];
                    int newYear = Integer.parseInt(instruction[6]);
                    double newPrice = Double.parseDouble(instruction[7]);

                    if (list.modifyCar (make, model, year, newMake, newModel, newYear, newPrice)) {
                        System.out.println ("Car successfully modified in the garage");
                    } else {
                        System.out.println ("Car not found in the garage");
                    }
                }catch (NumberFormatException e) {
                    System.out.println ("Error: Year and price must be valid numbers.");
                }
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
