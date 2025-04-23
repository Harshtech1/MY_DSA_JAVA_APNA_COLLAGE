import java.util.Scanner;

public class InvertedRotatedPyramid {
    public static void main(String[] args) {
        // Create a Scanner instance
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Call the method to print the pyramid
        printInvertedRotatedPyramid(n);

        // Close the scanner
        sc.close();
    }

    // Method to print the inverted rotated pyramid
    public static void printInvertedRotatedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
