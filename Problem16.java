// Java program to check if a specific word exists in a given sentence
class WordSearcher {

    // Method to check if the sentence contains the specified word
    static boolean checkWordInSentence(String sentence, String searchWord) {
        // Splitting the sentence into words
        String[] words = sentence.split(" ");

        // Iterating through each word in the sentence
        for (String currentWord : words) {
            // If the current word matches the search word
            if (currentWord.equals(searchWord)) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        String sentence = "Geeks for Geeks";
        String wordToFind = "Geeks";

        // Checking if the word is present in the sentence
        if (checkWordInSentence(sentence, wordToFind)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
