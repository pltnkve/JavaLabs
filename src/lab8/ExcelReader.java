package lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.Scanner;

public class ExcelReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            System.out.print("Введите путь к Excel-файлу: ");
            String filePath = scanner.nextLine();

            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException("Файл не найден по указанному пути.");
                }

                FileInputStream inputStream = new FileInputStream(file);
                Workbook workbook = new XSSFWorkbook(inputStream);

                System.out.print("Введите имя листа: ");
                String sheetName = scanner.nextLine();

                Sheet sheet = workbook.getSheet(sheetName);
                if (sheet == null) {
                    throw new IllegalArgumentException("Лист с таким именем не найден.");
                }

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();
                success = true;

            } catch (FileNotFoundException | IllegalArgumentException e) {
                System.out.println("[Ошибка]: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("[Ошибка при работе с файлом]: " + e.getMessage());
            }

            if (!success) {
                System.out.print("Попробовать снова? (да/нет): ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("yes")) {
                    System.out.println("Программа завершена.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
