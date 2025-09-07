package week_2.type_a;

import java.util.Scanner;

public class IncomeTaxMain {

    // Method to prompt for and input an integer
    public static int getInteger(Scanner input, String prompt) {
        int inputValue;

        System.out.print(prompt + ": ");
        inputValue = input.nextInt();

        return inputValue;
    } //

    // ***********************************************************************

    public static void main(String[] args) {
        final String PROMPT_SALARY = "\nEnter annual salary (-1 to exit)";
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;
        int i;

        int[] salary = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
        double[] taxTable = {0.0, 0.10, 0.20, 0.30, 0.40};

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

        // FIXME: Call a setter method in the TaxTableClass that supplies new
        //        tables for the class to work with. The method should be called
        //        with: table.setTables(salary, taxTable);

        // Get the first annual salary to process
        annualSalary = getInteger(scnr, PROMPT_SALARY);

        while (annualSalary >= 0) {
            taxRate = table.getValue(annualSalary);
            taxToPay = (int) (annualSalary * taxRate);     // Truncate tax to an integer amount
            System.out.println("Annual Salary: " + annualSalary +
                    "\tTax rate: " + taxRate +
                    "\tTax to pay: " + taxToPay);

            // Get the next annual salary
            annualSalary = getInteger(scnr, PROMPT_SALARY);
        }
    }
}