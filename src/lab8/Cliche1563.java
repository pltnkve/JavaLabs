package lab8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliche1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        Set<String> visited = new HashSet<>();
        int clicheCount = 0;

        for (int i = 0; i < N; i++) {
            String shop = scanner.nextLine();
            if (visited.contains(shop)) {
                clicheCount++;
            } else {
                visited.add(shop);
            }
        }

        System.out.println(clicheCount);
    }
}
