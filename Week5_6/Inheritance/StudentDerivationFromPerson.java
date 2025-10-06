package week_5_6.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDerivationFromPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
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

        Student courseStudent = new Student(lastName, age, id);
        courseStudent.printAll();
    }
}
