package bit_Manipulation;

public class getIthBit { 
    public static void get_ith_bit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        get_ith_bit(10, 3);
    }}