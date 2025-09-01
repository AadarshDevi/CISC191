# Sorting

## TODO:
- video link

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
1. The flowchart of my thought process: [Drawio Flowchart](sorting_flowchart.drawio)
1. Flowchart as an image: [Drawio Flowchart](sorting_flowchart.png)
2. Explain why you selected a particular sorting algorithm.
 - I chose to use Selection Sort because it is faster than bubble sort and I was
   familiar with it. Selection sort is one of the easier sorting algorithms and I was able
   to visualize the sorting proccess with just some small challenges. 
3. Challenges faced when performing the lab: Challenges I faced:
     1. I forgot that the first element in ```int[] inputArray = {5, 10, 4, 39, 12, 2};``` was used
        to store the length of the array.
     2. Had to refresh on selection sort algorithm. 
4. The video explaining the code: [Insert YouTube Link] (https://youtu.be/-Xk42QqpWG8)
5. The code for the assignment: [Lab Java Code](Sorting.java)
