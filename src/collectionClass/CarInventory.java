package collectionClass;

import java.util.Vector;

class Car{
    int id;
    String brand;
    String model;
    Car(int id,String brand,String model){
        this.id=id;
        this.brand=brand;
        this.model=model;
    }
    public String toString(){
        return "Car ID: " +id+ ", Brand: " +brand+ ", Model:"+model;

    }
}
public class CarInventory {
    public static void main(String[] args) {
        Vector<Car> inventory = new Vector<>();
        inventory.add(new Car(101, "Toyota", "Corolla"));
        inventory.add(new Car(102, "Honda", "Civic"));
        inventory.add(new Car(103, "Ford", "Mustang"));
        System.out.println("Car Inventory:");
        for (Car car : inventory) {
            System.out.println(car);
        }
        int searchId = 102;
        System.out.println("\nSearching for car with ID " + searchId + ":");
        boolean found = false;
        for (int i = 0; i < inventory.size(); i++) {
            Car car = inventory.get(i);
            if (car.id == searchId) {
                System.out.println("Car found: " + car);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(" not found.");
        }


    }
}
