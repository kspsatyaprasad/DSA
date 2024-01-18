import java.io.*;

// Class to generate and print the multiplication table of a number
public class Problem15 {

    // Main method to run the program
    public static void main(String[] args) {
        // Number for which the table is to be printed
        int number = 5;

        // Loop to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
