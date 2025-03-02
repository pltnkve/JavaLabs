package timus;

import java.util.Scanner;

public class Elections1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число кандидатов: ");
        int N = scanner.nextInt();

        System.out.println("Введите число избирателей: ");
        int M = scanner.nextInt();

        int[] votes = new int[N];

        System.out.println("Далее, введите номера кандидатов, за кого проголосовал каждый из избирателей: ");

        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt();
            votes[candidate - 1]++;
        }

        for (int i = 0; i < N; i++) {
            double percentage = (votes[i] * 100.0) / M;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
