public class WordFrequency {

    /**
     * the main method that is run to start the program
     * @param args cli arguments
     */
    public static void main(String[] args) {

        // Printing out basic lab details
        System.out.println("CISC 191 Week 1: Lab: Word Frequency");

        // list of words
        String[] inputArray = new String[]{
                "hey",
                "Hi",
                "Mark",
                "hi",
                "mark"
        };

        // loops through each word in inputArray
        for (String word : inputArray) {

            // gets the frequency of the word in inputArray
            int frequency = getWordFrequency(inputArray, inputArray.length, word);

            // prints out the word and its frequency
            System.out.println(word + " " + frequency);
        }
    }

    /**
     * This method takes in a string array and target word and returns
     * the number of occurrence of that word. Case is ignored when
     * checking for matches.
     *
     * @param wordsList the list of words to be searched
     * @param listSize  the length of the words list string array
     * @param currWord  the word to be found
     * @return the frequency num of the currWord found in wordsList
     */
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {

        // the number of currWord in wordsList
        int occurrence = 0;

        // goes through the array to find the word
        for (int i = 0; i < listSize; i++) {

            // checks if the word equals the
            // word in the array at index i. the
            // checking is case-insensitive
            if (wordsList[i].equalsIgnoreCase(currWord)) {

                // update occurrence when match is found
                occurrence++;
            }
        }

        // returns the no of occurrence of currWord
        return occurrence;
    }
}
