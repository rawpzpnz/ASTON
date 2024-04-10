package org.example;

public class Cat extends Animal {
    private boolean satiety;
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        this.satiety = false; // Коты изначально голодны
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.satiety = true;
            System.out.println(this.name + " покушал и теперь сыт.");
        } else {
            System.out.println(this.name + " не смог покушать, в миске недостаточно еды.");
        }
    }
}