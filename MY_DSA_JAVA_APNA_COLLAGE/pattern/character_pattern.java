public class character_pattern {
    static int n =5;
    
    public static void printChar_1() {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(); // Add newline after each line
        }
    }
    
    public static void printChar_2() {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <=n-line+1; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(); // Add newline after each line
        }
    }
    
    public static void main(String[] args) {
        printChar_1();
        System.out.println("***");
        printChar_2();
    }
}
