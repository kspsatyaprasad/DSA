import java.io.*;

// Java program to recursively determine if a number is prime
class PrimeChecker {

    static int currentDivisor = 2;

    // Recursive method to check for prime
    public static boolean checkPrime(int number) {

        // Handling base cases
        if (number == 0 || number == 1) {
            return false;
        }

        // If number is divided evenly, it's not prime
        if (number == currentDivisor)
            return true;

        if (number % currentDivisor == 0) {
            return false;
        }

        currentDivisor++;
        return checkPrime(number);
    }

    // Main method for execution
    public static void main(String[] args) {
        int numToCheck = 35;

        if (checkPrime(numToCheck)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
