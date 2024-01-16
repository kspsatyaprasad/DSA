// Java program to calculate the factorial of a specified number
public class Problem13 {

    // Recursive method to compute the factorial of a number
    static int computeFactorial(int number) {
        if (number == 0)
            return 1;

        return number * computeFactorial(number - 1);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int targetNumber = 5;
        System.out.println("The factorial of " + targetNumber
                + " is " + computeFactorial(targetNumber));
    }
}
