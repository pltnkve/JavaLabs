package lab8;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Scanner;

public class RemoveCompanyXML {

    private static final String FILE_PATH = "src/lab8/employee.xml";

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

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("employee");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element employee = (Element) node;
                    String name = employee.getElementsByTagName("name").getLength() > 0 ?
                            employee.getElementsByTagName("name").item(0).getTextContent() : "";

                    if (name.equalsIgnoreCase(nameToDelete)) {
                        node.getParentNode().removeChild(node);
                        System.out.println("Сотрудник с именем \"" + nameToDelete + "\" удален.");

                        saveXMLToFile(doc, file);
                        return;
                    }
                }
            }

            System.out.println("Сотрудник с таким именем не найден.");

        } catch (Exception e) {
            System.out.println("Ошибка при работе с XML: " + e.getMessage());
        }
    }

    private static void saveXMLToFile(Document doc, File file) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);

        transformer.transform(source, result);
    }
}