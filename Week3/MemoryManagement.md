# Memory Management

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 14, 2025
- Assignment: Week 3 Lab

### Code Memory Management

For this, two classes were created. The `MemoryManagement` (Main) class and `Person` class.

The `Person` class is used to create person objects. The Person class has two private fields, `int age`
and `String name`.

```java
public class Person {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeAge(int age) {
        this.age = age;
    }
}
```

Below in the main class, I will be creating a new object and changing its parameters.







