package Arrays;

public class MAX_SUBArray_sum {
    public static void MAX_SUBArray_sum1(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0; // Reset currentSum for each subarray

                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }

                System.out.print(currentSum + " ");

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println(); // New line after each starting index
        }

        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        MAX_SUBArray_sum1(numbers);
    }
}
