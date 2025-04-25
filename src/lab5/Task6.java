package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (num < threshold) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        System.out.print("Введите пороговое значение: ");
        int threshold = scanner.nextInt();

        List<Integer> filtered = filterLessThan(numbers, threshold);
        System.out.println("Числа меньше " + threshold + ": " + filtered);
    }
}
