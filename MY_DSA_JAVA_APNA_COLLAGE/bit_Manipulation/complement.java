package bit_Manipulation;

public class complement {    public static void main(String[] args) {
        int n = 10;
        int m = 1;
        int ans = 0;
        while(n != 0){
            int last_bit = n & 1;
            ans = ans + (last_bit ^ 1) * m;
            m = m * 2;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}