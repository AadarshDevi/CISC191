## Basic Info
- Author: Aadarsh Devi
- Submission Date: Sep 21, 2025
- Assignment: Honors Lab 2

## Code
The Lab is asking to anaylize some text document and get a list of words and their frequencies.

### Step 1: Getting the .txt file
```java
// get filepath of file
boolean validFile = false;
String filepath = "";
Scanner scanner = new Scanner(System.in);

do {
    System.out.print("Enter Filepath: ");
    filepath = scanner.nextLine();

    if (filepath.equals("end")) System.exit(0);

    if (new File(filepath).exists()) {
        if (filepath.endsWith(".txt")) validFile = true;
        else System.err.println("File is not a Text file. Please try again");

    } else System.err.println("File does not exist. Please try again");
    Thread.sleep(100);

} while (!validFile);
System.out.println("Filepath exists: " + filepath);
```

### Step 2: Read the text file
```java
// Reading file and getting words
HashMap<String, Integer> hashMap = new HashMap<>();
try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
    String dataline;

    while ((dataline = bufferedReader.readLine()) != null) {
        dataline = dataline.replaceAll("[.,:;!?_—-]", "");
        String[] words = dataline.split(" ");

        for (String string : words) {
            if (string.isBlank()) continue;
            else if (!hashMap.containsKey(string.toLowerCase())) hashMap.put(string.toLowerCase(), 1);
            else hashMap.put(string.toLowerCase(), hashMap.get(string.toLowerCase()) + 1);
        }
    }
} catch (FileNotFoundException e) {
    System.err.println("The file in filepath not found: " + filepath);
} catch (IOException e) {
    System.err.println("Input problem with bufferedReader.");
}
```

### Step 3: Request Data
```java
// Ask/Print all words and their frequency
boolean printing = true;
do {
    System.out.print("Enter word to get frequency (#list for all words and frequency): ");
    String word = scanner.nextLine();

    if (word.equals("#list")) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("%15s: %-3d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("Unique words: " + hashMap.size());
        continue;
    } else if (word.equals("#end")) {
        printing = false;
        continue;
    }

    if (!hashMap.containsKey(word.toLowerCase())) {
        System.out.println("Word \"" + word + "\" is not in the list.");
        continue;
    }

    Integer frequency = hashMap.get(word.toLowerCase());
    System.out.printf("%15s:%-3d\n", word, frequency);

} while (printing);
```

### End of Program
```java
System.out.println("\n------------------\n End of Program \n------------------");
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](file_input_output_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](file_input_output_flowchart_image_big.png)
3. What were your challenges in performing the lab:
   - When reading converted data, the data was completely erased.
       - FIX: forgot to end program before writing when the data read was in the right format.
5. Code for the assignment: [FileDataConvertion.java](DocumentAnalyzer.java)
6. Video explaining code: TODO: [Video Explanation](https://youtu.be/CvtG2DfcyG0)
