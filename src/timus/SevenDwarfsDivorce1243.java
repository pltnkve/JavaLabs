package timus;

import java.util.Scanner;

public class SevenDwarfsDivorce1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число одинаковых вещей: ");
        long N = scanner.nextLong();

        System.out.println("Доля Белоснежки: " + (N % 7));
    }
}
