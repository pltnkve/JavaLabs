package lab6;

import java.util.Scanner;

public class Taxi1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        while (a < c) {
            a += b;
            c -= d;
        }

        System.out.println(a);
    }
}
