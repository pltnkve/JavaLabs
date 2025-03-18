package lab2.timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spammer1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сабмитов: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        List<String> accounts = new ArrayList<>();
        List<String> spammers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String account = scanner.nextLine();

            if (accounts.contains(account)) {
                if (!spammers.contains(account)) {
                    spammers.add(account);
                }
            } else {
                accounts.add(account);
            }
        }

        if (spammers.isEmpty()) {
            System.out.println("Спамеров не обнаружено");
        } else {
            for (String spammer : spammers) {
                System.out.println(spammer);
            }
        }
    }
}
