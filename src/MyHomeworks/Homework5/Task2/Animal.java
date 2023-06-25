package MyHomeworks.Homework5.Task2;

class Animal {

    public Animal() {
        System.out.println("I'm animal");
    }

    int eyes;

    private void eat() {
        System.out.println("Animal eats");

    }

    private void drink() {
        System.out.println("Animal drinks");

    }

}

class Pet extends Animal {
    public Pet() {
        System.out.println("I'm pet");
    }

    int eyes = 2;
    public String name = "Lucky";
    int tail = 1;
    public int paw = 4;

    public void run() {
        System.out.println("Pet runs");

    }

    public void jump() {
        System.out.println("Pet jumps");

    }
}

class Dog extends Pet {
    public Dog() {
        System.out.println("I'm a dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    public Cat() {
        System.out.println("I'm a cat and my name is: " + name);
    }

    public static void sleep() {
        System.out.println("Cat sleeps");
    }
}