## Basic Info
- Author: Aadarsh Devi
- Submission Date: Oct 12, 2025
- Assignment: Week 9 Lab 9.1

## Code
#### StepCounterMain.java
```java
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {
    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in); // user input
        boolean running = true; // boolean to run while loop

        // feedback loop
        while (running) {

            // get word
            String value = getInput();

            // check if word is
            if (value.equalsIgnoreCase("--exit")) {
                System.out.println("Exiting Palindrome Checker...");
                scanner.close();
                running = false;
                continue; // starts next iteration and exits since condition met
            }

            boolean isPalindrome = checkPalindrome(value);
            if (isPalindrome) System.out.println("Yes, " + value + " is a palindrome.");
            else System.out.println("No, \"" + value + "\" is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(String value) {

        if (value.isBlank()) return false;
        Deque<String> characterizedValue = new ArrayDeque<>(Arrays.asList(value.split("")));
        int dequeLength = characterizedValue.size();

        for (
                int startPointer = 0, endPointer = dequeLength - 1; startPointer <= dequeLength + 1 && startPointer <= endPointer; startPointer++, endPointer--) {
            if (startPointer == endPointer) return true;
            String startLetter = characterizedValue.getFirst();
            String endLetter = characterizedValue.getLast();
            if (!startLetter.equalsIgnoreCase(endLetter)) return false;
            characterizedValue.pollFirst();
            characterizedValue.pollLast();
        }

        return true;
    }

    private static String getInput() {
        boolean invalidInput = true;
        String value = null;
        while (invalidInput) {
            System.out.print("Enter a word (\"--exit\" to exit): ");
            value = scanner.nextLine();
            if (!value.isBlank()) invalidInput = false;
            else System.err.println("Please Enter a word");
        }
        return value.toLowerCase();
    }
}
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](palindrome_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](palindrome_flowchart_image.png)
3. What were your challenges in performing the lab:
    - Trying to figure out how to use _**Deque**_
    - 2 letter words with the same letter (aa, ii, ee, 55, 11) threw _**NoSuchElementException**_
5. Code for the assignment:
   - [PalindromeChecker.java](PalindromeChecker.java)
7. Video explaining code: TODO: [Video Explanation](https://youtu.be/k9r6yqKk80k)
