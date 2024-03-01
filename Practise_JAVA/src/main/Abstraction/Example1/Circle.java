package main.Abstraction.Example1;

public class Circle extends Shape {
    double radius=200.0;

    public double area() {
        return (Math.PI*radius*radius);
    }
}
