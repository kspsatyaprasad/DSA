import java.io.*;

// Java program to sort 0s and 1s in an array
public class Problem17 {

    // Method to sort 0s and 1s in the array
    static void sortZeroesAndOnes(int arr[], int size) {
        int zeroCount = 0; // Counts the number of zeros

        // Count the number of 0s in the array
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }

        // Fill the array with 0s up to the zeroCount
        for (int i = 0; i < zeroCount; i++)
            arr[i] = 0;

        // Fill the remaining array with 1s
        for (int i = zeroCount; i < size; i++)
            arr[i] = 1;
    }

    // Method to print the array
    static void displayArray(int arr[], int size) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
        int length = arr.length;

        sortZeroesAndOnes(arr, length);
        displayArray(arr, length);
    }
}
