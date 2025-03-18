package lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encrypted = CaesarCipher(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            System.out.println("Расшифрованный текст: " + CaesarCipher(encrypted, -key));
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    private static String CaesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            result.append(Character.isLetter(ch) ? (char) (ch + shift) : ch);
        }
        return result.toString();
    }
}
