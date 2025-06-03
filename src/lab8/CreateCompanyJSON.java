package lab8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateCompanyJSON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "src/lab8/employee.json";

        JSONObject company = new JSONObject();
        JSONArray employees = new JSONArray();

        System.out.print("Введите имя сотрудника: ");
        String name = scanner.nextLine();

        System.out.print("Введите должность: ");
        String position = scanner.nextLine();

        System.out.print("Введите отдел: ");
        String department = scanner.nextLine();

        System.out.print("Введите зарплату: ");
        String salary = scanner.nextLine();

        JSONObject employee = new JSONObject();
        employee.put("name", name);
        employee.put("position", position);
        employee.put("department", department);
        employee.put("salary", salary);

        employees.add(employee);
        company.put("employee", employees);

        try (FileWriter file = new FileWriter(filePath)) {
            file.write(company.toJSONString());
            System.out.println("Данные успешно записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
