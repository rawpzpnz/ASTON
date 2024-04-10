package org.example;

public interface Shape {
    double calculateArea();

    double calculatePerimeter();

    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Цвет заливки: %s, Цвет границ: %s\n",
                calculateArea(), calculatePerimeter(), getFillColor(), getBorderColor());
    }
}