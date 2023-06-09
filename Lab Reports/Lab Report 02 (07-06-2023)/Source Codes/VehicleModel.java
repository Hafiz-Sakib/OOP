import java.util.Scanner;

public class VehicleModel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        String type = sc.nextLine();
        vehicle vehicle1 = new vehicle(model, type);
        vehicle1.print();
        sc.close();
    }
}

class vehicle {
    String model;
    String type;

    vehicle(String model, String type) {
        // Constructor
        this.model = model;
        this.type = type;
    }

    void print() {
        System.out.println("Vehicle Model : " + model);
        System.out.println("Vehicle Type : " + type);
    }
}