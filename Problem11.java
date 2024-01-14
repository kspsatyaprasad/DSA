import java.lang.Math;

// Class to compute the difference between
// the square of sums and the sum of squares
public class Problem11 {

    // Method to calculate the square difference
    static int calculateSquareDifference(int number) {
        int squareSum = 0, sum = 0;

        for (int i = 1; i <= number; i++) {
            squareSum += i * i;  // Sum of squares
            sum += i;  // Sum of numbers
        }

        int sumSquare = sum * sum;  // Square of sum
        int difference = Math.abs(squareSum - sumSquare);  // Absolute difference
        return difference;
    }

    // Main method
    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Square difference for first " + limit + " numbers: " + calculateSquareDifference(limit));
    }
}
