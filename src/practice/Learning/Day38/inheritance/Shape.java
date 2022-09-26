package practice.Learning.Day38.inheritance;


public class Shape {

    String type;

    public Shape(String type) {
        this.type = type;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

}