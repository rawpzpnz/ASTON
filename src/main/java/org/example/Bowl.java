package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        this.food += amount;
        System.out.println("В миску добавлено: " + amount + " ед. еды.");
    }
}