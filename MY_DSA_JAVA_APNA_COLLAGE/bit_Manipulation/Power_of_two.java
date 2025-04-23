package bit_Manipulation;

public class Power_of_two {
    public static boolean isPowerOfTwo(int n) {
       if((n & (n - 1)) == 0);
       return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(16));
    }
}
