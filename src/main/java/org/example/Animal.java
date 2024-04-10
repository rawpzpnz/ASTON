package org.example;

public class Animal {
    protected String name;

    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }

    public static int getCount() {
        return count;
    }
}
