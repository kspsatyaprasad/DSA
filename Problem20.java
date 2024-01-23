import java.util.*;

// Java program to identify the second largest element in an array
class Problem20 {

    // Method to find and print the second largest element in the array
    static void findAndPrintSecondLargest(Integer[] array, int arraySize) {
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Iterating from the second element as the first is the largest
        for (int i = 1; i < arraySize; i++) {
            // Check if the current element is not equal to the largest
            if (array[i] != array[0]) {
                System.out.println("The second largest element is " + array[i]);
                return;
            }
        }

        System.out.println("There is no second largest element");
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Integer[] array = { 12, 35, 1, 10, 34, 1 };
        int size = array.length;
        findAndPrintSecondLargest(array, size);
    }
}
