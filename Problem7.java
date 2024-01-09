// Java program to check whether a number is a perfect square
public class Problem7 {

    // Method to verify if a number is a perfect square
    static boolean verifyPerfectSquare(int number) {
        if (number >= 0) {
            // Computing the square root of the number
            int squareRoot = (int)Math.sqrt(number);

            // Comparing the square of the square root with the original number
            return (squareRoot * squareRoot) == number;
        }
        return false;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int testNumber = 2502;

        // Printing result
        if (verifyPerfectSquare(testNumber))
            System.out.print("Yes, it's a perfect square.");
        else
            System.out.print("No, it's not a perfect square.");
    }
}
