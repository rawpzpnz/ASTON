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
