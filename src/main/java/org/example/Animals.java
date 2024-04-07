package org.example;
class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Белый"),
                new Cat("Серый"),
                new Cat("Черный")
        };

        Dog dog = new Dog("Бобик");

        Bowl bowl = new Bowl(20);
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 5);
        }
        bowl.addFood(15);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eatFromBowl(bowl, 5);
                System.out.println(cat.getName() + " повторно покушал, сытость: " + cat.isSatiety());
            }
        }

        for (Cat cat : cats) {
            cat.run(150);
            cat.swim(5);
        }
        dog.run(450);
        dog.swim(8);

        System.out.println("Всего животных: " + Animal.getCount());
    }
}

class Animal {
    protected String name;

    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {}

    public void swim(int distance) {}

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
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

class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
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
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(this.name + " проплыл " + distance + " м.");
        } else {
            System.out.println(this.name + " не может проплыть " + distance + " м.");
        }
    }
}

class Bowl {
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