class ArrayProductCalculator {
    /* Method to compute and display the product array for any given array */
    void computeProductArray(int arr[], int size) {
        if (size == 1) {
            System.out.print(0);
            return;
        }

        int temp = 1;
        int[] product = new int[size];

        /* Initialize the product array as 1 */
        for(int i = 0; i < size; i++)
            product[i] = 1;

        /* Construct the product array using prefix products */
        for (int i = 0; i < size; i++) {
            product[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        /* Modify the product array using suffix products */
        for (int i = size - 1; i >= 0; i--) {
            product[i] *= temp;
            temp *= arr[i];
        }

        /* Print the modified product array */
        System.out.println("Modified product array is:");
        for (int i = 0; i < size; i++)
            System.out.print(product[i] + " ");
    }

    public static void main(String[] args) {
        ArrayProductCalculator calculator = new ArrayProductCalculator();
        int[] arr = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        calculator.computeProductArray(arr, n);
    }
}
