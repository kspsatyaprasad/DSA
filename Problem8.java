// Java program to locate the largest value in a matrix
public class Problem8 {

    static final int ROWS = 4;
    static final int COLS = 4;

    // Method to determine the largest element in a 2D array
    static int locateLargestElement(int[][] matrix) {

        // Initialize the largest element to the smallest possible integer value
        int largestElement = Integer.MIN_VALUE;

        // Iterate over each element in the matrix to find the largest one
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (matrix[row][col] > largestElement) {
                    largestElement = matrix[row][col];
                }
            }
        }

        // Return  },the found largest element
        return largestElement;
    }

        // Main method to execute the program
        public static void main(String[] args) {
            int[][] matrix = {
                    { 1, 2, 3, 4 },
                    { 25, 6, 7, 8
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("The largest element in the matrix is: " + locateLargestElement(matrix));
    }
}
