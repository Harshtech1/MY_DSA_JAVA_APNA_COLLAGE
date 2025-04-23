public class half_pyramid {
    // Change to static variable so it can be accessed from static methods
    static int n = 3;
    
    private static void printHalfPyramid_1() {
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n-line+1; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
    private static void printHalfPyramid_2() {
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printHalfPyramid_1();
        printHalfPyramid_2();
        printHalfPyramid_1();
        printHalfPyramid_2();
    }
}