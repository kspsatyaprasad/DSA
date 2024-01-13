import java.io.*;

// Class to calculate the sum of the digits of a number
public class Problem10 {

    // Method to calculate the sum of digits
    static int calculateDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {
        int num = 687;

        // Calling the method to calculate digit sum
        System.out.println("Sum of the digits: " + calculateDigitSum(num));
    }
}
