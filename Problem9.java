// Java program to identify the highest value in a given matrix
//testing commits
public class Problem9 {

    static final int ROW_COUNT = 4;
    static final int COLUMN_COUNT = 4;

    // Method to locate the highest element in a matrix
    static int locateHighestValue(int[][] matrix) {

        // Start with the lowest possible integer value
        int highestValue = Integer.MIN_VALUE;

        // Traverse each element of the matrix
        for (int rowIndex = 0; rowIndex < ROW_COUNT; rowIndex++) {
            for (int colIndex = 0; colIndex < COLUMN_COUNT; colIndex++) {
                // Update the highestValue if a larger number is found
                if (matrix[rowIndex][colIndex] > highestValue) {
                    highestValue = matrix[rowIndex][colIndex];
                }
            }
        }

        // Return the found highest value
        return highestValue;
    }

    // Main method
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 25, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Output the highest value in the matrix
        System.out.println("Maximum value in the matrix: " + locateHighestValue(matrix));
    }
}
