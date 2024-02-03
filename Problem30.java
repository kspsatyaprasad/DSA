import java.io.*;
import java.util.*;

class Problem30 {
    // Method to display triplets with a sum of zero
    static void displayZeroSumTriplets(int[] numbers, int size) {
        boolean isTripletFound = false;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                        isTripletFound = true;
                    }
                }
            }
        }

        // If no such triplets are found
        if (!isTripletFound)
            System.out.println("No such triplets exist.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] numbers = { 0, -1, 2, -3, 1 };
        int length = numbers.length;
        displayZeroSumTriplets(numbers, length);
    }
}
