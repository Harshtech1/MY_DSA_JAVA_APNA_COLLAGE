package Arrays;
import java.util.Scanner;
public class Largest_number {

    public static int Array_input_from_user(int numbers[], Scanner sc) {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Check if array size is sufficient
        if (n > numbers.length) {
            System.out.println("Error: Array size is not sufficient");
            return 0;
        }
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        
        return n;
    }
    
    public static int getLargest(int numbers[], int n) {
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        return largest;
    }
    
    public static int getSmallest(int numbers[], int n) {
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        return smallest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100]; // Assuming maximum 100 elements
        
        int n = Array_input_from_user(numbers, sc);
        
        if (n > 0) {
            int largest = getLargest(numbers, n);
            int smallest = getSmallest(numbers, n);
            
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
        
        sc.close();
    }
}