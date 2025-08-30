package week_1;

public class Sorting {

    /**
     * The main method of the program.
     *
     * @param args cli arguments
     */
    public static void main(String[] args) {

        // Printing basic lab details
        System.out.println("CISC 191 Week 1 Lab 1: Sorting");

        /*
         * the int array containing the numbers to be sorted
         * the first element of the array is the length of
         * the array
         */
        int[] inputArray = {5, 10, 4, 39, 12, 2};

        /*
         * gets the length of the array. it is at index 0. "1"
         * is added because the last index of the array is 5. without
         * the +1 to arraySize, the last value was ignored.
         *
         * i.e. The value for looping through the elements start at index 1
         * so, 1 needs to be added to remove the last index being forgotten.
         */
        int arraySize = inputArray[0] + 1;

        System.out.print("Array Before Sorting: ");
        for (int i = 1; i < arraySize; i++) {
            // prints the number
            System.out.print(inputArray[i]);

            // prints ", " if the index is not the last index of the array
            if (i != arraySize - 1) System.out.print(", ");
        }
        System.out.println();

        // sorting the array
        sortArray(inputArray, arraySize);

        // printing out the array sorted in descending order
        System.out.print("Sorted Array (Descending Order): ");
        for (int i = 1; i < arraySize; i++) {

            // prints the number
            System.out.print(inputArray[i]);

            // prints ", " if the index is not the last index of the array
            if (i != arraySize - 1) System.out.print(", ");
        }

        // prints new line
        System.out.println();
    }

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
}

