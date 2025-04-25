package lab5;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> filterBySubstring(List<String> input, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : input) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "banana", "grape", "pineapple", "apricot");
        String substring = "ple";

        List<String> filtered = filterBySubstring(inputList, substring);
        System.out.println(filtered);
    }
}
