package domain;

public class Car {
  private String make;
  private String model;
  private int year;
  private double price;

  // Constructor
  public Car(String make, String model, int year, double price) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.price = price;
  }

  public Car () {

  }

  // Getters, Setters, and toString() method
  public String getMake() {
      return make;
  }

  public void setMake(String make) {
      this.make = make;
  }

  public String getModel() {
      return model;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public int getYear() {
      return year;
  }

  public void setYear (int year) {
      this.year = year;
  }

  public double getPrice() {
      return price;
  }

  public void setPrice (double price) {
      this.price = price;
  }
// toString method
@Override
public String toString() {
  return "Car{" +
          "make='" + make + '\'' +
          ", model='" + model + '\'' +
          ", year=" + year +
          ", price=" + price +
          '}';

}

@Override
public boolean equals(Object obj) {
  if (this == obj) {
      return true;
  }

  if (obj instanceof Car) {
      Car otherCar = (Car) obj;

      return this.make.equalsIgnoreCase(otherCar.make) && this.model.equalsIgnoreCase (otherCar.model) && this.year == otherCar.year && this.price == otherCar.price;

  }
  return false;

  }

}