package lab3.timus;

import java.util.Scanner;

public class SMSSpam1567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        int cost = 0;

        for (char ch : string.toCharArray()) {
            switch (ch) {
                case 'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', '.', ' ' -> cost++;
                case 'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ',' -> cost = cost + 2;
                case 'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!' -> cost = cost + 3;
            }
        }

        System.out.println(cost);
    }
}
