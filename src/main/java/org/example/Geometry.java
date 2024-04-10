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
