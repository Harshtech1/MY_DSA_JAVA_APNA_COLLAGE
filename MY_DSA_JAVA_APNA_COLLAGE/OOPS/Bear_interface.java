package OOPS;

public class Bear_interface {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }
}

interface Herbivore {
    void eatPlants(); // abstract by default
}

interface Carnivore {
    void eatMeat(); // abstract by default
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    public void eatMeat() {
        System.out.println("Eating meat");
    }
}
