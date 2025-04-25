package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static List<String> filterOnlyLetters(List<String> input) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.matches("[a-zA-Zа-яА-Я]+")) {
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

        List<String> filtered = filterOnlyLetters(inputList);
        System.out.println("Только строки с буквами: " + filtered);
    }
}
