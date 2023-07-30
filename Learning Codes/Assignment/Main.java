abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {

    void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {

    void engine() {
        System.out.println("Truck has bad engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        car.engine();
        truck.engine();
    }
}
