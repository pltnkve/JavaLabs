package lab4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int cols = matrix[0].length;

        int colNumber;

        while (true) {
            try {
                System.out.print("Введите номер столбца (от 1 до " + (cols) + "): ");
                colNumber = Integer.parseInt(scanner.nextLine());

                if (colNumber <= 0 || colNumber > cols) {
                    System.out.println("Ошибка: столбца с таким номером не существует.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }

        System.out.println("Столбец " + colNumber + ":");
        for (int[] num : matrix) {
            System.out.println(num[colNumber]);
        }
    }
}
