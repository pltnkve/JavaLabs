package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");

        List<Integer> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % divisor == 0) {
                result.add(n);
            }
        }

        System.out.println("Результат: " + result);
    }
}
