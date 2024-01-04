// Java code to convert number digits to words
public class Problem3 {
// test changes
    // Method to print the word for each digit
    static void displayWordForDigit(char digit) {

        // Deciding the word based on the digit
        String word;
        switch (digit) {
            case '0': word = "Zero"; break;
            case '1': word = "One"; break;
            case '2': word = "Two"; break;
            case '3': word = "Three"; break;
            case '4': word = "Four"; break;
            case '5': word = "Five"; break;
            case '6': word = "Six"; break;
            case '7': word = "Seven"; break;
            case '8': word = "Eight"; break;
            case '9': word = "Nine"; break;
            default: word = "Invalid"; break;
        }

        System.out.print(word + " ");
    }

    // Method to convert digits of a number into words
    static void convertToWords(String number) {
        for (int index = 0; index < number.length(); index++) {
            displayWordForDigit(number.charAt(index));
        }
    }

    // Main method
    public static void main(String[] args) {
        String number = "123";
        convertToWords(number);
    }
}
