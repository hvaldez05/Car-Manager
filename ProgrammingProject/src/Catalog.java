


import java.util.ArrayList;

public class Catalog {
    public static void verifyCatalog() {


        GarageRegistry list = new GarageRegistry();
      

        ArrayList<Car> cars = list.getCarsList();
        for (Car car : cars){
          System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice());
        }  
        System.out.println ("The total number of cars in the garage is " + list.calculateTotalCars());
      }
  }
