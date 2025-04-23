package OOPS;

public class chess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        Rook r = new Rook();
        r.move();
        King k = new King();
        k.move();
        Bishop b = new Bishop();
        b.move();
    }
}
interface Class_player {
    void move();
}
class Queen implements Class_player {
    public void move() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}
class Rook implements Class_player {
    public void move() {
        System.out.println("up, down, left, right");
    }
}
class King implements Class_player {
    public void move() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}
class Bishop implements Class_player {
    public void move() {
        System.out.println("diagonal (in all 4 directions)");
    }
}