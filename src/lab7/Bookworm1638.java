package lab7;

import java.util.Scanner;

public class Bookworm1638 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = scanner.nextInt();
        int cover = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start == end) {
            System.out.println(0);
            return;
        }

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int volumesBetween = end - start - 1;

        int total =
                pages * volumesBetween +
                        cover * ((end - start + 1) * 2 - 2);

        System.out.println(total);
    }
}
