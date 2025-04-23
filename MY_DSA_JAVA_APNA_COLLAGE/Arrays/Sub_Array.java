package Arrays;

public class Sub_Array {
    public static void subarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + ", ");
                
                }int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                }
                System.out.print("Sum: " + sum);
                ts++;
                System.out.print("        |");
                System.out.println();
                
            }
          
            System.out.println("---------------------------");
        }
        System.out.println("Total Subarrays: " + ts+";;;;;;;;;");
    }
   public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
        
    }
    
}
