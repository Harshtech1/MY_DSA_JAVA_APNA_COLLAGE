package OOPS;


public class Animal_2 {
    void eat() {
        System.out.println("Eating the Animal");
    }
}

class Deer extends Animal_2 {
    void eat() {
        System.out.println("Eating the Deer");
    }
}

class Lion extends Animal_2 {
    void eat() {
        System.out.println("Eating the Lion");
    }
}

class Test {
    public static void main(String[] args) {
        Animal_2 a = new Deer(); // Upcasting
        a.eat(); // Will call Deer’s version of eat()

        a = new Lion(); // Now a refers to Lion
        a.eat(); // Will call Lion’s version of eat()
    }
}
