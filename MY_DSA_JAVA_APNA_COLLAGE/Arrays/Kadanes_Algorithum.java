package Arrays;

 public class Kadanes_Algorithum {

//     // Prefix Sum approach (O(n^2))
//     public static void MAX_SUBArray_sum1(int numbers[]) {
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         prefix[0] = numbers[0];

//         // Creating prefix sum array
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         // Calculating subarray sums using prefix
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;

//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 System.out.print(currentSum + " ");
//                 if (maxSum < currentSum) {
//                     maxSum = currentSum;
//                 }
//             }
//         }
//         System.out.println();
//         System.out.println("Max Sum using Prefix Sum: " + maxSum);
//     }

    // Kadane’s Algorithm (O(n))
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max Sum using Kadane's Algorithm: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // MAX_SUBArray_sum1(numbers);
        kadanes(numbers);
    }
}
