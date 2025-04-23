public class character_parrten {
    static int n = 10;
    static char ch = 'A';

    public static void printChar_1() {
        for (int line = 1; line <= n;line++)
         for (int chars = 1; chars <= line; chars++)
        {
            System.out.print(ch);
            ch++;
        }
  
    }

    public static void printChar_2() {
        for (int line = 1; line <= n;line++)
        for (int chars = 1; chars <= line; chars++)
         {
            System.out.print(ch);
            ch++;
        }
      
        ch++;
    }    public static void main(String[] args) {
        printChar_1();
        printChar_2();
    }
}
