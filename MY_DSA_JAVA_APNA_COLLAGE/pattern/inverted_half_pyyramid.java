public class inverted_half_pyyramid {
    public static void printInvertedHalfPyramid(int n) {
        // Outer loop for rows
        for (int i = n; i >= 1; i--) {
            // Inner loop for printing numbers and symbols
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the method with 5 as input to generate the pyramid
        printInvertedHalfPyramid(5);
    }
}
