// Java program to determine if an array is sorted using recursion
class Problem14 {

    // Recursive method to check if an array is sorted
    static int isSorted(int[] sequence, int length) {
        // Base case: if the array has one or no elements
        if (length == 1 || length == 0)
            return 1;

        // Checking if the last two elements are unsorted
        if (sequence[length - 1] < sequence[length - 2])
            return 0;

        // Recursively checking the remaining array
        return isSorted(sequence, length - 1);
    }

    // Main method
    public static void main(String[] args) {
        int[] array = { 20, 23, 23, 45, 78, 88 };
        int size = array.length;
        if (isSorted(array, size) != 0)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
