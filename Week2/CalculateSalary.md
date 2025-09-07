# Calculate Salary

### Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 7, 2025
- Assignment: Week 2 Lab

## Task A
### Code Explanation

#### 1. MyClass.java
```java
    // Access the related class
    TaxTableTools table = new TaxTableTools();
    
    /*
     * Creating new arrays for the new salaries and tax table because
     * I have more elements in my array
     */
    salary = new int[] {0, 12000, 15000, 25000, 40000, Integer.MAX_VALUE};
    taxTable = new double[] {0.0, 0.1, 0.15, 0.2, 0.35, 0.4};
    
    
    // FIXME: Call a setter method in the TaxTableClass that supplies new
    //        tables for the class to work with. The method should be called
    //        with: table.setTables(salary, taxTable);
    
    // setting the new salary and taxTable
    table.setTables(salary, taxTable);
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
1. The flowchart of my thought process: [Draw.io file](TaskA/task_a_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](TaskA/task_a_flowchart_image.png)
3. What were your challenges in performing the lab:
    - The hardest part of the lab was trying to understand it.
4. Code for the assignment
   - [IncomeTaxMain.java](TaskA/IncomeTaxMain.java)
   - [TaxTableTools.java](TaskA/TaxTableTools.java)
6. Video explaining code:

## Task B
### Code Explanation

#### TaxTableTools.java
```java

    // ***********************************************************************

    // Overloaded constructor

    // FIXME: Add an overloaded constructor to load the search and value tables.
    // FIXME: Be sure to set the nEntries value, too.

    // ***********************************************************************
    public TaxTableTools(int[] search, double[] value) {
        this.search = search; // sets the search array to the reference of the new search array
        this.value = value; // sets the value array to the reference of the new value array
        nEntries = search.length; // setting the nEntries to the length of new search
    }

```

### What to Submit
1. The flowchart of my thought process: [Draw.io file](TaskB/task_b_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](TaskB/task_b_flowchart_image.png)
3. What were your challenges in performing the lab: I did not have much to think about. It was straight forward.
4. Code for the assignment
   - [IncomeTaxMain.java](TaskB/IncomeTaxMain.java)
   - [TaxTableTools.java](TaskB/TaxTableTools.java)
6. Video explaining code:
