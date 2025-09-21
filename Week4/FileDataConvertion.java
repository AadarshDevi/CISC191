
import java.io.*;
import java.util.ArrayList;

public class FileDataConvertion {

    public static void main(String[] args) {

        System.out.println("CISC 191 Week 4 Lab: Input and Output");

        // This is the file containing the names of the photos.
        File file = new File("src/main/java/week_4/ParkPhotos.txt");

        boolean dataConverted = false;

        // stores information
        ArrayList<String> parkNames = new ArrayList<>();

        // try-with-resources: automatically closes reader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line; // this is the line from PhotoParks.txt

            // reads and checks if the line is not null
            while ((line = bufferedReader.readLine()) != null) {

                // checks if data is already converted
                if (line.contains("_info.txt")) {
                    System.err.println("Data already converted");
                    dataConverted = true;
                    break;
                }

                // adds data to list
                parkNames.add(line);
            }

        } catch (IOException e) {
            System.err.println("Input problem with reader");
        }

        // stops app from ending because already converted data
        if(dataConverted) System.exit(0);

        // try-with-resources: automatically closes writer
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            // writes all data
            for (String parkName : parkNames) {
                bufferedWriter.write(
                        parkName // the original line from ParkPhotos.txt
                                .substring(
                                        0, // from (inclusive)
                                        parkName.indexOf("_photo.jpg") // till (exclusive)
                                )
                                .concat("_info.txt\n") // add "_info.txt" to the substring
                );
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Index is -1");
            System.exit(0);
        } catch (IOException e) {
            System.err.println("Output problem with writer");
        }
    }
}
