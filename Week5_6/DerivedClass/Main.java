package week_5_6.derived_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String num;
        String name;
        String instructorName;
        String location = null;
        String classTime = null;

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.print("Enter Course Num: ");
        num = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Instructor Name (enter to exit): ");
        instructorName = scanner.nextLine();
        if (!instructorName.isBlank()) {
            System.out.print("Enter Location: ");
            location = scanner.nextLine();
            System.out.print("Enter Class Time: ");
            classTime = scanner.nextLine();
        }


        System.out.println();

        if (instructorName.isBlank()) {
            Course course = new Course(num, name);
            course.printInfo();
        } else {
            DerivedCourse derivedCourse = new DerivedCourse(num, name, instructorName, location, classTime);
            derivedCourse.printInfo();
        }
    }
}
