package Strings;

public class Direction {
    public static void main(String[] args) {
        String str = "WNEENESENNNESSNS";
        System.out.println(ShortestPath(str));
    }
    
    public static int ShortestPath(String path) {
        int x = 0, y = 0;
        
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;            } else {
                x--;
            }
        

    }int X2=x*x;
    int Y2=y*y;
    return (int)Math.sqrt(X2+Y2);
       
    }}
