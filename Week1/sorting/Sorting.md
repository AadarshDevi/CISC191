# Sorting

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1 Lab 1

### Code
```java
    /**
     * This takes in an int array and sorts the values by descending order. The
     * sorting algorithm used for sorting the array is selection sort.
     *
     * @param myArr   this is the int array to be sorted
     * @param arrSize this is the size of the int array
     */
    public static void sortArray(int[] myArr, int arrSize) {

        /*
         * The Outer Loop: the outer loop is indexing the number to be replaced
         * initially the max num of the int array will be set to the first element
         * of the array (This is not the first element in the array but the second
         * as the first stores the length of the array).
         *
         * the starting index for the loop is 1. it contains the first element to
         * be sorted by the sorter.
         *
         * the loop will start from 1 and go till less than the array size
         */
        for (int startingIndex = 1; startingIndex < arrSize; startingIndex++) {

            // sets the first num in array as the max value
            int maxNum = myArr[startingIndex];

            // sets the index of max num to the index of first value
            int maxNumIndex = startingIndex;

            /*
             * this loop goes through each element from the outer index (outer loop
             * index) till the end of the array.
             *
             * the inner index, pointer, is the next index of the outer index so it
             * will start from outer index + 1 to less than array size
             */
            for (int pointer = startingIndex + 1; pointer < arrSize; pointer++) {

                // gets the number at the inner index.
                int pointerNum = myArr[pointer];

                /*
                 * checks if the inner num is greater than the outer num
                 * if inner num is greater than outer num,
                 * then the new max num (inner num) will become the new
                 * max num. it replaces the old max value
                 */
                if (pointerNum > maxNum) {

                    // inner index number is the new max num
                    maxNum = pointerNum;

                    // inner index is stored as the new index of the max value
                    maxNumIndex = pointer;
                }
            }

            /*
             * The code below switches the new max value and the old max value
             * gets the old max number from the outer index.
             * gets the new max number stored in the max num index.
             */
            int replacedNum = myArr[startingIndex];
            int newNum = myArr[maxNumIndex];

            /*
             * This code below switches the positions of the new a dn old max
             * numbers
             */
            int temp = replacedNum; // storing old max val so to not lose it
            replacedNum = newNum; // replacedNum now has the new max val
            newNum = temp; // newNum now has the old max val

            // This assigns the numbers back to the positions
            myArr[startingIndex] = replacedNum; // new the val at startingIndex is the new max val
            myArr[maxNumIndex] = newNum; // value at maxNumIndex is the old max val
        }
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
4. The video explaining the code: [Video File](word_frequency_video.mp4)
5. The code for the assignment: [Lab Java Code](WordFrequency.java)
