package lab2.timus;

import java.util.Scanner;

public class OneStepFromHappiness1493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета: ");
        int ticket = scanner.nextInt();

        System.out.println(isLucky(ticket - 1) || isLucky(ticket + 1) ? "Yes" : "No");
    }

    private static boolean isLucky(int num) {
        String ticket = Integer.toString(num);
        int sum1 = (ticket.charAt(0) - '0') + (ticket.charAt(1) - '0') + (ticket.charAt(2) - '0');
        int sum2 = (ticket.charAt(3) - '0') + (ticket.charAt(4) - '0') + (ticket.charAt(5) - '0');
        return sum1 == sum2;
    }
}
