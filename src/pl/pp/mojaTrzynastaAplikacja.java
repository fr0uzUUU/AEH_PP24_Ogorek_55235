package pl.pp;
import java.io.*;
import java.util.Scanner;

public class mojaTrzynastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            try {
                System.out.print("Podaj ścieżkę do pliku wejściowego: ");
                String inputFile = scanner.nextLine();
                System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
                String outputFile = scanner.nextLine();

                // Wczytywanie pliku i liczenie słów
                int wordsCount = countWords(inputFile);
                System.out.println("Liczba słów w pliku: " + wordsCount);

                // Zapisywanie wyniku do pliku wyjściowego
                writeOutput(outputFile, inputFile, wordsCount);

                done = true;  // Zakończ pętlę, jeśli wszystko poszło dobrze
            } catch (FileNotFoundException e) {
                System.out.println("Plik nie istnieje. Proszę podać inną ścieżkę.");
            } catch (IOException e) {
                System.out.println("Wystąpił błąd przy odczycie pliku: " + e.getMessage());
            }
        }
    }
    public  static  int countWords(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int wordsCount = 0;
        line = line.toLowerCase();
        while((line = reader.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split("");
            //Counts each word
            wordsCount = wordsCount + words.length;
        }
        return wordsCount;
    }

    public static void writeOutput(String outputFile, String inputFile, int wordsCount) throws IOException {
       PrintWriter writer = new PrintWriter(outputFile);
        writer.println("Plik: " + inputFile);
        writer.println("Liczba słów: " + wordsCount);
        writer.close();
    }

}