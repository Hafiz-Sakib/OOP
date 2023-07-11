public class Vehicle {
    int wheels, passengers;
    String type, Driver_name;
    double hp;

    void displayVehicle() {
        System.out.println("Total Wheels = " + wheels);
        System.out.println("Total Passengers = " + passengers);
        System.out.println("Vehicle Type = " + type);
        System.out.println("Driver Name  = " + Driver_name);
        System.out.println("Horse Power  = " + hp);
        System.out.println("-------------------------");
    }
}