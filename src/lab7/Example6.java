package lab7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example6 {
    public static void main(String[] args) {
        String inputFileName = "src/lab7/example_folder/input.txt";
        String outputFileName = "src/lab7/example_folder/output.txt";

        try (
                BufferedReader bufferedReader =
                        new BufferedReader(new FileReader(inputFileName));
                PrintWriter printWriter =
                        new PrintWriter(outputFileName, StandardCharsets.UTF_8)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
