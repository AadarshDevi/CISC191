## Basic Info
- Author: Aadarsh Devi
- Submission Date: Oct 12, 2025
- Assignment: Week 7 Lab

## Code
#### StepCounterMain.java
```java
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
```

#### NegativeNumberException.java
```java
public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Number cannot be less than 0.");
    }
}
```

#### Pedometer.java
```java
public class Pedometer {
    private int steps;

    public Pedometer(int steps) throws NegativeNumberException {
        if (steps < 0) throw new NegativeNumberException();
        this.steps = steps;
    }

    public double stepsToMiles() {
        return (double) (steps) / 2000;
    }

}

```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](exceptions_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](exceptions_flowchart_image.png)
3. What were your challenges in performing the lab:
    - Struggling to put Exceptions because I put the exceptions when I get user input instead putting it in the object constructor itself.
5. Code for the assignment:
   - [StepCounterMain.java](StepCounterMain.java)
   - [NegativeNumberException.java](NegativeNumberException.java)
   - [Pedometer.java](Pedometer.java)
7. Video explaining code: TODO: [Video Explanation](https://youtu.be/rSDZjY0OosM)
