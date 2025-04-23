package Arrays;
import java.util.Scanner;
public class linear_Search {

    public static int linearSearch(int numbers[], int key) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        key = sc.nextInt();
        System.out.println("Key: " + key);
        System.out.print("Array elements: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                sc.close();
                return i;
            }
        }
        sc.close();
        return -1;
    }    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 0;
            int index = linearSearch(numbers, key);
            if (index == -1) {
                System.out.println("Not Found");
            } else {
                System.out.println("Key is at index: " + index);
            }
        System.out.println("Array length: " + numbers.length);
        
}}