package domain;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GarageRegistry {
    private ArrayList<Car> carsList = new ArrayList<>();

    //constructor
    public GarageRegistry() {
        loadCarsFromCSV();
    }

    public void dumpCars() {
        try {
            FileWriter fw = new FileWriter("CarCatalog.csv");
            for (Car car : carsList) {
                fw.write(car.getMake() + "," + car.getModel() + "," + car.getYear() + "," + car.getPrice() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }


public boolean removeCar (String make, String model, int year) {
    for (int i = 0; i< carsList.size(); i++) {
        Car car = carsList.get(i);
        if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model) && car.getYear() == year) {
            carsList.remove(car);
            dumpCars();
            return true;
        }
    }
           return false;
        }

public boolean modifyCar (String make, String model, int year, String newMake, String newModel, int newYear, double newPrice) {
    boolean found = false;
    for (Car car : carsList) {

    System.out.println("checking car: " + car);

        if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model) && car.getYear() == year) {

            System.out.println("Car found: " + car);


            car.setMake(newMake);
            car.setModel(newModel);
            car.setYear(newYear);
            car.setPrice(newPrice);



            dumpCars();
            System.out.println("Modified car: " + car);
            return true;
        }
    }
if(!found) {
System.out.println("No existing car found");
}
return false;
}

public boolean isDuplicate (Car newCar) {
    for (Car car : carsList) {
        if (car.equals(newCar)) {
            return true;
        }
    }
return false;
}




public void addCar (Car car) {
    if (!isDuplicate(car)) {
    carsList.add(car);
    dumpCars();
    System.out.println("Car added to the garage");
    } else {
        System.out.println("Car already exists, it is a duplicate");
    }
}

    public ArrayList<Car> getCarsList() {
        return carsList;
    }

    public int calculateTotalCars () {
        int total = 0;
        for(Car car : carsList) {
            total++;
            System.out.println("Counting car: " + car);
        }
    return total;
    }
    private void loadCarsFromCSV() {
        try {
            File file = new File("CarCatalog.csv");
            file.createNewFile();

            Scanner sc = new Scanner(file);
            sc.useDelimiter(System.lineSeparator());

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim(); // Trim whitespace
                String[] data = line.split(",\\s*"); // Split by commas and remove extra spaces

                if (data.length == 4) {
                    String make = data[0].trim();
                    String model = data[1].trim();
                    int year = Integer.parseInt(data[2].trim());
                    double price = Double.parseDouble(data[3].trim());

                    Car car = new Car(make, model, year, price);
                    carsList.add(car);
                } else {
                    System.err.println("Error in CSV format: " + line);
                }
            }
            sc.close();
        } catch (IOException ex) {
            System.err.println("No cars in the Garage");
        } catch (NumberFormatException ex) {
            System.err.println("Error parsing numbers: " + ex.getMessage());
        }


}

}
