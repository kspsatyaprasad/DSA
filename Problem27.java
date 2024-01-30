// Java program to determine the maximum product of a subarray
import java.io.*;

class MaxProductFinder {
    /* Method to compute the maximum product of a subarray */
    static int findMaxProduct(int[] numbers) {
        // Initialize the maximum product to the first element
        int maxProduct = numbers[0];
        int arrayLength = numbers.length;

        for (int start = 0; start < arrayLength; start++) {
            int currentProduct = numbers[start];
            // Iterate through the array, multiplying elements
            for (int end = start + 1; end < arrayLength; end++) {
                // Update the maxProduct if currentProduct is larger
                maxProduct = Math.max(maxProduct, currentProduct);
                currentProduct *= numbers[end];
            }
            // Check the last product for the current start
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] inputArray = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("Maximum product of a subarray is " + findMaxProduct(inputArray));
    }
}
