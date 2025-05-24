package lab7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите полный путь к файлу: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            System.out.println("Размер файла в байтах: " + fileSizeInBytes + " байт");
        } else {
            System.out.println("Файл не найден или указан неверный путь.");
        }
    }
}
