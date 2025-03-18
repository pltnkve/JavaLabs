package lab2.timus;

import java.util.Scanner;

public class TwoBandits1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество банок, простреленных Гарри: ");
        int harry = scanner.nextInt();
        System.out.println("Введите количество банок, простреленных Ларри: ");
        int larry = scanner.nextInt();

        int total = harry + larry - 1;

        System.out.println("Гарри не прострелил " + (total - harry) + " банок");
        System.out.println("Ларри не прострелил " + (total - larry) + " банок");
    }
}
