# Memory Management

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 14, 2025
- Assignment: Week 3 Lab

### Code Memory Management

For this lab I have created 4 classes:
1. `class MemoryManagement` (Main class)
4. `class Vehicle`

### Vehicle.java
```java
public class Vehicle {
    private int wheelCount;
    private String vehicleCompany;
    private String vehicleModel;
    private boolean isWorking;

    public Vehicle(String vehicleCompany, String vehicleModel, int wheelCount) {
        this.vehicleCompany = vehicleCompany;
        this.vehicleModel = vehicleModel;
        this.wheelCount = wheelCount;
        isWorking = true;
    }
}
```
### MemoryManagement.java
```java
Vehicle vehicle = new Vehicle(
        "Hyndai",
        "Elantra",
        4
);
```
I will start by creating an Engine object `engine`. To create the object, I need to create an int and a FuelType.
It's arguments are int for horsepower and FuelType for the type of fuel.
