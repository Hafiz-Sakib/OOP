// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate the area of the shape
    abstract double calculateArea();
    
    // Concrete method to display the name of the shape
    void displayShapeName() {
        System.out.println("This is a shape.");
    }
}

// Concrete class representing a Circle
class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing the abstract method to calculate the area of the circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing the abstract method to calculate the area of the rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}
