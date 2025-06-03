package lab8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParser {
    private static final String URL = "http://fat.urfu.ru/index.html";
    private static final String OUTPUT_FILE = "src/lab8/news_output.txt";

    public static void main(String[] args) {
        Document doc = null;

        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                System.out.println("Попытка " + attempt + " подключиться к сайту...");
                doc = Jsoup.connect(URL).get();
                break;
            } catch (IOException e) {
                System.err.println("Ошибка подключения: " + e.getMessage());
                if (attempt < 3) {
                    System.out.println("Повторная попытка через 2 секунды...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ignored) {}
                } else {
                    System.err.println("Не удалось подключиться после 3 попыток.");
                    return;
                }
            }
        }

        try {
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {

                System.out.println("Новости с сайта:");
                writer.write("=== Новости с сайта ===\n");

                for (int i = 3; i < 20; i++) {
                    if (i % 2 == 0) {
                        List<Node> nodes = newsParent.get(i).childNodes();
                        Element titleElement = ((Element) nodes.getFirst())
                                .getElementsByClass("blocktitle")
                                .getFirst();
                        Element dateElement = ((Element) nodes.getFirst())
                                .getElementsByClass("blockdate")
                                .getFirst();

                        if (titleElement != null && dateElement != null) {
                            String title = titleElement.childNodes().getFirst().toString();
                            String date = dateElement.childNodes().getFirst().toString();

                            System.out.println("Тема: " + title);
                            System.out.println("Дата: " + date);
                            System.out.println("\n");

                            writer.write("Тема: " + title + "\n");
                            writer.write("Дата: " + date + "\n");
                            writer.write("\n");
                        }
                    }
                }

                System.out.println("Данные успешно записаны в файл: " + OUTPUT_FILE);

            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Произошла ошибка при обработке данных: " + e.getMessage());
        }
    }
}