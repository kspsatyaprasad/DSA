// Java program to find the maximum sum of a contiguous subarray
import java.io.*;

class Problem26 {
    // Main method to execute the program
    public static void main(String[] args) {
        int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Largest contiguous sum is " + findMaxSubarraySum(numbers));
    }

    // Method to compute the maximum sum of a contiguous subarray
    static int findMaxSubarraySum(int[] numbers) {
        int arrayLength = numbers.length;
        int maxSum = Integer.MIN_VALUE, sumEndingHere = 0;
        for (int i = 0; i < arrayLength; i++) {
            sumEndingHere += numbers[i];
            if (maxSum < sumEndingHere)
                maxSum = sumEndingHere;
            if (sumEndingHere < 0)
                sumEndingHere = 0;
        }
        return maxSum;
    }
}
