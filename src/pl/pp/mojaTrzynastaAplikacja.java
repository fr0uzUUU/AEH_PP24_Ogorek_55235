package pl.pp;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mojaTrzynastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the input file: ");
        String inputPath = scanner.nextLine();
        System.out.print("Enter the path to the output file: ");
        String outputPath = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(inputPath);

        if (wordCounts != null) {
            writeResults(outputPath, inputPath, wordCounts);
        } else {
            System.out.println("Please try again with a valid file path.");
        }
    }

    private static Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();
        try {
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                String word = fileReader.next();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            fileReader.close();
            System.out.println("Total words: " + wordCount.size());
            return wordCount;
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + filePath + " does not exist.");
            return null;
        }
    }

    private static void writeResults(String outputPath, String inputPath, Map<String, Integer> wordCounts) {
        try {
            PrintWriter writer = new PrintWriter(outputPath, "UTF-8");
            writer.println("File: " + inputPath);
            writer.println("Total unique words: " + wordCounts.size());
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The output file path " + outputPath + " is not valid.");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: Unsupported encoding exception.");
        }
    }

}