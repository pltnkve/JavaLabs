package lab2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 100;
        int[] array = new int[size];
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.print("Массив случайных чисел: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы: ");

        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
