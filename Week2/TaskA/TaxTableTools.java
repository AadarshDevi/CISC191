package week_2.type_a;

public class TaxTableTools {

    /**
     * This class searches the 'search' table with a search argument and
     * returns the corresponding value in the 'value' table. Variable
     * 'nEntries' has the number of entries in each table.
     */
    private int[] search = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
    private double[] value = {0.0, 0.10, 0.20, 0.30, 0.40};
    private int nEntries;

    // ***********************************************************************

    // Default constructor
    public TaxTableTools() {
        nEntries = search.length;  // Set the length of the search table
    }

    // ***********************************************************************

    // FIXME: Write a void setter method that sets new values for the private
    //        search and value tables. Name the method: setTables
    //        The method receives as parameters tables from which to load the
    //        search and value tables.

    // ***********************************************************************

    /**
     *  this method sets the new salary index and the percentages
     * @param newSearch the new array containing the new salary indexes
     * @param newValue the new array containing the new salary index percentage
     */
    public void setTables(int[] newSearch, double[] newValue) {
        this.search = newSearch;
        this.value = newValue;
        nEntries = search.length;
    }

    // Method to get a value from one table based on a range in the other table

    public double getValue(int searchArgument) {
        double result;
        boolean keepLooking;
        int i;

        result = 0.0;
        keepLooking = true;
        i = 0;

        while ((i < nEntries) && keepLooking) {
            if (searchArgument <= search[i]) {
                result = value[i];
                keepLooking = false;
            } else {
                ++i;
            }
        }

        return result;
    }
}