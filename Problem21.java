import java.io.*;
import java.util.*;

// Class to find and display the longest strings in an array
class Problem21 {

    // Method to find and return the longest strings in the array
    public static ArrayList<String> findLongestStrings(String[] stringArray, int arrayLength) {

        // Handling the case where the array is empty
        if (arrayLength == 0) {
            return new ArrayList<String>();
        }

        // Initializing with the length of the first string
        int maxLength = stringArray[0].length();

        // Creating an ArrayList to store the longest strings
        ArrayList<String> longestStrings = new ArrayList<String>();
        longestStrings.add(stringArray[0]);

        // Iterating over the array
        for (int i = 1; i < arrayLength; i++) {

            // If a longer string is found
            if (stringArray[i].length() > maxLength) {
                maxLength = stringArray[i].length();
                longestStrings.clear();
                longestStrings.add(stringArray[i]);
            }

            // If a string with the current maximum length is found
            else if (stringArray[i].length() == maxLength) {
                longestStrings.add(stringArray[i]);
            }
        }

        // Returning the list of longest strings
        return longestStrings;
    }

    // Main method
    public static void main(String[] args) {
        String[] stringArray = { "GeeksforGeeks", "FreeCodeCamp", "StackOverFlow", "MyCodeSchool" };
        int arrayLength = stringArray.length;

        // Getting the longest strings
        ArrayList<String> result = findLongestStrings(stringArray, arrayLength);

        // Printing the result
        for (String str : result) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
