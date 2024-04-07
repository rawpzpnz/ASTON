package org.example;
public class Geometry {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        circle.printInfo();

        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        rectangle.printInfo();

        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Зеленый");
        triangle.printInfo();
    }
}
interface Shape {
    double calculateArea();
    double calculatePerimeter();
    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Цвет заливки: %s, Цвет границ: %s\n",
                calculateArea(), calculatePerimeter(), getFillColor(), getBorderColor());
    }
}

class Circle implements Shape {
    double radius;
    String fillColor;
    String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}

class Rectangle implements Shape {
    double length, width;
    String fillColor, borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}

class Triangle implements Shape {
    double side1, side2, side3;
    String fillColor, borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}

