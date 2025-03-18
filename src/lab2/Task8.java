package lab2;

public class Task8 {
    static class Animal {
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Звук животного");
        }
    }

    static class Dog extends Animal {
        private final String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        @Override
        public void makeSound() {
            System.out.println("Гав-гав!");
        }
    }

    static class Cat extends Animal {
        private String foodType;

        public Cat(String name, int age, String foodType) {
            super(name, age);
            this.foodType = foodType;
        }

        @Override
        public void makeSound() {
            System.out.println("Мяу-мяу!");
        }
    }

    static class Bird extends Animal {
        private boolean canFly;

        public Bird(String name, int age, boolean canFly) {
            super(name, age);
            this.canFly = canFly;
        }

        @Override
        public void makeSound() {
            System.out.println("Фью-ти-фью!");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Animal dog = new Dog("Варя", 7, "Золотистый ретривер");
            Animal cat = new Cat("Биля", 12, "Говядина");
            Animal bird = new Bird("Кеша", 2, true);

            dog.makeSound();
            cat.makeSound();
            bird.makeSound();
        }
    }

}
