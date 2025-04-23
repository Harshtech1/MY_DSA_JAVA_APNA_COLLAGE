package bit_Manipulation;

import java.util.Scanner;

public class Bit_odd_Even {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public void checkBitOddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number"); 
        }
    }    
    public static void main(String[] args) {
        Bit_odd_Even obj = new Bit_odd_Even();
        obj.checkBitOddEven(5);
        obj.checkBitOddEven(4);
       getIthBit(10, 2);   


    } 
    
    public static int getIthBit(int n, int j) {
        int bitMask = 1 << j;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
}