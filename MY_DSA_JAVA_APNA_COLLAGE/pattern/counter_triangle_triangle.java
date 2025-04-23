public class counter_triangle_triangle {
    public static void full_triangle(int n) {
        int counter = 1;    
        for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(counter + "&#32;");
            counter++;
        }
        System.out.println();
    }   
        
}
}