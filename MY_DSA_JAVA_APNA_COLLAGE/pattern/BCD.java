import java.util.Scanner;

public class BCD {
    public static void binaryToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        while (binaryNumber > 0) {
            int digit = binaryNumber % 10;
            decimalNumber += digit * Math.pow(2, power);
            binaryNumber /= 10;
            power++;
        }
        System.out.println("Decimal number: " + decimalNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();
        binaryToDecimal(binaryNumber);
        scanner.close();
    }  }
