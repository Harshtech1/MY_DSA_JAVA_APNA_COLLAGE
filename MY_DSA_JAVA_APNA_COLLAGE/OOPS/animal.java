package OOPS;

class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breath() {
        System.out.println("Breathing");
    }

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.breath();
        dobby.legs = 4;
        dobby.breed = "German Shepherd";
        dobby.layEggs = false;
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
        System.out.println(dobby.layEggs);
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swimming");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Mammals {
    int legs;
    String breed; 
    boolean layEggs;

    void walk() {
        System.out.println("Dog is walking");
    }
}

class Cat extends Mammals {
    void walk() {
        System.out.println("Cat is walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying");
    }
}

class Hen extends Bird {
    void fly() {
        System.out.println("Hen can fly");
    }
}
