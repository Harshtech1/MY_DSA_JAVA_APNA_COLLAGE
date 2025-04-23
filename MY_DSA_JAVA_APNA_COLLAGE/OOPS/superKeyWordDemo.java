package OOPS;

class Animal {
    String color="White";


    Animal() {
        System.out.println("is an Animal");
    }
}

class Horse extends Animal {
    Horse() {
        // Horse.color = "Brown"; // Setting color of Animal class
        System.out.println("Horse Constructor is called");
    }
}

public class superKeyWordDemo {
    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.color); // ✅ prints Brown
    }
}
