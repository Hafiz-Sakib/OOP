class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
}

class Truck extends Vehicle {
    int capacityInTons;

    public Truck(String make, String model, int year, String fuelType, int capacityInTons) {
        super(make, model, year, fuelType);
        this.capacityInTons = capacityInTons;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    boolean hasFairing;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
        super(make, model, year, fuelType);
        this.hasFairing = hasFairing;
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline", 2);
        Car car = new Car("Toyota", "Camry", 2023, "Hybrid", 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Gasoline", true);

        System.out.println("Truck Details:\nMaker: " + truck.make + "\nTruck Model: " + truck.model + "\nRelease Year: "
                + truck.year + "\nFuel Type: " + truck.fuelType + "\nCapacity In Ton's: " + truck.capacityInTons
                + "\n");
        System.out.println("Car Details:\nMaker: " + car.make + "\nCar Model: " + car.model + "\nRelease Year: "
                + car.year + "\nFuel Type: " + car.fuelType + "\nNumber of Doors: " + car.numberOfDoors + "\n");
        System.out.println("Motorcycle Details:\nMaker: " + motorcycle.make + "\nMotorcycle Model: " + motorcycle.model
                + "\nRelease Year: " + motorcycle.year + "\nFuel Type: " + motorcycle.fuelType + "\nHas Fairing: "
                + (motorcycle.hasFairing ? "Yes" : "No") + "\n");
    }
}
