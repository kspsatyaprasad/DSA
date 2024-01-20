// Java program to evaluate if a number is an Armstrong number
public class Problem12 {

    // Method to compute the power of a number
    int calculatePower(int base, long exponent) {
        if (exponent == 0)
            return 1;
        if (exponent % 2 == 0)
            return calculatePower(base, exponent / 2) * calculatePower(base, exponent / 2);
        return base * calculatePower(base, exponent / 2) * calculatePower(base, exponent / 2);
    }

    // Method to determine the number of digits (order) in a number
    int computeOrder(int number) {
        int digits = 0;
        while (number != 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }

    // Method to verify if a number is an Armstrong number
    boolean checkArmstrong(int number) {
        int order = computeOrder(number);
        int temp = number, sum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += calculatePower(remainder, order);
            temp /= 10;
        }

        // Checking the Armstrong condition
        return (sum == number);
    }

    // Main method for execution
    public static void main(String[] args) {
        Problem12 checker = new Problem12();
        int num1 = 153;
        System.out.println("Is " + num1 + " an Armstrong number? " + checker.checkArmstrong(num1));
        int num2 = 1253;
        System.out.println("Is " + num2 + " an Armstrong number? " + checker.checkArmstrong(num2));
    }
}
