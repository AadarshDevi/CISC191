## Basic Info
- Author: Aadarsh Devi
- Submission Date: Oct 5, 2025
- Assignment: Week 5/6 Lab

## Code
#### Course.java
```java
public class Course {
    private final String classNum;
    private final String className;

    public Course(String classNum, String className) {
        this.classNum = classNum;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getClassNum() {
        return classNum;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("\tCourse Number: " + classNum);
        System.out.println("\tCourse Name: " + className);
    }
}
```

#### DerivedCourse.java
```java
public class DerivedCourse extends Course {
    private final String instructorName;
    private final String location;
    private final String class_time;

    public DerivedCourse(String classNum, String className, String instructorName, String location, String class_time) {
        super(classNum, className);
        this.instructorName = instructorName;
        this.location = location;
        this.class_time = class_time;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\tInstructor Name: " + instructorName);
        System.out.println("\tLocation: " + location);
        System.out.println("\tClass Time: " + class_time);
    }

    public String getClass_time() {
        return class_time;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getLocation() {
        return location;
    }
}

```

#### Main.java
```java
public class Main {
    public static void main(String[] args) {

        // defining the variables used to make the course object
        String num;
        String name;
        String instructorName;
        String location = null;
        String classTime = null;

        // for user input
        Scanner scanner = new Scanner(System.in);

        // get course information
        System.out.print("Enter Course Num: ");
        num = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        name = scanner.nextLine();

        // Instructure Name is used as a divide of input
        // when the instructor name is empty, then the
        // object created is Course else DerivedCourse
        System.out.print("Enter Instructor Name (enter to exit): ");
        instructorName = scanner.nextLine();
        if (!instructorName.isBlank()) {
            System.out.print("Enter Location: ");
            location = scanner.nextLine();
            System.out.print("Enter Class Time: ");
            classTime = scanner.nextLine();
        }


        System.out.println();

        // create and print Course obj
        if (instructorName.isBlank()) {
            Course course = new Course(num, name);
            course.printInfo();
        } else {
            DerivedCourse derivedCourse = new DerivedCourse(num, name, instructorName, location, classTime);
            derivedCourse.printInfo();
        }
    }
}
```



## What to Submit
1. The flowchart of my thought process: [Draw.io file](derived_classes_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](derived_classes_flowchart_image.png)
3. What were your challenges in performing the lab: I did not have any challenges.
5. Code for the assignment:
   - [Course.java](Course.java)
   - [DerivedCourse.java](DerivedCourse.java)
   - [Main.java](Main.java)
7. Video explaining code: TODO: [Video Explanation](https://youtu.be/h2gF0WsprcA)
