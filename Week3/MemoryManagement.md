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
public class MemoryManagement {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(
                "Hyndai",
                "Elantra",
                4
        );
    }
}
```
I will start by creating a Vehicle `vehicle`. To create the object, I need to create and pass a String for the
car company, one for the car model and, int for number of wheels.

When creating the vehicle, it first creates the 2 strings. String vehicleCompany and String vehicleModel.

<img width="80%" alt="image" src="https://github.com/AadarshDevi/CISC191/blob/main/Week3/compsci.png">
