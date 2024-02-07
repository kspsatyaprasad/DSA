class Problem34 {
    // Method to return the smallest element in an array
    public static int getSmallest(int[] numbers) {
        int smallest = numbers[0];

        // Iterate through the array to find the smallest element
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }
        return smallest;
    } // End of getSmallest method

    public static void main(String[] args) {
        int[] dataset = { 9, 2, 3, 6 };

        System.out.print("Given Array: ");
        for (int element : dataset)
            System.out.print(element + " ");
        System.out.println();

        int minimumValue = getSmallest(dataset);
        System.out.println("Smallest Number in the Array: " + minimumValue);
    }
}
