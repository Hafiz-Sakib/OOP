/**
 * 4
 */
public class four4 {

    public static void main(String[] args) {
        Circle c = new Circle(10.00);
        System.out.println("Radius : " + c.radius);
        System.out.println("Radius : " + c.area());
    }
}

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    Circle(double r, int k) {
        radius = r;
        k++;
    }

    double area() {
        return 3.1416 * radius * radius;
    }
}