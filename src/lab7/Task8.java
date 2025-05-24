package lab7;

import java.io.*;

public class Task8 {
    public static void main(String[] args) {
        String fileName = "person.ser";

        Person person = new Person("Egor", 22, "egor@example.com");
        System.out.println("Оригинальный объект:");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(person);
            System.out.println("\nОбъект успешно сериализован в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Person restoredPerson = (Person) in.readObject();
            System.out.println("\nОбъект восстановлен из файла:");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());
            System.out.println("Email: " + restoredPerson.getEmail());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
