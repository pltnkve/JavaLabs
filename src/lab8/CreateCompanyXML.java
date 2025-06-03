package lab8;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class CreateCompanyXML {
    public static void main(String[] args) {
        String filePath = "src/lab8/employee.xml";
        File xmlFile = new File(filePath);

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ФИО сотрудника: ");
            String name = scanner.nextLine();

            System.out.print("Введите должность: ");
            String position = scanner.nextLine();

            System.out.print("Введите отдел: ");
            String department = scanner.nextLine();

            System.out.print("Введите зарплату: ");
            String salary = scanner.nextLine();

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc;
            Element rootElement;

            if (xmlFile.exists()) {
                doc = docBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                doc = docBuilder.newDocument();
                rootElement = doc.createElement("company");
                doc.appendChild(rootElement);
            }

            Element employee = doc.createElement("employee");

            Element empName = doc.createElement("name");
            empName.appendChild(doc.createTextNode(name));
            employee.appendChild(empName);

            Element empPosition = doc.createElement("position");
            empPosition.appendChild(doc.createTextNode(position));
            employee.appendChild(empPosition);

            Element empDepartment = doc.createElement("department");
            empDepartment.appendChild(doc.createTextNode(department));
            employee.appendChild(empDepartment);

            Element empSalary = doc.createElement("salary");
            empSalary.appendChild(doc.createTextNode(salary));
            employee.appendChild(empSalary);

            rootElement.appendChild(employee);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);

            transformer.transform(source, result);

            System.out.println("Новый сотрудник успешно добавлен в файл!");

        } catch (Exception e) {
            System.out.println("Ошибка при работе с XML: " + e.getMessage());
        }
    }
}