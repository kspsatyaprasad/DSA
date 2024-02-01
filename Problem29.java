import java.io.*;

// Class to demonstrate searching in a rotated sorted array
class RotatedArraySearch {

    // Method to perform the search
    static int searchInRotatedArray(int array[], int size, int target) {
        int pivot = findArrayPivot(array, 0, size - 1);

        // If no pivot found, the array is not rotated
        if (pivot == -1)
            return performBinarySearch(array, 0, size - 1, target);

        // Pivot found, determine which side to search
        if (array[pivot] == target)
            return pivot;
        if (array[0] <= target)
            return performBinarySearch(array, 0, pivot - 1, target);
        return performBinarySearch(array, pivot + 1, size - 1, target);
    }

    // Method to find the pivot in the array
    static int findArrayPivot(int array[], int low, int high) {
        if (high < low) return -1;
        if (high == low) return low;

        int mid = (low + high) / 2;
        if (mid < high && array[mid] > array[mid + 1])
            return mid;
        if (mid > low && array[mid] < array[mid - 1])
            return (mid - 1);
        if (array[low] >= array[mid])
            return findArrayPivot(array, low, mid - 1);
        return findArrayPivot(array, mid + 1, high);
    }

    // Binary search method
    static int performBinarySearch(int array[], int low, int high, int target) {
        if (high < low) return -1;

        int mid = (low + high) / 2;
        if (target == array[mid])
            return mid;
        if (target > array[mid])
            return performBinarySearch(array, mid + 1, high, target);
        return performBinarySearch(array, low, mid - 1, target);
    }

    // Main method to run the program
    public static void main(String args[]) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int arraySize = arr.length;
        int searchKey = 3;
        System.out.println("Index of the element is: " + searchInRotatedArray(arr, arraySize, searchKey));
    }
}
