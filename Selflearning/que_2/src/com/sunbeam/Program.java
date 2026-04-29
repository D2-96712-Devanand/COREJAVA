package com.sunbeam;

abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
    abstract String getName();
}


abstract class TwoDShape extends Shape {
    @Override
    double getVolume() { return 0; } 
}

class Circle extends TwoDShape {
    double radius;
    Circle(double r) { this.radius = r; }
    
    @Override double getArea() { return Math.PI * radius * radius; }
    @Override String getName() { return "Circle"; }
}

class Rectangle extends TwoDShape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    
    @Override double getArea() { return l * w; }
    @Override String getName() { return "Rectangle"; }
}

// --- 3D Shapes ---
abstract class ThreeDShape extends Shape { }

class Sphere extends ThreeDShape {
    double radius;
    Sphere(double r) { this.radius = r; }
    
    @Override double getArea() { return 4 * Math.PI * radius * radius; }
    @Override double getVolume() { return (4.0/3.0) * Math.PI * Math.pow(radius, 3); }
    @Override String getName() { return "Sphere"; }
}

class Cube extends ThreeDShape {
    double side;
    Cube(double s) { this.side = s; }
    
    @Override double getArea() { return 6 * side * side; }
    @Override double getVolume() { return Math.pow(side, 3); }
    @Override String getName() { return "Cube"; }
}

public class Program {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Sphere(3), new Cube(2) };

        for (Shape s : shapes) {
            System.out.printf("%-10s | Area: %-8.2f | Volume: %.2f%n", 
                               s.getName(), s.getArea(), s.getVolume());
        }
    }
}
