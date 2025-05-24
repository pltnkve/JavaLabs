package lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите полный путь к файлу: ");
        String filePath = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String targetWord = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            System.out.println("\nСтроки, содержащие слово \"" + targetWord + "\":\n");

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if (line.contains(targetWord)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Слово \"" + targetWord + "\" не найдено в файле.");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
