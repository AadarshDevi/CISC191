## Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 14, 2025
- Assignment: Week 3 Lab

## Code
The lab was to take data in the format parkyear_photo.jpg from ParkPhotos.txt and convert it to parkyear_info.txt and then write it back to ParkPhotos.txt 

### Step 1: Read and Store Data
```java
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
```

### Step 2: Convert and Write Data
```java
// stops app from continuing because data is already converted
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
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](memeory_management_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](memeory_management_flowchart_image.png)
3. What were your challenges in performing the lab:
   - When reading converted data, the data was completely erased.
       - FIX: forgot to end program before writing when the data read was in the right format.
5. Code for the assignment: [FileDataConvertion.java](FileDataConvertion.java)
6. Video explaining code: TODO: [Video Explanation Attempt](https://youtu.be/NnARx5_zi9s)
