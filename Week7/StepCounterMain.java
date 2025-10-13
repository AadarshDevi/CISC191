package week_7;

import java.util.*;

public class StepCounterMain {
    public static void main(String[] args) {
        int steps = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Enter number of steps (must not be negative): ");
                try {
                    steps = Integer.parseInt(scanner.nextLine());
                    if (steps < 0) throw new NegativeNumberException();
                } catch (InputMismatchException e) {
                    System.err.println("Value entered is not a number.");
                } catch (NegativeNumberException e) {
                    System.err.println("Step number cannot be negative");
                }
            } while (steps < 0);
        }
        try {
            Pedometer pedometer = new Pedometer(steps);
            double noOfMiles = pedometer.stepsToMiles();
            System.out.printf("The number of miles is %.2f", noOfMiles);
        } catch (NegativeNumberException e) {
            System.err.println("Step number cannot be negative");
        }
    }
}
