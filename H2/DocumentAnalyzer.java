
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DocumentAnalyzer {
    public static void main(String[] args) throws InterruptedException {

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

        System.out.println("\n------------------\n End of Program \n------------------");
    }
}
