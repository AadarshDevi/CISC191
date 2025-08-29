# Word Frequency

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1

### Code
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
### What to submit?
1. The flowchart of my thought process: [Drawio Flowchart](word_frequency_flowchart.drawio)
1. Flowchart as an image: [Drawio Flowchart](word_frequency_flowchart.png)
2. Explain how will you perform a frequency analysis of a website if you hve to do it?
 - To do a frequency analysis of a website,
   1. I would create a arraylist of strings
   2. I will go through the entire website reading every word.
   2. it will contain unique words from the website.
   3. this will create a list of unique words.
   4. i will then convert it to a string array
   5. I can then use these words to read the website for the frequency of the words. 
   4. I will create a new int array to store the frequencies of the words
   5. the int array will have the size of the string array above.
   6. i will loop through each word and do a case-insensitive search.
   7. when each word is read, it will go through the arraylist to find the word.
   8. it will get the index of the word
   9. it will take that index and add 1 to the freuency of that word.
   10. this will happen for all words in the website.
   11. after all the words are read, I will printout the word and its frequency
3. Challenges faced when performing the lab: Challenges I faced:
     1. understanding the question
     2. not understanding the format of the assignment
     3. do not know where to place the flowchart and video
4. The video explaining the code: https://youtu.be/VaWK-7vunM0
5. The code for the assignment: [Lab Java Code](WordFrequency.java)
