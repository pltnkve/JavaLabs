package lab8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindCompanyJSON {
    private static final String FILE_PATH = "src/lab8/employee.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя сотрудника для поиска: ");
        String searchName = scanner.nextLine();

        searchAndPrintEmployees(searchName);
    }

    public static void searchAndPrintEmployees(String nameToSearch) {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("Файл не найден.");
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject) parser.parse(reader);
            JSONArray employees = (JSONArray) data.get("employee");

            boolean found = false;

            for (Object obj : employees) {
                JSONObject employee = (JSONObject) obj;
                String name = (String) employee.get("name");

                if (name != null && name.equalsIgnoreCase(nameToSearch)) {
                    System.out.println("Имя: " + employee.get("name"));
                    System.out.println("Должность: " + employee.get("position"));
                    System.out.println("Отдел: " + employee.get("department"));
                    System.out.println("Зарплата: " + employee.get("salary"));
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Сотрудник с таким именем не найден.");
            }

        } catch (IOException | ParseException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
