# Word Frequency

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1

```java
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
```
