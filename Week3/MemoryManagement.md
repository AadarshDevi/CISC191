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

After creating the 2 Strings, an int is created for `wheelCount`. Since all the variables
created are fields of the Vehicle class, they are created in the heap.

After the arguments are passed, the vehicle object is created. Since vehicle is an object,
it is created in the heap with a reference variable in the stack.

When `vehicle.information()` is called, it takes in the vehicleComapny and vehicleModel
and creates a new String object in the stack because it is a temporary variable.

### What to Submit
1. The flowchart of my thought process: [Draw.io file](memeory_management_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](memeory_management_flowchart_image.png)
3. What were your challenges in performing the lab:
   - Understanding heap and stack because I am still confused about it.
   - I went around few websites, videos and articles but I have been struggling.
5. Code for the assignment
   - [IncomeTaxMain.java](MemoryManagement.java)
   - [TaxTableTools.java](Vehicle.java)
6. Video explaining code: TODO: LINK IT
