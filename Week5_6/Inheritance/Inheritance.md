## Basic Info
- Author: Aadarsh Devi
- Submission Date: Oct 5, 2025
- Assignment: Week 5/6 Lab

## Code
#### Person.java (Slightly Modified)
Added methods:
```java
// getters and setters for ageYears and lastName

public Person(String lastName, int age) {
    this.lastName = lastName;
    this.ageYears = age;
}

public void printAll() {
    System.out.print("Name: " + lastName);
    System.out.print(", Age: " + ageYears);
}
```

#### Person.java (Slightly Modified)
Added methods:
```java
// getter and setter for idNum

public Student(String lastName, int age, int idNum) {
    super(lastName,age);
    this.idNum=idNum;
}

@Override
public void printAll() {
    super.printAll();
    System.out.println(", ID: " + idNum);
}
```

#### StudentDerivationFromPerson.java
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDerivationFromPerson {
    public static void main(String[] args) {

        // scanner for user input
        Scanner scanner = new Scanner(System.in);

        // get user's last name
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // gets the age of the user. this is a do-while loop so
        // that the value entered will always be an int
        boolean validAge = false;
        int age = 0;
        do {
            try {
                validAge = false;
                System.out.print("Enter Age: ");
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("ERROR: Please enter a number.");
                scanner.next();
                validAge = true;
            }
        } while (validAge);

        // gets the id of the user. this is a do-while loop so
        // that the value entered will always be an int
        boolean validID = false;
        int id = 0;
        do {
            try {
                validID = false;
                System.out.print("Enter ID: ");
                id = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("ERROR: Please enter a number.");
                scanner.next();
                validID = true;
            }
        } while (validID);

        // Create and print Student obj
        Student courseStudent = new Student(lastName, age, id);
        courseStudent.printAll();
    }
}
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](inheritance_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](inheritance_flowchart_image.png)
3. What were your challenges in performing the lab:
   - Trying to stop the program from going into an infinite loop.
   - `\n` was left in buffer when doing `scanner.nextInt()`
5. Code for the assignment:
   - [Person.java](Person.java)
   - [Student.java](Student.java)
   - [StudentDerivationFromPerson.java](StudentDerivationFromPerson.java)
7. Video explaining code: TODO: [Video Explanation](link)
