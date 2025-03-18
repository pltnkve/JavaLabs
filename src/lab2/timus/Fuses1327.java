package lab2.timus;

import java.util.Scanner;

public class Fuses1327 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер первого рабочего дня: ");
        int A = scanner.nextInt();

        System.out.println("Введите номер последнего рабочего дня: ");
        int B = scanner.nextInt();

        int fusesCount = 0;
        for (int day = A; day <= B; day++) {
            if (day % 2 == 1) {
                fusesCount++;
            }
        }

        System.out.println(fusesCount);
    }
}
