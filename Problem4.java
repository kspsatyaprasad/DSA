import java.io.*;

// Program to check divisibility by 6
public class Problem4 {

    // Method to check if a number is divisible by 6
    static boolean isDivisibleBySix(long number) {
        return number % 6 == 0;
    }

    // Main method
    public static void main(String[] args) {
        long testNumber = 36358839596L;

        // Check and display if the number is divisible by 6
        if (isDivisibleBySix(testNumber)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
