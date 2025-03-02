package timus;

import java.util.Scanner;

public class HistoryExam1196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество записей в списке преподавателя: ");
        int N = scanner.nextInt();

        System.out.println("Последовательно введите даты из списка преподавателя: ");

        int[] teachersDates = new int[N];

        for (int i = 0; i < N; i++) {
            teachersDates[i] = scanner.nextInt();
        }

        System.out.println("Введите количество записей в списке студента: ");
        int M = scanner.nextInt();

        System.out.println("Последовательно введите даты из списка студента: ");

        int[] studentsDates = new int[M];

        for (int i = 0; i < M; i++) {
            studentsDates[i] = scanner.nextInt();
        }

        int matchCount = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (teachersDates[j] == studentsDates[i]) {
                    matchCount++;
                }
            }
        }

        System.out.println("Студент знает " + matchCount + " даты");
    }
}
