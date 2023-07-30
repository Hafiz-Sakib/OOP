public class Car {
    String make;
    String model;
    int year;
    double price;

    public Car(String make, String model) 
    {
        this.make = make;
        this.model = model;
        this.year = 0;
        this.price = 0.00;
    }

    public Car(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 0.00;
    }

    public Car(String make, String model, double price) 
    {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Car(String make, String model, int year, double price) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota", "Camry", 2021, 25000.0);
        Car car2 = new Car("Honda", "Civic");

        System.out.println("Car 1 Details:");
        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Price: $" + car1.price);

        System.out.println("\nCar 2 Details:");
        System.out.println("Make: " + car2.make);
             System.out.println("Year: " + car2.year);
        System.out.println("Price: $" + car2.price);
    }
}
