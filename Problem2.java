import java.io.*;

public class Problem2 {
    //This is the Program for average of an array (Iterative and Recursive)
    // Method to compute the average of elements in an array
    static double computeAverage(int[] numbers, int totalElements) {

        // Accumulating the sum of the array elements
        int totalSum = 0;
        for (int index = 0; index < totalElements; index++) {
            totalSum += numbers[index];
        }

        // Calculating the average
        return (double) totalSum / totalElements;
    }
// test comment
    // Main method to run the program
    public static void main(String[] args) {

        int[] sampleNumbers = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = sampleNumbers.length;

        System.out.println("The average is: " + computeAverage(sampleNumbers, length));
    }
}
