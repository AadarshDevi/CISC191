package week_5_6.inheritance;

public class Student extends Person {
    private int idNum;

    public Student(String lastName, int age, int idNum) {
        super(lastName,age);
        this.idNum=idNum;
    }

    public void setID(int studentId) {
        idNum = studentId;
    }

    public int getID() {
        return idNum;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(", ID: " + idNum);
    }
}
