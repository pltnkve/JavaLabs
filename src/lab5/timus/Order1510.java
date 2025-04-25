package lab5.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order1510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            countMap.put(k, countMap.getOrDefault(k, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
