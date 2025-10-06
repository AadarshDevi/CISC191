package week_5_6.derived_classes;

public class Course {
    private final String classNum;
    private final String className;

    public Course(String classNum, String className) {
        this.classNum = classNum;
        this.className = className;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("\tCourse Number: " + classNum);
        System.out.println("\tCourse Name: " + className);
    }
}
