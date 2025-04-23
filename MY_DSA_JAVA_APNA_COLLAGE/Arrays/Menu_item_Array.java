package Arrays;

import java.util.Scanner;

public class Menu_item_Array {
    
    public static void main(String[] args) {
        // Define the menu items
        String[] menu = {"Dosa", "Idli", "Samosa", "Poha", "Vada"};
        
        // Display the menu
        System.out.println("Available Menu Items:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the item to search for: ");
        String searchItem = scanner.nextLine();
        
        // Search for the item using linear search
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) {
                System.out.println("Item found at position " + (i+1) + ": " + menu[i]);
                found = true;
                break;
            }
        }
        
        // If item not found
        if (!found) {
            System.out.println("Sorry, '" + searchItem + "' is not available in our menu.");
        }
        
        scanner.close();
    }
}