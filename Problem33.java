import java.io.*;

class Problem33 {

    // Utility function to perform quicksort on the given array
    public static int organize(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

    // Method to sort the array using quicksort algorithm
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int partitionIndex = organize(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    // Method to find two elements in array that sum to n
    public static int[] searchForSum(int[] array, int targetSum) {
        quickSort(array, 0, array.length - 1);

        int left = 0;
        int right = array.length - 1;

        int[] result = new int[2];

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum < targetSum)
                left++;
            else if (currentSum > targetSum)
                right--;
            else {
                result[0] = array[left];
                result[1] = array[right];
                return result;
            }
        }
        return new int[] {-1, -1}; // If no pair is found
    }

    public static void main(String args[]) {
        int target = 14;
        int[] numbers = {1, 2, 3, 4, 5};
        if(numbers.length > 0){
            int[] result = searchForSum(numbers, target);
            if(result[0] == -1)
                System.out.println("No pair found");
            else {
                System.out.println("Number 1 = " + result[0]);
                System.out.println("Number 2 = " + result[1]);
                System.out.println("Sum = " + target);
            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}
