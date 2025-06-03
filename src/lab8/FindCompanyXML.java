package lab8;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;

public class FindCompanyXML {

    public static void main(String[] args) throws Exception {
        File file = new File("src/lab8/employee.xml");
        Scanner scanner = new Scanner(System.in);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("employee");

        List<Element> employees = IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .toList();


        System.out.print("Введите имя сотрудника: ");
        String searchName = scanner.nextLine();

        List<Element> result = employees.stream()
                .filter(emp -> {
                    String name = emp.getElementsByTagName("name").item(0).getTextContent();
                    return name.equalsIgnoreCase(searchName);
                })
                .toList();

        if (!result.isEmpty()) {
            System.out.println("Найденные сотрудники:");
            for (Element emp : result) {
                System.out.println("Имя: " + emp.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Должность: " + emp.getElementsByTagName("position").item(0).getTextContent());
                System.out.println("Отдел: " + emp.getElementsByTagName("department").item(0).getTextContent());
                System.out.println("Зарплата: " + emp.getElementsByTagName("salary").item(0).getTextContent());
                System.out.println();
            }
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}