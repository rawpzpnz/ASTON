package org.example;
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple" );
            }

    public static void checkSumSign() {
        int a = 5; // Пример значения для переменной a
        int b = -3; // Пример значения для переменной b
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}