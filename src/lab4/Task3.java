package lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        while (true) {
            try {
                System.out.print("Введите количество элементов массива: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }

        byte[] array = new byte[size];

        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Введите элемент " + (i + 1) + " (от -128 до 127): ");
                    int value = Integer.parseInt(scanner.nextLine());

                    if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                        System.out.println("Ошибка: значение выходит за пределы типа byte.");
                        continue;
                    }

                    array[i] = (byte) value;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число.");
                }
            }
        }

        int sum = 0;
        for (byte b : array) {
            sum = Math.addExact(sum, b);
        }
        System.out.println("Сумма элементов массива: " + (byte)sum);
    }
}
