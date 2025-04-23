package Strings;
import java.util.Scanner;
public class Strings {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println(name);
        // Declare a character array
        char arr[] = {'a', 'b', 'c', 'd'};

        // Create a string object
        String str = "abcd";

        // Create a string object using the String class constructor
        String str2 = new String("xyz");

        String firstName="Tony";
        String lastName="Stark";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName+" is Ironman");
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(5));
        System.out.println(fullName.indexOf("Stark"));
        System.out.println(fullName.substring(5));

     printLetters(fullName);   
     printLetters(name);
    }
}