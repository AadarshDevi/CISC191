# Memory Management

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 14, 2025
- Assignment: Week 3 Lab

### Code Memory Management

For this lab I have created 4 classes:
1. `class MemoryManagement` (Main class)
2. `class Engine`
3. `enum FuelType`
4. `class Vehicle`

### Engine.java
```java
public Engine(int horsePower, FuelType fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
```

### FuelType
```java
public enum FuelType {
    PETROL,
    DIESEL,
    ELECTRICITY
}
```

### MemoryManagement.java
```java
Engine engine = new Engine(
        360,    
        FuelType.DIESEL
);
```

I will start by creating an Engine object `engine`. To create the object, I need to create an int and a FuelType.
It's arguments are int for horsepower and FuelType for the type of fuel.
