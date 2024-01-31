import java.io.*;

// Class to demonstrate finding the smallest element in an array
class MinimumElementFinder {

    // Method to return the smallest element in the given array
    static int getMinimumElement(int[] numbers, int length) {
        int minimumElement = numbers[0];

        // Loop through the array to find the smallest element
        for (int index = 0; index < length; index++) {
            if (numbers[index] < minimumElement) {
                minimumElement = numbers[index];
            }
        }

        return minimumElement;
    }

    // Main method to run the program
    public static void main (String[] args) {
        int[] inputArray = { 5, 6, 1, 2, 3, 4 };
        int arraySize = inputArray.length;
        System.out.println("The minimum element in the array is: " + getMinimumElement(inputArray, arraySize));
    }
}
