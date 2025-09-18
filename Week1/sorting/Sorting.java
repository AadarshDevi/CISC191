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
