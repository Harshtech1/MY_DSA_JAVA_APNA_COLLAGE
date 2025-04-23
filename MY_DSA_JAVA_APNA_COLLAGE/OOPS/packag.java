package OOPS;
import java.util.Scanner;

public class packag {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        // h.color_change(); 
        System.out.println(h.color);

        // Uncomment to test Chicken class
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        myHorse.walk();
        System.out.println(myHorse.color);

        // Animal a = new Animal(); // ❌ Can't instantiate abstract class
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "White";
    }

    void eat() {
        System.out.println("Eating");
    }

    abstract void walk();  
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");    
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }

    void color_change() {
        color = "Dark Red";
        System.out.println("Horse color is changed");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

// Optional Chicken class
// class Chicken extends Animal {
//     void color_change() {
//         color = "Dark Brown";
//         System.out.println("Chicken color is changed");
//     }

//     void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }

