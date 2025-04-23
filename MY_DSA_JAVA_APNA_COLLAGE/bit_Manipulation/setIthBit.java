package bit_Manipulation;

public class setIthBit {
    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }public static int updateBit(int n, int i, int newBit){
 n=clearBit(n, i);
 int bitMask = newBit<<i;
 return n | bitMask;
    
    }
    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~((0) << i);
        return n & bitMask;
    }
public static int clearIBitsin_range(int n, int i, int  j) {
    int a = ~((0)<<(j+1));  
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n & bitMask;
}


    public static void main(String[] args) {
        // System.out.println(setBit(10, 2));
        // System.out.println(clearBit(10, 1));
        // System.out.println(updateBit(10, 2,5));
        // System.out.println(clearIthBit(15, 2));
        System.out.println(clearIBitsin_range(10, 2, 4));
    }  

}
