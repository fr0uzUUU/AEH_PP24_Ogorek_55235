package pl.pp;
import java.io.*;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            try {
                System.out.print("Podaj ścieżkę do pliku wejściowego: ");
                String inputFile = scanner.nextLine();
                System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
                String outputFile = scanner.nextLine();

                // Wczytywanie pliku i liczenie linii
                int lineCount = countLines(inputFile);
                System.out.println("Liczba linii w pliku: " + lineCount);

                // Zapisywanie wyniku do pliku wyjściowego
                writeOutput(outputFile, inputFile, lineCount);

                done = true;  // Zakończ pętlę, jeśli wszystko poszło dobrze
            } catch (FileNotFoundException e) {
                System.out.println("Plik nie istnieje. Proszę podać inną ścieżkę.");
            } catch (IOException e) {
                System.out.println("Wystąpił błąd przy odczycie pliku: " + e.getMessage());
            }
        }
    }

    public static int countLines(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        return lines;
    }

    public static void writeOutput(String outputFile, String inputFile, int lineCount) throws IOException {
        PrintWriter writer = new PrintWriter(outputFile);
        writer.println("Plik: " + inputFile);
        writer.println("Liczba linii: " + lineCount);
        writer.close();
    }

}