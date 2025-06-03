package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamWork1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < N) {
            int count = 1;

            while ((i + count < N) && (numbers[i + count] == numbers[i])) {
                count++;
            }

            result.add(count);
            result.add(numbers[i]);

            i += count;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
