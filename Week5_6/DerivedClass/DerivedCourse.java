package week_5_6.derived_classes;

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
}
