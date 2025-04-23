public class HOLLOW_RECTANGLE {
    public static void printStar(int to_rows, int to_cols) {
        for(int i=1; i<=to_rows; i++) {
            for(int j=1; j<=to_cols; j++) {
                if(i==1 || j==1 || i==to_rows || j==to_cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        printStar(4, 5);
    }
}
