// Java program to reverse the digits of a given number
class Problem19 {

    /* Function to reverse the digits of a given number */
    static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int originalNumber = 4562;
        System.out.println("Reversed number is " + reverseNumber(originalNumber));
    }
}
