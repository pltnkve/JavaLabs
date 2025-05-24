package lab7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите полный путь к файлу для записи: ");
        String filePath = scanner.nextLine();

        System.out.print("Введите текст, который нужно записать в файл: ");
        String textToWrite = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(textToWrite);
            System.out.println("Текст успешно записан в файл: " + filePath);
            System.out.println("Количество записанных символов: " + textToWrite.length());

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
