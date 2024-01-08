// Java program to calculate the number of vowels in a given string
public class Problem6git {

    // Method to determine if a character is a vowel
    static boolean checkIfVowel(char character) {
        character = Character.toUpperCase(character);
        return character == 'A' || character == 'E' || character == 'I' ||
                character == 'O' || character == 'U';
    }

    // Method to count the number of vowels in a string
    static int getVowelCount(String inputString) {
        int vowelCount = 0;
        for (int index = 0; index < inputString.length(); index++) {
            if (checkIfVowel(inputString.charAt(index))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    // Main method
    public static void main(String[] args) {
        String testString = "abc de";

        // Display the count of vowels in the string
        System.out.println("Number of vowels: " + getVowelCount(testString));
    }
}
