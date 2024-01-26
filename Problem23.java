import java.io.*;

// Class to check if an array contains a pair with a given sum
class Problem23 {

    // Method to check for a pair with a given sum
    static boolean hasPairWithSum(int[] numbers, int arraySize, int targetSum) {
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        int[] array = { 0, -1, 2, -3, 1 };
        int sum = -2;
        int arraySize = array.length;

        if (hasPairWithSum(array, arraySize, sum)) {
            System.out.println("Pair with the given sum exists.");
        } else {
            System.out.println("No such pair found.");
        }
    }
}
