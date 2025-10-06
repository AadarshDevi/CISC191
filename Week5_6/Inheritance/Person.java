package week_5_6.inheritance;

public class Person {
    private int ageYears;
    private String lastName;

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.ageYears = age;
    }

    public String getName() {
        return lastName;
    }

    public void setName(String userName) {
        lastName = userName;
    }

    public int getAge() {
        return ageYears;
    }

    public void setAge(int numYears) {
        ageYears = numYears;
    }

    // Other parts omitted

    public void printAll() {
        System.out.print("Name: " + lastName);
        System.out.print(", Age: " + ageYears);
    }
}
