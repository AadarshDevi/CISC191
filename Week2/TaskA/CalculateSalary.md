# Calculate Salary

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Aug 31, 2025
- Assignment: Week 1 Lab 1

### Code Explanation

#### 1. MyClass.java
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

#### 2. TaxTableTools.java
```java
    /**
     * this method sets the new salary index and the percentages
     * @param newSearch the new array containing the new salary indexes
     * @param newValue the new array containing the new salary index percentage
     */
    public void setTables(int[] newSearch, double[] newValue) {
        this.search = newSearch;
        this.value = newValue;
        nEntries = search.length;
    }
```
- With setting the new values, it also updates `nEntries` to the new length of `search`.

### What to Submit
1. The flowchart of my thought process:
2. Flowchart as an image:
3. What were your challenges in performing the lab:
    - The hardest part of the lab was trying to understand it.
4. Code for the assignment
   - [IncomeTaxMain.java](IncomeTaxMain.java)
   - [TaxTableTools.java](TaxTableTools.java)
6. Video explaining code:
