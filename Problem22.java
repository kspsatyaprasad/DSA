import java.util.*;

public class Problem22 {
    static ArrayList<Integer> findDuplicates(int[] array, int size) {
        // Incrementing each element in the array
        for (int i = 0; i < size; i++) {
            array[i] += 1;
        }

        // List to hold the result
        ArrayList<Integer> result = new ArrayList<>();

        // Variable to count the occurrences of the largest element
        int largestCount = 0;

        for (int i = 0; i < size; i++) {

            // Determining the index based on the current element
            int index = Math.abs(array[i]) > size
                    ? Math.abs(array[i]) / (size + 1)
                    : Math.abs(array[i]);

            // Handling the largest element
            if (index == size) {
                largestCount++;
                continue;
            }

            // Retrieving the value at the computed index
            int value = array[index];

            // Checking the conditions to identify duplicates
            if (value < 0) {
                result.add(index - 1);
                array[index] = Math.abs(array[index]) * (size + 1);
            } else if (value > size) {
                continue;
            } else {
                array[index] = -array[index];
            }
        }

        // Checking for multiple occurrences of the largest element
        if (largestCount > 1) {
            result.add(size - 1);
        }

        // Handling the case where there are no duplicates
        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        int length = numbers.length;
        ArrayList<Integer> duplicates = findDuplicates(numbers, length);
        for (Integer duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
