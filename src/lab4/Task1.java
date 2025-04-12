package lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int size;

        while (true) {
            try {
                System.out.print("Введите количество элементов массива: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    System.out.println("Количество элементов в массиве быть положительным числом");
                    continue;
                }
                numbers = new int[size];
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }

        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Введите элемент " + (i + 1) + ": ");
                    numbers[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число.");
                }
            }
        }

        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        try {
            int average = sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Положительные элементы отсутствуют");
        }
    }
}
