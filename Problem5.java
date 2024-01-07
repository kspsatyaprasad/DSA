import java.io.*;

// Class to determine if a number is a palindrome recursively
public class Problem5 {

    // Method to check if the number is a single digit
    static boolean isSingleDigit(int number) {
        return number >= 0 && number < 10;
    }

    // Recursive utility function to check palindrome
    static int checkPalindrome(int number, int reverse) {

        if (number == 0) {
            return reverse;
        } else {
            reverse = checkPalindrome(number / 10, reverse);
        }

        if (number % 10 == reverse % 10) {
            return reverse / 10;
        } else {
            throw new RuntimeException("Number is not a palindrome");
        }
    }

    // Method to initiate the palindrome check
    static boolean isPalindrome(int number) {
        if (number < 0)
            number = -number;

        int reversedNumber = number;

        try {
            checkPalindrome(number, reversedNumber);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] testNumbers = {12421, 1231, 12, 88, 8999};
        for (int num : testNumbers) {
            System.out.println(num + " is palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
        }
    }
}
