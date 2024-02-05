class Problem32 {

    // Function to merge two sorted arrays into a single sorted array
    public static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int firstSize = firstArray.length;
        int secondSize = secondArray.length;
        int[] mergedArray = new int[firstSize + secondSize];
        int i = 0, j = 0, k = 0;

        // Iterating over both arrays and merging them in sorted order
        while (i < firstSize && j < secondSize) {
            if (firstArray[i] < secondArray[j])
                mergedArray[k++] = firstArray[i++];
            else
                mergedArray[k++] = secondArray[j++];
        }

        // Appending remaining elements of the first array
        while (i < firstSize)
            mergedArray[k++] = firstArray[i++];

        // Appending remaining elements of the second array
        while (j < secondSize)
            mergedArray[k++] = secondArray[j++];

        return mergedArray;
    }

    // Driver method to test the above function
    public static void main(String args[]) {

        int[] firstArray = {1, 12, 14, 17, 23}; // a sorted array
        int[] secondArray = {11, 19, 27};  // another sorted array

        int[] mergedArray = mergeSortedArrays(firstArray, secondArray); // merging arrays

        System.out.print("Merged Sorted Array: ");
        for(int i = 0; i < firstArray.length + secondArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
