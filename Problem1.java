import java.io.*;
//Counting number of even and odd elements in an array

public class Problem1 {

    // Function to count even and odd numbers in an array
    static void countEvenOddElements(int[] numbers, int sizeOfArray) {
        int countOfEvens = 0;
        int countOfOdds = 0;

        // Iterating through the array
        for (int index = 0; index < sizeOfArray; index++) {

            // Using bitwise operation to check even/odd
            if ((numbers[index] % 2) == 0)
                countOfEvens++;
            else
                countOfOdds++;
        }

        System.out.println("Even numbers count: " + countOfEvens
                + " | Odd numbers count: " + countOfOdds);
    }

    // Main method
    public static void main(String[] args) {
        int[] sampleArray = { 2, 3, 4, 5, 6 };
        int lengthOfArray = sampleArray.length;

        // Calling the function to count even and odd elements
        countEvenOddElements(sampleArray, lengthOfArray);
    }
}
