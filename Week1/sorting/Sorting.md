# Sorting

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1 Lab 1

### Code

In this lab, the array's 0th element tells us how many numbers there are in the array. So when iterating throught
the array, the 0th element must be skipped. to do this, the loops start at 1.

```java
public class Sorting {
    public static void main(String[] args) {
        System.out.println("CISC 191 Week 1 Lab 1: Sorting");

        // array containing numbers to test
        int[] inputArray = {5, 10, 4, 39, 12, 2};

        System.out.print("Array Before Sorting: ");
        for (int i = 1; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i != inputArray.length - 1) System.out.print(", ");
        }
        System.out.println();

        sortArray(inputArray); // sorting the array

        System.out.print("Sorted Array (Descending Order): ");
        for (int i = 1; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i != inputArray.length - 1) System.out.print(", ");
        }
    }

    /**
     * This takes in an int array and sorts the values by descending order. The
     * sorting algorithm used for sorting the array is selection sort.
     *
     * @param myArr   this is the int array to be sorted
     */
    public static void sortArray(int[] myArr) {

        // goes through each of the values in the array
        for (int startingIndex = 1; startingIndex < myArr.length; startingIndex++) {

            // sets the first num in array as the max value and with its pointer
            int maxNum = myArr[startingIndex];
            int maxNumIndex = startingIndex;

            // values after the main value
            for (int pointer = startingIndex + 1; pointer < myArr.length; pointer++) {

                // gets the number at the inner index.
                int pointerNum = myArr[pointer];

                // save new max num and index if old max is less than new max
                if (pointerNum > maxNum) {
                    maxNum = pointerNum;
                    maxNumIndex = pointer;
                }
            }

            // switches the values in the array
            int temp = myArr[startingIndex];
            myArr[startingIndex] = myArr[maxNumIndex];
            myArr[maxNumIndex] = temp;
        }
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
     3. A major hardship for finishing the assignment was trying to explain Selection Sort.
4. The video explaining the code: [YouTube Link](https://youtu.be/-Xk42QqpWG8)
5. The code for the assignment: [Lab Java Code](Sorting.java)
