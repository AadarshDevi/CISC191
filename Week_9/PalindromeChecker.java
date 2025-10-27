
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
