package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<String> filterByLength(List<String> input, int minLength) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.length() > minLength) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через пробел:");
        String[] inputArray = scanner.nextLine().split(" ");
        List<String> inputList = Arrays.asList(inputArray);

        System.out.print("Введите минимальную длину строки: ");
        int minLength = scanner.nextInt();

        List<String> filtered = filterByLength(inputList, minLength);
        System.out.println("Строки длиннее " + minLength + ": " + filtered);
    }
}
