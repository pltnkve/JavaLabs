package lab8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveCompanyJSON {
    private static final String FILE_PATH = "src/lab8/employee.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя сотрудника для удаления: ");
        String nameToDelete = scanner.nextLine();

        deleteEmployeeByName(nameToDelete);
    }

    public static void deleteEmployeeByName(String nameToDelete) {
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

            Iterator<Object> iterator = employees.iterator();
            while (iterator.hasNext()) {
                JSONObject employee = (JSONObject) iterator.next();
                String name = (String) employee.get("name");

                if (name != null && name.equalsIgnoreCase(nameToDelete)) {
                    iterator.remove();
                    found = true;
                }
            }

            if (found) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(data.toJSONString());
                    System.out.println("Сотрудник с именем \"" + nameToDelete + "\" удален.");
                }
            } else {
                System.out.println("Сотрудник с таким именем не найден.");
            }

        } catch (IOException | ParseException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
