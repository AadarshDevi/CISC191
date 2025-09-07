# Calculate Salary

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1 Lab 1

### Code Explanation

**`MyClass.java`**
```java
// Access the related class
TaxTableTools table = new TaxTableTools();

/*
 * Creating new arrays for the salaries and tax table because
 * I have more elements in my array
 */
int[] newSalary = {0, 12000, 15000, 25000, 40000, Integer.MAX_VALUE};
double[] newTaxTable = {0.0, 0.1, 0.15, 0.2, 0.35, 0.4};

// setting the new salary and taxTable
table.setTables(newSalary, newTaxTable);
```
